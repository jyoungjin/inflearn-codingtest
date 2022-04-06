package section2;

import java.util.Scanner;

/* 9. 격자판 최대합 */
public class section2_9 {

    public int solution(int n, int[][] arr) {

        int answer = 0;
        int max = 0;
        int cross1 = 0;
        int cross2 = 0;

        for (int i = 0; i < n; i++) {
            int sum1 = 0;
            int sum2 = 0;
            for (int j = 0; j < n; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            int rowMax = Math.max(sum1, sum2);
            max = Math.max(max, rowMax);
        }

        for (int i = 0; i < n; i++) {
            cross1 += arr[i][i];
            cross2 += arr[i][n - i - 1];
        }

        int crossMax = Math.max(cross1, cross2);

        answer = Math.max(max, crossMax);

        return answer;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        section2_9 T = new section2_9();

        System.out.print(T.solution(n, arr));

    }
}

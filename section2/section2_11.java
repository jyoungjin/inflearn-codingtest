package section2;

import java.util.Scanner;

/* 11. 임시반장 정하기 */
public class section2_11 {

    public int solution(int n, int[][] arr) {

        int answer = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 5; k++) {
                    if (arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt > max) {
                max = cnt;
                answer = i + 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] arr = new int[n][5];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        section2_11 T = new section2_11();

        System.out.print(T.solution(n, arr));

    }
}

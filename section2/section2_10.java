package section2;

import java.util.Scanner;

/* 10. 봉우리 */
public class section2_10 {

    public int solution(int n, int[][] arr) {

        int answer = 0;

        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < n+1; j++) {
                int x = arr[i][j];
                if(x > arr[i-1][j] && x > arr[i+1][j] && x>arr[i][j-1] && x>arr[i][j+1])
                    answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] arr = new int[n+2][n+2];

        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < n+1; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        section2_10 T = new section2_10();

        System.out.print(T.solution(n, arr));

    }
}

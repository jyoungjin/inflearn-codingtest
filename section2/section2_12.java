package section2;

import java.util.Scanner;

/* 12. 멘토링 */
public class section2_12 {

    public int solution(int n, int m, int[][] arr) {

        int answer = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int cnt = 0;
                for (int k = 0; k < m; k++) {
                    int pi=0;
                    int pj=0;
                    for (int s = 0; s < n; s++) {
                        if(arr[k][s]==i+1)
                            pi = s;
                        if(arr[k][s]==j+1)
                            pj = s;
                    }
                    if (pi < pj) {
                        cnt++;
                    }
                }
                if (cnt == m) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        section2_12 T = new section2_12();

        System.out.print(T.solution(n, m, arr));

    }
}

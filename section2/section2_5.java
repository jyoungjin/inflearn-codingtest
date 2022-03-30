package section2;

import java.util.Scanner;

/* 5. 소수(에라토스테네스 체) */
public class section2_5 {

    public int solution(int n) {

        int answer = 0;

        int[] arr = new int[n+1];

        for (int i = 2; i <= n; i++) {
            if (arr[i] == 0) {
                answer++;
                for (int j = i; j <= n; j = j + i) {
                    arr[j] = 1;
                }
            }
        }


        return answer;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        section2_5 T = new section2_5();
        System.out.print(T.solution(n));

    }
}

package section3;

import java.util.Scanner;

/* 5. 연속된 자연수의 합 */
public class section3_5 {
    public int solution(int n) {

        int answer = 0;
        int sum = 0;
        int lt = 1;

        for (int i = 1; i <= n/2+1; i++) {
            sum += i;
            while (sum > n) {
                sum -= lt;
                lt++;
            }
            if (sum == n) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        section3_5 T = new section3_5();
        System.out.println(T.solution(n));

    }
}

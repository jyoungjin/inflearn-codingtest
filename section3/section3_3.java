package section3;

import java.util.Scanner;

/* 3. 최대 매출(Sliding window) */
public class section3_3 {
    public int solution(int n, int k, int[] arr) {

        int answer = Integer.MIN_VALUE;

        for (int i = 0; i < n - k + 1; i++) {
            int sum = 0;
            for (int j = 0; j < k; j++) {
                sum += arr[i + j];
            }
            if (sum > answer) {
                answer = sum;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        section3_3 T = new section3_3();
        System.out.println(T.solution(n, k, arr));

    }
}

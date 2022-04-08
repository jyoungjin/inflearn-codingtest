package section3;

import java.util.Arrays;
import java.util.Scanner;

/* 3. 최대 매출(Sliding window) */
public class section3_3_pro {
    public int solution(int n, int k, int[] arr) {

        int answer = 0;
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        answer = answer;

        for (int i = k; i < n - k + 1; i++) {
            sum = sum - arr[i - k] + arr[i];
            answer = Math.max(sum, answer);
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

        section3_3_pro T = new section3_3_pro();
        System.out.println(T.solution(n, k, arr));

    }
}

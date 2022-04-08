package section3;

import java.util.Scanner;

/* 4. 연속 부분수열 */
public class section3_4 {
    public int solution(int n, int k, int[] arr) {

        int answer = 0;
        int sum = 0;
        int lt = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == k) {
                answer++;
            }else if(sum>k){
                while (sum >= k) {
                    if (sum == k) {
                        answer++;
                    }
                    sum -= arr[lt++];
                }
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

        section3_4 T = new section3_4();
        System.out.println(T.solution(n, k, arr));

    }
}

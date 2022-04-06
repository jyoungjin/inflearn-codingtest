package section2;

import java.util.Scanner;

/* 7. 점수계산 */
public class section2_7 {

    public int solution(int n, int[] arr) {

        int answer = 0;
        int val = 1;

        for (int x : arr) {
            if (x == 1) {
                answer += val;
                val++;
            } else {
                val = 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        section2_7 T = new section2_7();
        System.out.print(T.solution(n, arr));

    }
}

package section2;

import java.util.Scanner;

/* 8. 등수구하기 */
public class section2_8 {

    public int[] solution(int n, int[] arr) {

        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = 0; j < n; j++) {
                if (arr[i] < arr[j]) {
                    cnt++;
                }
            }
            answer[i] = cnt;
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

        section2_8 T = new section2_8();

        for (int x : T.solution(n, arr)) {
            System.out.print(x+" ");
        }

    }
}

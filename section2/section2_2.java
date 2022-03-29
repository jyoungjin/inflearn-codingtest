package section2;

import java.util.ArrayList;
import java.util.Scanner;

/* 2. 보이는 학생 */
public class section2_2 {
    public int solution(int n, int[] arr) {

        int answer = 0;
        int tmp = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > tmp) {
                answer++;
                tmp = arr[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        section2_2 T = new section2_2();
        System.out.print(T.solution(n, arr));

    }
}

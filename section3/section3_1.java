package section3;

import java.util.Arrays;
import java.util.Scanner;

/* 1. 두 배열 합치기(two pointers algorithm) */
public class section3_1 {
    public int[] solution(int n, int[] arr1, int m, int[] arr2) {

        int[] answer = new int[n+m];

        for (int i = 0; i < n; i++) {
            answer[i] = arr1[i];
        }
        for (int i = 0; i < m; i++) {
            answer[i+n] = arr2[i];
        }

        Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = scan.nextInt();
        }

        int m = scan.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = scan.nextInt();
        }

        section3_1 T = new section3_1();
        for (int x : T.solution(n, arr1, m, arr2)) {
            System.out.print(x+" ");
        }

    }
}

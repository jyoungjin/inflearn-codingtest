package section3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/* 2. 공통원소 구하기(two pointers algorithm */
public class section3_2 {
    public ArrayList<Integer> solution(int n, int[] arr1, int m, int[] arr2) {

        ArrayList<Integer> answer = new ArrayList<>();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int pi = 0, pj = 0;
        while (pi < n && pj < m) {
            if (arr1[pi] < arr2[pj]) {
                pi++;
            } else if (arr1[pi] > arr2[pj]) {
                pj++;
            } else {
                answer.add(arr1[pi]);
                pi++;
                pj++;
            }
        }

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

        section3_2 T = new section3_2();
        for (int x : T.solution(n, arr1, m, arr2)) {
            System.out.print(x+" ");
        }

    }
}

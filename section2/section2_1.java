package section2;

import java.util.ArrayList;
import java.util.Scanner;

/* 1. 큰 수 출력하기 */
public class section2_1 {
    public ArrayList<Integer> solution(int n, int[] arr) {

        ArrayList<Integer> answer = new ArrayList<>();
        int tmp = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > tmp) {
                answer.add(arr[i]);
            }
            tmp = arr[i];
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

        section2_1 T = new section2_1();
        for (int x : T.solution(n, arr)) {
            System.out.print(x+" ");
        }

    }
}

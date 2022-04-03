package section2;

import java.util.ArrayList;
import java.util.Scanner;

/* 6. 뒤집은 소수 */
public class section2_6 {

    public boolean isSosu(String x) {
        boolean flag = true;

        int sosu = Integer.valueOf(x);

        if (sosu < 2) {
            return false;
        }

        for (int i = 2; i < sosu/2; i++) {
            if (sosu % i == 0) {
                return false;
            }
        }

        return flag;
    }

    public ArrayList<Integer> solution(int n, String[] arr) {

        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new StringBuilder(arr[i]).reverse().toString();
        }

        for (String x : arr) {
            if (isSosu(x)) {
                answer.add(Integer.valueOf(x));
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.next();
        }

        section2_6 T = new section2_6();
        for (int x : T.solution(n, arr)) {
            System.out.print(x + " ");
        }

    }
}

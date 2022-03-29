package section2;

import java.util.ArrayList;
import java.util.Scanner;

/* 4. 피보나치 수열 */
public class section2_4 {
    public ArrayList<Integer> solution(int n) {

        ArrayList<Integer> answer = new ArrayList<>();

        answer.add(1);
        answer.add(1);

        for (int i = 2; i < n; i++) {
            answer.add(answer.get(i-2)+answer.get(i-1));
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        section2_4 T = new section2_4();
        for (int x : T.solution(n)) {
            System.out.print(x+" ");
        }

    }
}

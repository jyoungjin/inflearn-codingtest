package section2;

import java.util.ArrayList;
import java.util.Scanner;

/* 3. 가위바위보 */
public class section2_3 {
    public ArrayList<Character> solution(int n, int[] user1, int[] user2) {

        ArrayList<Character> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (user1[i] == 1) {
                if (user2[i] == 1) {
                    answer.add('D');
                } else if (user2[i] == 2) {
                    answer.add('B');
                } else {
                    answer.add('A');
                }
            } else if (user1[i] == 2) {
                if (user2[i] == 2) {
                    answer.add('D');
                } else if (user2[i] == 1) {
                    answer.add('A');
                } else {
                    answer.add('B');
                }
            } else {
                if (user2[i] == 3) {
                    answer.add('D');
                } else if (user2[i] == 1) {
                    answer.add('B');
                } else {
                    answer.add('A');
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] user1 = new int[n];
        int[] user2 = new int[n];
        for (int i = 0; i < n; i++) {
            user1[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            user2[i] = scan.nextInt();
        }

        section2_3 T = new section2_3();
        for (char x : T.solution(n, user1, user2)) {
            System.out.println(x);
        }

    }
}

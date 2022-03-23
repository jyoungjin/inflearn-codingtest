package section1;

import java.util.ArrayList;
import java.util.Scanner;

/* 10. 가장 짧은 문자거리 */
public class section1_10 {

    public ArrayList<Integer> solution(String str, char word) {

        ArrayList<Integer> answer = new ArrayList<>();

        ArrayList<Integer> indexList = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == word) {
                indexList.add(i);
            }
        }

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == word) {
                answer.add(0);
            }else {
                int distance = Integer.MAX_VALUE;
                for (int x : indexList) {
                    if (Math.abs(i -x)<distance) {
                        distance = Math.abs(i - x);
                    }
                }
                answer.add(distance);
            }
        }

            return answer;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char word = scan.next().charAt(0);

        section1_10 T = new section1_10();

        for (int x : T.solution(str,word)) {
            System.out.print(x+ " ");
        }

    }

}

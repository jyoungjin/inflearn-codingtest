package section1;

import java.util.ArrayList;
import java.util.Scanner;

/* 10. 가장 짧은 문자거리 - 강의 ver */
public class section1_10_pro {

    public ArrayList<Integer> solution(String str, char word) {

        ArrayList<Integer> answer = new ArrayList<>();

        int p=1000;

        for (char x : str.toCharArray()) {
            if (x == word) {
                p =0;
                answer.add(p);
            } else {
                answer.add(++p);
            }
        }

        p=1000;

        for (int i = answer.size() - 1; i >= 0; i--) {
            if (str.charAt(i) == word) {
                p=0;
                answer.set(i,p);
            } else {
                p++;
                answer.set(i, Math.min(p,answer.get(i)));
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char word = scan.next().charAt(0);

        section1_10_pro T = new section1_10_pro();

        for (int x : T.solution(str,word)) {
            System.out.print(x+ " ");
        }

    }

}

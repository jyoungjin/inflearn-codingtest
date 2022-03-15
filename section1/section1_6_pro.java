package section1;

import java.util.ArrayList;
import java.util.Scanner;

/* 6. 중복 문자 제거 */
public class section1_6_pro {

    public String solution(String str) {

        String answer = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        section1_6_pro T = new section1_6_pro();
        System.out.println(T.solution(str));

    }

}

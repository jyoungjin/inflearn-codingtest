package section1;

import java.util.Scanner;

/* 7. 회문 문자열 */
public class section1_7_pro {

    public String solution(String str) {

        String answer = "YES";
        int len = str.length();
        str = str.toLowerCase();
        for (int i = 0; i < len/2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                System.out.println(i);
                return "NO";
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        section1_7_pro T = new section1_7_pro();
        System.out.println(T.solution(str));

    }

}

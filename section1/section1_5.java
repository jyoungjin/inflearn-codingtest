package section1;

import java.util.*;

/* 5. 특정 문자 뒤집기 */
public class section1_5 {

    public String solution(String str) {

        String answer = "";
        char[] s = str.toCharArray();

        int lt = 0;
        int rt = s.length - 1;

        while (lt < rt) {
            if (Character.isAlphabetic(s[lt]) && Character.isAlphabetic(s[rt])) {
                char tmp = s[rt];
                s[rt] = s[lt];
                s[lt] = tmp;
                lt++;
                rt--;
            } else if (!Character.isAlphabetic(s[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(s[rt])) {
                rt--;
            }
        }

        answer = String.valueOf(s);

        return answer;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        section1_5 T = new section1_5();
        System.out.println(T.solution(str));

    }

}

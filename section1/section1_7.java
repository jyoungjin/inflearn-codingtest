package section1;

import java.util.Scanner;

/* 7. 회문 문자열 */
public class section1_7 {

    public String solution(String str) {

        String answer = "YES";

        str = str.toLowerCase();
        String reversestr= new StringBuilder(str).reverse().toString();

        if(!str.equals(reversestr))
            answer = "NO";

        return answer;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        section1_7 T = new section1_7();
        System.out.println(T.solution(str));

    }

}

package section1;

import java.util.Scanner;

/* 8. 유효한 팰린드롬 */
public class section1_8 {

    public String solution(String str) {

        String answer = "NO";

        str = str.toUpperCase().replaceAll("[^A-Z]","");

        String tmp = new StringBuilder(str).reverse().toString();

        if(str.equals(tmp)){
            answer="YES";
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        section1_8 T = new section1_8();
        System.out.println(T.solution(str));

    }

}

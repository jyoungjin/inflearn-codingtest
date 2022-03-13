package section1;

import java.util.Scanner;

/* 2. 대소문자 변환 */
public class section1_2 {

    public String solution(String str) {

        String answer = "";

        for (char x:str.toCharArray()) {
            if(Character.isUpperCase(x)){
                answer+=Character.toLowerCase(x);
            }else{
                answer+=Character.toUpperCase(x);
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        section1_2 T = new section1_2();
        System.out.println(T.solution(str));

    }

}

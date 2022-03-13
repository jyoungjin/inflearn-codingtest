package section1;

import java.util.*;

/* 1. 문자 찾기 */
public class section1_1 {

    public int solution(String str, char c) {

        int answer = 0;
        c = Character.toLowerCase(c);

        for (char x:str.toLowerCase().toCharArray()
             ) {
            if(x==c){
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char c = scan.next().charAt(0);

        section1_1 T = new section1_1();
        System.out.println(T.solution(str, c));

    }

}

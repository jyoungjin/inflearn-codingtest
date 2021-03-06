package section1;

import java.util.ArrayList;
import java.util.Scanner;

/* 6. 중복 문자 제거 */
public class section1_6 {

    public String solution(String str) {

        String answer = "";

        ArrayList<Character> set = new ArrayList<>();

        for (char x : str.toCharArray()) {
            if(!set.contains(x)){
                set.add(x);
            }
        }

        for (char x : set) {
            answer += x;
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        section1_6 T = new section1_6();
        System.out.println(T.solution(str));

    }

}

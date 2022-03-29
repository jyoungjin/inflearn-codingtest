package section1;

import java.util.Scanner;

/* 11. 문자열 압축 - 강의 ver */
public class section1_11_pro {

    public String solution(String str) {

        String answer = "";

        str = str + " ";
        int cnt = 1;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                cnt++;
            } else {
                answer += str.charAt(i);
                if (cnt > 1) {
                    answer += String.valueOf(cnt);
                    cnt=1;
                }
            }
        }


        return answer;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        section1_11_pro T = new section1_11_pro();

        System.out.print(T.solution(str));

    }

}

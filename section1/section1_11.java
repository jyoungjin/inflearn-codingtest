package section1;

import java.util.Scanner;

/* 11. 문자열 압축 */
public class section1_11 {

    public String solution(String str) {

        String answer = "";

        int cnt = 1;
        char tmp = ' ';

        for (char x : str.toCharArray()) {
            if (tmp != x) {
                if (cnt != 1) {
                    answer+=cnt;
                    cnt=1;
                }
                answer += x;
                tmp=x;
            }else{
                cnt++;
            }
        }
        if (cnt > 1) {
            answer += cnt;
        }


        return answer;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        section1_11 T = new section1_11();

        System.out.print(T.solution(str));

    }

}

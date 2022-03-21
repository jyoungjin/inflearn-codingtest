package section1;

import java.util.Scanner;

/* 9. 숫자만 추출 */
public class section1_9_pro {

    public int solution(String str) {

        String answer = "" ;

        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) {
                answer+=x;
            }
        }

        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        section1_9_pro T = new section1_9_pro();
        System.out.println(T.solution(str));

    }

}

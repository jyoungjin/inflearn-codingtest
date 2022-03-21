package section1;

import java.util.Scanner;

/* 9. 숫자만 추출 */
public class section1_9 {

    public int solution(String str) {

        int answer ;

        str = str.replaceAll("[^0-9+]","");

        answer = Integer.valueOf(str);

        return answer;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        section1_9 T = new section1_9();
        System.out.println(T.solution(str));

    }

}

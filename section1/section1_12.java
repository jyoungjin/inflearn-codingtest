package section1;

import java.util.Scanner;

/* 12. 암호 */
public class section1_12 {

    public String solution(int n, String str) {

        String answer = "";

        str = str.replace('#', '1');
        str = str.replace('*', '0');

        for (int i = 0; i < n; i++) {
            String tmp = str.substring(i*7,i*7+7);
            int tmp10 = Integer.parseInt(tmp, 2);
            answer += (char)tmp10;
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String str = scan.next();

        section1_12 T = new section1_12();

        System.out.print(T.solution(n, str));

    }

}

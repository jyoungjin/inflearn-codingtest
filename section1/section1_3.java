package section1;

import java.util.Scanner;

/* 3. 문장 속 단어 */
public class section1_3 {

    public String solution(String str) {

        String answer = "";
        String[] arr = str.split(" ");
        int len=0;

        for(String x : arr){
            if(x.length()>len){
                len = x.length();
                answer=x;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        section1_3 T = new section1_3();
        System.out.println(T.solution(str));

    }

}

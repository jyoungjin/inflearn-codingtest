package section1;

import java.util.Scanner;

/* 4. 단어 뒤집기 */
public class section1_4 {

    public String[] solution(String[] arr) {

        String[] answer = new String[arr.length];
        int n=0;

        for (String str : arr) {
            String tmp = "";
            for(int i=str.length()-1;i>=0;i--){
                tmp+=str.charAt(i);
            }
            answer[n++] = tmp;
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.next();
        }

        section1_4 T = new section1_4();
        for(String t : T.solution(arr)){
            System.out.println(t);
        }

    }

}

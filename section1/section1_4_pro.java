package section1;

import java.util.*;

/* 4. 단어 뒤집기 - 강의 ver */
public class section1_4_pro {

    public ArrayList<String> solution(String[] arr) {

        ArrayList<String> answer = new ArrayList<>();

        for (String str : arr) {
            String tmp = new StringBuilder(str).reverse().toString();
            answer.add(tmp);
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

        section1_4_pro T = new section1_4_pro();
        for(String x : T.solution(arr)){
            System.out.println(x);
        }

    }

}

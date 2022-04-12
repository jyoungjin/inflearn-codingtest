package section5;

import java.util.Scanner;
import java.util.Stack;

/* 5. 쇠막대기 */
public class section5_5 {
    public int solution(String str) {

        int answer = 0;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ')') {
                stack.pop();
                if (str.charAt(i-1) == '(') {
                    answer += stack.size();
                } else {
                    answer++;
                }
            } else {
                stack.push(str.charAt(i));
            }
        }


        return answer;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        section5_5 T = new section5_5();
        System.out.print(T.solution(str));

    }
}
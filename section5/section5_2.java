package section5;

import java.util.Scanner;
import java.util.Stack;

/* 2. 괄호문자제거 */
public class section5_2 {
    public String solution(String str) {

        String answer = "";

        Stack<Character> stack = new Stack<>();

        for (char x : str.toCharArray()) {
            if (x == ')') {
                while (stack.peek() != '(') {
                    stack.pop();
                }
                stack.pop();
            } else {
                stack.push(x);
            }
        }

        for (char x : stack) {
            answer += x;
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        section5_2 T = new section5_2();
        System.out.print(T.solution(str));

    }
}
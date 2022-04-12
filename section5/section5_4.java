package section5;

import java.util.Scanner;
import java.util.Stack;

/* 4. 후위식 연산(postfix) */
public class section5_4 {
    public int solution(String str) {

        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) {
                stack.push(Character.digit(x,10));
            } else {
                int b = stack.pop();
                int a = stack.pop();
                switch (x) {
                    case '+':
                        stack.push(a + b);
                        break;
                    case '-':
                        stack.push(a - b);
                        break;
                    case '*':
                        stack.push(a * b);
                        break;
                    case '/':
                        stack.push(a / b);
                        break;
                }
            }
        }

        answer = stack.pop();

        return answer;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        section5_4 T = new section5_4();
        System.out.print(T.solution(str));

    }
}
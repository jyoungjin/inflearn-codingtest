package section5;

import java.util.Scanner;
import java.util.Stack;

/* 3. 크레인 인형뽑기(카카오) */
public class section5_3 {
    public int solution(int n, int m, int[][] board, int[] moves) {

        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < m; i++) {
            int x = moves[i]-1;
            for (int j = 0; j < n; j++) {
                if (board[j][x] != 0) {
                    if (!stack.isEmpty()) {
                        if (stack.peek() == board[j][x]) {
                            stack.pop();
                            answer += 2;
                        } else {
                            stack.push(board[j][x]);
                        }
                    } else {
                        stack.push(board[j][x]);
                    }
                    board[j][x] = 0;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = scan.nextInt();
            }
        }

        int m = scan.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = scan.nextInt();
        }

        section5_3 T = new section5_3();
        System.out.print(T.solution(n,m,board,moves));

    }
}
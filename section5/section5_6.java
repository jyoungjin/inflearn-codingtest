package section5;

import java.util.*;

/* 6. 공주 구하기 */
public class section5_6 {
    public int solution(int n, int k) {

        int answer = 0;
        int cnt = 0;

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        while (queue.size() > 1) {
            cnt++;
            if (cnt == k) {
                queue.poll();
                cnt = 0;
            } else {
                queue.offer(queue.poll());
            }
        }

        answer = queue.poll();

        return answer;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();

        section5_6 T = new section5_6();
        System.out.print(T.solution(n, k));

    }
}
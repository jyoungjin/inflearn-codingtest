package section4;

import java.util.HashMap;
import java.util.Scanner;

/* 2. 아나그램 */
public class section4_2 {
    public String solution(String s1, String s2) {

        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();

        for (char x : s1.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (char x : s2.toCharArray()) {
            if (!map.containsKey(x) || map.get(x)==0) {
                return "NO";
            }
            map.put(x, map.get(x) - 1);
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s1 = scan.next();
        String s2 = scan.next();

        section4_2 T = new section4_2();
        System.out.print(T.solution(s1, s2));

    }
}

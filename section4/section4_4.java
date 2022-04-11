package section4;

import java.util.HashMap;
import java.util.Scanner;

/* 4. 모든 아나그램 찾기 */
public class section4_4 {
    public int solution(String s, String t) {

        int answer = 0;
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
            tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1);
        }

        if (sMap.equals(tMap)) {
            answer++;
        }

        for (int i = t.length(); i < s.length(); i++) {
            sMap.put(s.charAt(i - t.length()), sMap.get(s.charAt(i - t.length())) - 1);
            if (sMap.get(s.charAt(i - t.length())) == 0) {
                sMap.remove(s.charAt(i - t.length()));
            }
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
            if (sMap.equals(tMap)) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String t = scan.next();

        section4_4 T = new section4_4();
        System.out.print(T.solution(s, t));

    }
}

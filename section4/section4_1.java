package section4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* 1. 학급 회장 */
public class section4_1 {
    public char solution(int n, String str) {

        char answer = ' ';
        int max = Integer.MIN_VALUE;

        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (char x : str.toCharArray()) {
            hashMap.put(x, hashMap.getOrDefault(x, 0) + 1);
        }

        for (Map.Entry<Character, Integer> characterIntegerEntry : hashMap.entrySet()) {
            if (characterIntegerEntry.getValue() > max) {
                max = characterIntegerEntry.getValue();
                answer = characterIntegerEntry.getKey();
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String str = scan.next();

        section4_1 T = new section4_1();
        System.out.print(T.solution(n, str));

    }
}

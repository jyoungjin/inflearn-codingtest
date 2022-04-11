package section4;

import java.util.*;

/* 3. 매출액의 종류 */
public class section4_3 {
    public ArrayList<Integer> solution(int n, int k, int[] arr) {

        ArrayList<Integer> answer = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < k ; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        answer.add(map.size());

        for (int i = k; i < n; i++) {
            map.put(arr[i - k], map.get(arr[i - k]) - 1);
            if (map.get(arr[i - k]) == 0) {
                map.remove(arr[i - k]);
            }
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            answer.add(map.size());
        }


        return answer;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        section4_3 T = new section4_3();
        for (int x : T.solution(n, k, arr)) {
            System.out.print(x+" ");
        }

    }
}

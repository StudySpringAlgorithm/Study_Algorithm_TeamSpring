package Day27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class tangerine {

    public static void main(String[] args) {

        System.out.println(solution(6, new int[]{1, 3, 2, 5, 4, 5, 2, 3}));
    }

    private static int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : tangerine) {
            // if (map.containsKey(i)) {
            //     map.put(map.get(i) + 1);
            // }
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        List<Integer> keySetList = new ArrayList<>(map.keySet());
        Collections.sort(keySetList, Collections.reverseOrder());

        for (Integer i : keySetList) {
            if (k <= 0) {
                break;
            }

            answer++;
            k -= map.get(i);
        }

        return answer;
    }

}

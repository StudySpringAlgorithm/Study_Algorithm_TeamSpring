package Day30;

import java.util.HashMap;
import java.util.Map;

public class cloth {

    public static void main(String[] args) {
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"},{"green_turban", "headgear"}};

        System.out.println(solution(clothes));
    }

    private static int solution(String[][] clothes) {
        int answer = 1;

        Map<String, Integer> map = new HashMap<>();
        for (String[] clothe : clothes) {
            String type = clothe[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        }

        for (Integer num : map.values()) {
            System.out.println(num);
            answer *= num + 1;
        }
        System.out.println(map.keySet().size());

        return answer - 1;
    }

}

package Day30;

import java.util.HashMap;
import java.util.Map;

public class sale {

    public static void main(String[] args) {

        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] number = {3, 2, 2, 2, 1};
        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};

        System.out.println(solution(want, number, discount));

    }

    public static int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int days = 10;

        Map<String, Integer> wish = new HashMap<>();

        for(int i = 0; i < want.length; i++){
            wish.put(want[i], number[i]);
        }

        for(int i = 0; i < discount.length - days + 1; i++){
            Map<String, Integer> sale = new HashMap<>();

            for(int j = 0; j < days; j++){
                sale.put(discount[i + j], sale.getOrDefault(discount[i + j], 0) + 1);
            }

            Boolean isSame = true;

            for(String key : wish.keySet()){
                if(wish.get(key) != sale.get(key)){
                    isSame = false;
                    break;
                }
            }

            if (isSame) {
                answer++;
            }
        }

        return answer;
    }

}

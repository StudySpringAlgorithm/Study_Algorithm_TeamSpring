package Day20;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class KakaoMbti {

    // survey의 원소는 "RT", "TR", "FC", "CF", "MJ", "JM", "AN", "NA" 중 하나입니다.
    public static void main(String[] args) {
        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};

        System.out.println("====================");
        char test1 = 'A';
        char test2 = 'B';

        System.out.println(test1 > test2);

        System.out.println(solution(survey, choices));

    }

    private static String solution(String[] survey, int[] choices) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("R", 0);
        map.put("T", 0);
        map.put("C", 0);
        map.put("F", 0);
        map.put("J", 0);
        map.put("M", 0);
        map.put("A", 0);
        map.put("N", 0);

        for (int i = 0; i < survey.length; i++) {
            if (choices[i] == 4) {
                continue;
            }
            String key = getBiasType(survey[i], choices[i]);
            Integer value = map.get(key) + scoreCalculator(choices[i]);
            map.put(key, value);
        }
        String answer = "";

        answer += getKeyWithLagerValue("R", "T", map);
        answer += getKeyWithLagerValue("C", "F", map);
        answer += getKeyWithLagerValue("J", "M", map);
        answer += getKeyWithLagerValue("A", "N", map);

        return answer;
    }

    private static String getKeyWithLagerValue(String key1, String key2,
        HashMap<String, Integer> map) {
        if (key1.equals(key2)) {
            char charKey1 = key1.charAt(0);
            char charKey2 = key2.charAt(0);
            if (charKey1 > charKey2) {
                return key2;
            }
        }

        if (map.get(key1) < map.get(key2)) {
            return key2;
        }

        return key1;
    }

    private static String getBiasType(String category, int score) {
        int bias = 0;
        if (score > 4) {
            bias = 1;
        }
        return Character.toString(category.charAt(bias));
    }

    private static int scoreCalculator(int score) {
        return Math.abs(4 - score);
    }

}

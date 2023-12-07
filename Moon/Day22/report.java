package Day22;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class report {

    public static void main(String[] args) {

    }

    private static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, HashSet<String>> map = new HashMap<>();
        Map<String, Integer> idMap = new HashMap<>();

        for (int i = 0; i < id_list.length; i++) {
            String name = id_list[i];
            map.put(name, new HashSet<>());
            idMap.put(name, i);
        }



        return answer;
    }
}

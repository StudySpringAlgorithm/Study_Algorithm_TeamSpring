package Day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class sortMyway {
    public static void main(String[] args) {

    }

    private static String[] solution(String[] strings, int n) {
        String[] answer = {};
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < strings.length; i++) {
            list.add(strings[i].charAt(n) + strings[i]);
        }

//        Arrays.sort(list);
        // 정렬 방법이 배열마다 다름
        Collections.sort(list);

        answer = new String[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).substring(1);
        }

        return answer;
    }
}

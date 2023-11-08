package Day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class removeMin {
    public static void main(String[] args) {

    }

    public static int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }

        List<Integer> clone = new ArrayList<>(list);
        Collections.sort(clone);

        list.remove(clone.get(0));

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        if (answer.length == 0) {
            answer = new int[]{-1};
        }

        return answer;
    }
}

package Day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class plusDivisor {
    public static void main(String[] args) {

    }

    public static int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            if (num % divisor == 0) {
                list.add(num);
            }
        }

        if (list.size() == 0) {
            int[] answer = {-1};
            return answer;
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] =  list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}

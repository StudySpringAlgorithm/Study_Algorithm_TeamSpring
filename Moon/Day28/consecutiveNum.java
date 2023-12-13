package Day28;

import java.util.HashSet;
import java.util.Set;

public class consecutiveNum {

    public static void main(String[] args) {
        int[] elements = {7,9,1,1,4};
        System.out.println(solution(elements));
    }

    private static int solution(int[] elements) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        int length = 0;

        while (length < elements.length) {
            for (int i = 0; i < elements.length; i++) {
                int sum = 0;
                for (int j = i; j <= i + length; j++) {
                    if (j >= elements.length) {
                        sum += elements[j - elements.length];
                        continue;
                    }
                    sum += elements[j];
                }
                set.add(sum);
            }
            length++;
        }


        answer = set.size();
        return answer;
    }


}

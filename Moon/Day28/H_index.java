package Day28;

import java.util.Arrays;

public class H_index {

    public static void main(String[] args) {
        int[] citations2 = {0, 1, 2, 2, 2};
        System.out.println(solution(citations2));

    }

    public static int solution(int[] citations) {
        int answer = 0;

        for (int i = 0; i < citations.length; i++) {
            int up = 0;
            int down = 0;
            for (int j = 0; j < citations.length; j++) {
                if (i <= citations[j]) {
                    up++;
                }
                if (i >= citations[j]) {
                    down++;
                }
            }
            if (i > answer && i <= up && i >= down) {
                answer = i;
            }

        }

        return answer;
    }

}

package Day4;

import java.util.Arrays;
import java.util.Collections;

public class sort {
    public static void main(String[] args) {
        System.out.println(solution(121));
    }

    private static long solution(long n) {

        String answer = "";
        String[] list = String.valueOf(n).split("");
        Arrays.sort(list, Collections.reverseOrder());

        for (String str : list) {
            answer += str;
        }
        return Long.parseLong(answer);
    }
}

package Day8;

import java.util.ArrayList;

public class waterMelonWaterMelon {
    public static void main(String[] args) {

    }

    private static String solution(int n) {
        ArrayList<String> StringList = new ArrayList<String>(n);
        for (int i = 0; i < n; i++) {
            if (i % 2 == 1) {
                StringList.add("박");
            } else {
                StringList.add("수");
            }
        }
        String answer = String.join("", StringList);
        return answer;
    }
}

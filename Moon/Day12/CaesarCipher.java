package Day12;

import java.util.regex.Pattern;

public class CaesarCipher {
    public static void main(String[] args) {

    }

    private static String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int ascii = ch;
//            if (String.valueOf(ch).isEmpty()) {
//            }
            if (ascii == 32) {
                answer.append(" ");
            } else if (Character.isUpperCase(ch) && ascii + n > 90) {
                ascii -= 25;
                answer.append((char)(ascii + n));
            } else if (Character.isLowerCase(ch) && ascii + n > 122) {
                ascii -= 25;
                answer.append((char)(ascii + n));
            } else {
                answer.append((char)(ascii + n));
            }

        }
        return answer.toString();
    }
}

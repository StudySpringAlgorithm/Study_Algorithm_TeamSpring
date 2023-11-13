package Day11;

public class weirdWord {
    public static void main(String[] args) {

    }

    private static String solution(String s) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            String str = Character.toString(s.charAt(i));
            if (str.equals(" ")) {
                answer.append(str);
            } else if (i % 2 == 0) {
                answer.append(str.toUpperCase());
            } else {
                answer.append(str.toLowerCase());
            }
        }
        return answer.toString();
    }
}

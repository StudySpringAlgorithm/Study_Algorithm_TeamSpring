package Day11;

public class weirdWord {
    public static void main(String[] args) {

    }


    private static String better(String s) {

        String answer = "";
        int cnt = 0;
        String[] array = s.split("");

        for (String ss : array) {
            cnt = ss.contains(" ") ? 0 : cnt + 1;
            answer += cnt % 2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
        }
        return answer;
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

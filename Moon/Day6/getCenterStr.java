package Day6;

public class getCenterStr {

    public static void main(String[] args) {

    }

    public static String solution(String s) {
        String answer = "";
        // int center = s.length() / 2; // 홀수 5 면 2.5에 버림 2 => 중앙값
        // if (s.length() % 2 == 0) {
        //     answer += s.charAt(center - 1);
        //     answer += s.charAt(center);
        // } else {
        //     answer += s.charAt(center);
        // }
        // return answer;

        // int size = s.length();
        // int start = (size - 1) / 2;
        // int end = size / 2;
        // if (start != end) {
        //     answer += s.charAt(start);
        // }
        // answer += s.charAt(end);
        // return answer;

        // 엄청난 속도...!
        return s.substring((s.length()-1)/2, s.length()/2 + 1);
    }
}

package Day14;

public class nearbyNum {

    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        answer[0] = -1;
        for (int i = 1; i < s.length(); i++) {
            String targetStr = String.valueOf(s.charAt(i));
            String subStr = s.substring(0,i);
            if (!subStr.contains(targetStr)) {
                answer[i] = -1;
                continue;
            }
            answer[i] = i-subStr.lastIndexOf(s.charAt(i));
        }
        return answer;
    }
}

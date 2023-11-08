package Day6;

public class HidePhoneNumber {
    public static void main(String[] args) {

    }

    public static String solution(String phone_number) {
        String answer = "";
        int size = phone_number.length();
        String lastFourNum = phone_number.substring(size-4, size);
        for (int i = 0; i < size - 4; i++) {
            answer += "*";
        }
        answer += lastFourNum;
        return answer;
    }
}

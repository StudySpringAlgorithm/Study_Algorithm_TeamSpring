package Day3;

public class plusDigit {
    public static void main(String[] args) {
        System.out.println(solution(123));
    }

    private static int solution(int n) {
        int answer = 0;

        String[] arr = String.valueOf(n).split("");
        for (String str : arr) {
            answer += Integer.parseInt(str);
        }

        return answer;
    }

}

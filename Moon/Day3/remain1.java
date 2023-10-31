package Day3;

public class remain1 {
    public static void main(String[] args) {
        System.out.println(solution(10));
    }

    private static int solution(int n) {
        int answer = 1;
        while (n % answer != 1) {
            answer ++;
        }

        return answer;
    }
}

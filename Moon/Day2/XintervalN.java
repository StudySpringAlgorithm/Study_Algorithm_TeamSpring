package Day2;

public class XintervalN {

    public static void main(String[] args) {
        long[] answer = solution(2, 5);
        for (long n : answer) {
            System.out.println(n);
        }
    }
    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        long plus = x;
        for (int i = 0; i < n; i++) {

            answer[i] = plus;
            plus += x;
        }

        return answer;
    }
}

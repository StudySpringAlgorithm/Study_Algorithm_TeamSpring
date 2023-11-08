package Day8;

import java.util.ArrayList;
import java.util.List;

public class divisorCountSum {
    public static void main(String[] args) {
        System.out.println(solution(13, 17));
    }

    private static int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            List<Integer> divisors = getDivisors(i);
            int size = divisors.size();
            if (size % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        return answer;
    }

    private static List<Integer> getDivisors(int n) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
            }
        }
        return divisors;
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i < (Math.sqrt(n)) + 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

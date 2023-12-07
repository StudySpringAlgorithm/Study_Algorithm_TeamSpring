package Day25;

public class jump {

    public static void main(String[] args) {

        System.out.println(solution(4));
        System.out.println(solution(3));
    }

    private static long solution(int n) {
        long[] jumps = new long[n + 1];

        if (n == 1)
            return 1;
        if (n == 2)
            return 2;

        jumps[0] = 0;
        jumps[1] = 1L;
        jumps[2] = 2L;

        for (int i = 3; i <= n; i++) {
            jumps[i] = (jumps[i - 1] + jumps[i - 2]) % 1234567;
        }

        return jumps[n];
    }

}

package Day10;

public class MinMaxMultiple {

    public static void main(String[] args) {
        System.out.println(solution(3,12)[0] + ", " + solution(3,12)[1]);
    }

    private static int[] solution(int n, int m) {
        int a = Math.max(n, m);
        int b = Math.min(n, m);
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        int max = a;
        int min = n * m / a;
        int[] answer = {max,min};

        return answer;
    }
}

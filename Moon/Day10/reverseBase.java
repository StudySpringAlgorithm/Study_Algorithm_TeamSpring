package Day10;

public class reverseBase {

    public static void main(String[] args) {
        System.out.println(solution(45));
    }

    private static int solution(int n) {
        String str = "";

        while (n != 0) {
            str += n % 3;
            n /= 3;
        }

        return Integer.parseInt(str, 3);
    }
}

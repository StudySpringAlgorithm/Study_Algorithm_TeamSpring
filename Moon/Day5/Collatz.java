package Day5;

public class Collatz {

    public static void main(String[] args) {

    }

    public static int solution(int num) {
        long n = (long) num;
        int answer = -1;
        int count = 0;
        if (num == 1) {
            return 0;
        }
        while (count != 500) {
            if (n % 2 == 0) {
                n = n / 2;
                count++;
                if (n == 1) {
                    answer = count;
                    break;
                }
            } else {
                n = n * 3 + 1;
                count++;
            }
        }
        return answer;
    }
}

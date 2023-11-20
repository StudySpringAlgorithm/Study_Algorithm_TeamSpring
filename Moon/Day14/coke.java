package Day14;

public class coke {

    public int solution(int a, int b, int n) {
        int answer = 0;
        while (true) {
            int remain = n % a;
            n = n / a * b;
            answer += n;
            System.out.println("병 : " + n);
            n += remain;

            if (n <= a) {
                if (n % a == 0) {
                    answer ++;
                }
                break;
            }
        }
        return answer;
    }
}

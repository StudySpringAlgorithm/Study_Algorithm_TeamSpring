package Day5;

public class betweenSum {
    public static void main(String[] args) {
        System.out.println(solution(3,6));;
    }

    public static long solution(int a, int b) {
        long answer = 0;
        int up = a;
        int down = b;

        if(a < b) {
            up = b;
            down = a;
        }

        for (int i = down; i <= up; i++) {
            answer += i;
        }
        return answer;
    }
}

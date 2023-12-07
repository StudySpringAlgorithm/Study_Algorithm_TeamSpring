package Day24;

public class battle {

    public static void main(String[] args) {
        int a = 4;
        int b= 7;
        while (a+1 != b) {
            a++;
            System.out.println(a);
        }
    }

    public static int solution(int n, int a, int b)
    {
        int answer = 0;
        while (Math.abs(a - b) != 1) {
            a = (a+1) / 2;
            b = (b+1) / 2;
            answer++;
        }
        return answer + 1;
    }

}

package Day1;

public class TotalDivisor {
    public static void main(String[] args) {

    }

    public static int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++){
            if(n % i == 0){
                answer+=i;
            }
        }
        return answer;
    }

    public static int solutionBetter(int n) {
         int answer = 0;
         for (int i = 1; i <= n / 2; i++){
             if(n % i == 0){
                 answer+=i;
             }
         }
         return answer + n;
    }
    // 모든 약수의 합은 n/2 + n 까지와 같다고 한다
    // 약수와 관련된 알고리즘 유클리드 호재법
}

package Chang.day1;

//정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성하는 문제
public class intSum {
    public int solution(int n) {
        int answer = 0;

        for(int i=1;i<=n;i++){
            if(n%i==0||n==0){
                answer+=i;
            }
        }
        return answer;
    }
}

package Chang.day3;
//n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return 하도록 solution 함수를 완성하는 문제
public class NumFind {

    public int solution(int n) {
        int answer = 0;

        for(int i=2;i<n;i++){
            if(n%i==1){
                answer=i;
                break;
            }
            else{
                continue;
            }
        }

        return answer;
    }
}

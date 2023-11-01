package Chang.day4;

//n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 작성
public class PowCompare {

    public long solution(long n) {
        long answer = 0;
        double sqrt= Math.sqrt(n);

        if((sqrt-(int)sqrt)==0){
            answer=(long)(Math.pow(sqrt+1,2));
        }
        else{
            answer=-1;
        }

        return answer;
    }

}

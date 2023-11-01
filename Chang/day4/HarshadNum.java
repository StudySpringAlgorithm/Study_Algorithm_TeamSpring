package Chang.day4;

//자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수를 완성하라
public class HarshadNum {
    public boolean solution(int x) {
        boolean answer = true;

        int lengthOfx = String.valueOf(x).length();
        int sum=0;
        int number=x;

        for(int i=0;i<lengthOfx;i++){
            sum+=number%10;
            number/=10;
        }

        if(x%sum==0){
            answer=true;
        }
        else{
            answer=false;
        }

        return answer;
    }
}

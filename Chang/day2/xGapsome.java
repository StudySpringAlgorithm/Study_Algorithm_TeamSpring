package Chang.day2;

//정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴하는 함수 작성하는 문제

public class xGapsome {

    public long[] solution(long x, int n) { //answer배열이 long이기 때문에 x도 long으로 받을것

        long[] answer = new long[n]; //n개를 지니는 배열 생성
        long sum=x; //x씩 증가 시키기 위한 변수

        for(int i=0;i<answer.length;i++){
            answer[i]=x;
            x+=sum;
        }

        return answer;
    }
}

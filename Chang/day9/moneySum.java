package Chang.day9;

//부족한 금액 계산하기
public class moneySum {

    public long solution(int price, int money, int count) {
        long answer = 0;
        long sum=money;

        for(int i=1;i<count+1;i++){
            sum-=(price*i);
        }

        if(sum<0){
            answer=Math.abs(sum);
        }
        else{
            answer=0;
        }

        return answer;
    }

}

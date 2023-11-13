package Chang.day10;

public class threenum {

    public int solution(int n) {
        String three = "";
        while(n>0){
            three += n%3;
            n /= 3;
        }
        return Integer.parseInt(three,3);
    }

}


/*
    public int solution(int n) {
        int answer = 0;
        int count=1;

        //3진법 변환
        int num=0;
        while(n>0){
            num+=(n%3)*count;
            n/=3;
            count*=10;
        }

        //앞뒤변환
        int num2=0;
        while(count>0){
            num2+=(num/count);
            count/=10;
        }

        //10진법으로 표현
        int i=0;
        while(num2>0){
            answer+=(num2%10)*Math.pow(3,i);
            i++;
        }


        return answer;
    }

 */
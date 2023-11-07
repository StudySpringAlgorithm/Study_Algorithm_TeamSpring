package Chang.day5;

public class intSum {

    public long solution(int a, int b) {
        long answer = 0;

        if(a<b){
            for(int i=a;i<b+1;i++){
                answer+=i;
            }
        }
        else if (a>b){
            for(int i=b;i<a+1;i++){
                answer+=i;
            }
        }
        else{answer=a;}

        return answer;
    }
}

package Chang.day5;

public class Collatz {

    public int solution(int num) {
        int answer = 0;

        if(num==1){answer=0;}

        else if(num>1){
            long val=num;
             while(answer<=500){

                if(val%2==0){
                    val/=2;
                }
                else{
                    val=(val*3)+1;
                }

                answer+=1;

                if(val==1){break;}

             }
        }
        if(answer>500){answer=-1;}

        return answer;
    }
}

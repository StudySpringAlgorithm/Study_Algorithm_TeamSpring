package Chang.day7;

public class stringfind {

    public String solution(String s) {
        String answer = "";
        int count=s.length()/2;

        if(s.length()%2==0){
            answer=s.substring(count-1,count+1); //substring 사용
        }
        else{
            answer=s.substring(count,count+1);
        }

        return answer;
    }


}

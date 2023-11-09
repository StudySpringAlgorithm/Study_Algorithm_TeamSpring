package Chang.day9;

//문자열 다루기 기본
public class Stringfalsetrue {

    public boolean solution(String s) {
        boolean answer = true;

        char[] str=s.toCharArray();

        if(str.length==4 ||str.length==6){
            for(int i=0;i<str.length;i++){
                int num=str[i];
                if(num<48||num>57){
                    answer=false;
                }
            }
        }
        else{answer=false;}

        return answer;
    }

}

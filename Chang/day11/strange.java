package Chang.day11;

public class strange {

    public String solution(String s) {
        String answer = "";

        String[] str=s.split("");
        int index=0;

        for(String val:str){
            if(val.equals(" ")){
                answer+=" ";
                index=0;
            }
            else{
                if(index%2==0){
                    answer+=val.toUpperCase();
                    index++;
                }
                else{
                    answer+=val.toLowerCase();
                    index++;
                }
            }
        }

        return answer;
    }

}

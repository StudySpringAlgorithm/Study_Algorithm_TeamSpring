package Chang.day8;

public class WaterMelon {

    public String solution(int n) {
        String answer = "";

        char[] sb=new char[n];

        for(int i=0;i<n;i++){

            if(i%2==0){
                sb[i]='수';
            }
            else{
                sb[i]='박';
            }
        }
        answer=new String(sb);

        return answer;
    }

}

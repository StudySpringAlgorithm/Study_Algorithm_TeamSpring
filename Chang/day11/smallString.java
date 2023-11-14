package Chang.day11;

public class smallString {

    public int solution(String t, String p) {
        int answer = 0;
        int Pnum=p.length();

        for(int i=0;i<=t.length()-Pnum;i++){
            String str =t.substring(i,i+Pnum);
            long num=Long.parseLong(str);
            long num2=Long.parseLong(p);
            if(num<=num2){
                answer++;
            }

        }

        return answer;
    }

}

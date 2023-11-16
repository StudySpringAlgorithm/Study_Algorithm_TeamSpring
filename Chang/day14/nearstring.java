package Chang.day14;

public class nearstring {

    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        char[] str=s.toCharArray();

        answer[0]=-1;

        for(int i=1;i<str.length;i++){
            for(int j=i-1;j>=0;j--){
                if(str[i]==str[j]){
                    answer[i]=i-j;
                    break;
                }
                else{
                    answer[i]=-1;
                }
            }
        }

        return answer;
    }

}

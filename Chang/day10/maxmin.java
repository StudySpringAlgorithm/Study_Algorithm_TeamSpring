package Chang.day10;

public class maxmin {

    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int max=Math.max(n,m);
        int min=Math.min(n,m);

        //최대공약수
        for(int i=1;i<max;i++){
            if(n%i==0&&m%i==0){
                answer[0]=i;
            }
        }

        //최소공배수
        answer[1]=n*m/answer[0];

        return answer;
    }
}

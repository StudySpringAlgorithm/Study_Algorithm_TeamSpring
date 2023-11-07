package Chang.day6;

import java.util.Arrays;

public class intarr {

    public int[] solution(int[] arr, int divisor) {
        int[] answer={};
        int count=0;
        int num=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]%divisor==0){
                count+=1;
            }
        }

        if(count==0){
            answer=new int[]{-1};
        }
        else{
            answer=new int[count];

            for(int i:arr){
                if(i%divisor==0){
                    answer[num]=i;
                    num++;
                }
            }
            Arrays.sort(answer);
        }

        return answer;
    }
}

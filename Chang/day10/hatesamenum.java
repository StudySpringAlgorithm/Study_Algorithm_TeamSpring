package Chang.day10;

public class hatesamenum {

    public int[] solution(int []arr) {
        int[] answer = {};
        int count=0;

        //몇개가 중복되는지 카운트
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                count++;
            }
        }

        answer=new int[arr.length-count];
        answer[0]=arr[0];
        int index=0;

        for(int i=0;i<arr.length;i++){
            if(answer[index]!=arr[i]){
                index++;
                answer[index]=arr[i];
            }
        }

        return answer;
    }

}

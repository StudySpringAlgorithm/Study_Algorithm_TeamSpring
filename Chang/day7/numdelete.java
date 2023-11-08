package Chang.day7;

public class numdelete {

    public int[] solution(int[] arr) {

        //-1리턴
        if(arr.length==1){
            return new int[]{-1};
        }

        //min구하기
        int min=arr[0];
        for(int val:arr){
            if(min>val){
                min=val;
            }
        }

        //제거하기
        int[] answer=new int[arr.length-1];
        int index=0; //그냥 i넣어서 반복문 넣었더니 런타임 에러뜸..index를 따로 추가해서 for문 돌려줌

        for(int i=0;i<arr.length;i++){
            if(min==arr[i]){
                continue; }
            answer[index]=arr[i];
            index++;
        }

        return answer;
    }

}

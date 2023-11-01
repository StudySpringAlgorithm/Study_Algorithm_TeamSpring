package Chang.day4;

//n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴하는 함수
public class DcenOrder {

    public long solution (long n) {
        char [] arr = String.valueOf(n).toCharArray() ;
        for (int i=0; i<arr.length-1; i++) {
            for (int j=i+1; j<arr.length; j++) {
                if(arr[j] > arr[i]){
                    char tmp = arr[i];
                    arr [i] = arr[j];
                    arr [j] = tmp;
                }
            }
        }

        return Long.valueOf(new String (arr));
    }
}

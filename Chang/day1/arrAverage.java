package Chang.day1;

//정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성하는 문제
public class arrAverage {

    public double solution(int[] arr) {
        double answer = 0;

        for(int i=0;i<arr.length;i++){
            answer+=arr[i];
        }
        answer=answer/arr.length;
        return answer;
    }
}

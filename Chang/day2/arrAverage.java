package Chang.day2;

//정수를 담고 있는 배열 arr의 평균값을 return하는 함수를 완성하는 문제
public class arrAverage {

    public double solution(int[] arr) {
        double answer = 0;

        for(int i=0;i<arr.length;i++){
            answer+=arr[i]; //배열안에 있는 정수들을 더해준다.
        }
        answer=answer/arr.length; //더한 정수들을 배열의 갯수로 나눠준다.
        return answer;
    }
}

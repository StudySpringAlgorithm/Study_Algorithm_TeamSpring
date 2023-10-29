package day1;

import java.util.stream.IntStream;

public class SumOfAliquot {

	/**
	 * 약수의 합
	 * 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
	 */
	public static void main(String[] args) {
		System.out.println(solution(100));
	}

	public static int solution(int n) {
		int answer = 0;
		for(int i = 1; i <= n; i++){
			if(n % i == 0){
				answer += i;
			}
		}
		return answer;
	}

	public int streamSolution(int n) {
		return IntStream.range(1, n + 1).filter(m -> n % m == 0 ).sum();
	}

}

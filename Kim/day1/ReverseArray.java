package day1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {

	/**
	 * 자연수 뒤집어 배열로 만들기
	 * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
	 */
	public static void main(String[] args) {
		System.out.println(solution(100));
	}

	public static int[] solution(long n) {
		String s = String.valueOf(n);
		int[] answer = new int[s.length()];
		for(int i = 0; i < s.length(); i++){
			answer[i] = (int) (n % 10);
			n /= 10;
		}
		return answer;
	}

	public static int[] afterSolution(long n){
		String[] arr = String.valueOf(n).split("");
		List<String> list = Arrays.asList(arr);
		Collections.reverse(list);
		return list.stream().mapToInt(Integer::parseInt).toArray();
	}
}

public class solutions {

	public long[] solution(int x, int n) {

		long[] answer = new long[n];
		for (long i = 0; i < n; i++)
			answer[(int)i] = (x * (i + 1));
		return answer;
	}	// x만큼 간격이 있는 n개의 숫자

	public double solution(int[] arr) {
		double answer = 0;
		for(int i : arr)
			answer += i;
		return answer / arr.length;
	}	// 평균 구하기

	public static boolean solution(String s) {
		int pH = 0;
		char tmp;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'p' || s.charAt(i) == 'P')
				pH++;
			else if (s.charAt(i) == 'y' || s.charAt(i) == 'Y')
				pH--;
		}
		return (pH == 0) ? true : false;
	}	// p와 y의 개수
}

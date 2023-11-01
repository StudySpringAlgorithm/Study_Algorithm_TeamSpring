public class solutionsDay2 {

	// x만큼 간격이 있는 n개의 숫자
	// 1030
	public long[] solution1(int x, int n) {

		long[] answer = new long[n];
		for (long i = 0; i < n; i++)
			answer[(int)i] = (x * (i + 1));
		return answer;
	}

	// 평균 구하기
	// 1030
	public double solution2(int[] arr) {
		double answer = 0;
		for(int i : arr)
			answer += i;
		return answer / arr.length;
	}

	// p와 y의 개수
	// 1030
	public static boolean solution5(String s) {
		int pH = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'p' || s.charAt(i) == 'P')
				pH++;
			else if (s.charAt(i) == 'y' || s.charAt(i) == 'Y')
				pH--;
		}
		return (pH == 0) ? true : false;
	}

  

}



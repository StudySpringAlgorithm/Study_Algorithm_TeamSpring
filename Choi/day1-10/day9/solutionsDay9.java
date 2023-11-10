public class solutionsDay9 {

	//수박
	//1109
	public static String solution19(int n) {

		String answer = "";



		for (int i = 0; i < n; i++)
			answer += (i % 2 == 0) ? "수" : "박";

		return answer;
	}

	//내적
	//1109
	public int solution20(int[] a, int[] b) {

		int answer = 0;
		for (int i = 0; i < a.length; i++)
			answer += a[i] * b[i];
		return answer;
	}


	//약수의 개수와 덧셈
	//1109
	public static int solution21(int left, int right) {
		int answer = 0;

		for(int i = left; i <= right; i++) {
			if ((int)Math.sqrt(i) * (int)Math.sqrt(i) == i)
				answer -= i;
			else
				answer += i;
		}
		return answer;
	}

}
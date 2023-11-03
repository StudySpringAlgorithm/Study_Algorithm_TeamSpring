public class solutionsDay4 {

	// 두 정수 사이의 합
	//1106
	public static long solution10(int a, int b) {

		long answer = 0;

		if (a > b) {
			for (int i = 0; a >= b; i++)
				answer += b++;
			return answer;
		} else if (b > a) {
			for (int i = 0; b >= a; i++)
				answer += a++;
			return answer;
		}
		return a;
	}

	// 콜라츠 추측
	//1106
	public static int solution11(int num) {

		long tmp = num; // 오버플로우

		for (int i = 0; i < 500; i++) {
			if (tmp == 1)
				return i;
			else if ((tmp % 2) == 0)
				tmp /= 2;
			else
				tmp = tmp * 3 + 1;
		}

		return -1;
	}

	//서울에서 김서방 찾기
	//1106
	public static String solution12(String[] seoul) {

		for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals("Kim"))
				return ("김서방은 " + i + "에 있다");
		}
		return "여기 없나본데?";
	}

}
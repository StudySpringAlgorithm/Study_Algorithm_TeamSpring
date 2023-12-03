public class solutionsDay24 {

	// 카펫
	public static int[] solution23(int brown, int yellow) {
		int maxX = (brown / 2) - 2;
		int x = (brown / 2) - 3;

		// brown/2 - 2 = x * y
		// x * y = yellow
		// x-- = yellow - 1
		//가로가 세로보다 길다 ( y < x + 1 )

		for (int y = 1; y < x + 1; y++) {
			if ((x * y) == yellow)
				return new int[]{x + 2,y + 2};
			x--;
		}
		return null;
	}
	public int solution83(int n) {
		return Fibonacci_2(n);
	}

	public int Fibonacci_1 (int n) {
		if (n <= 1)
			return n;
		else
			return Fibonacci_1(n - 1) + Fibonacci_1(n - 2);
	}

	public int Fibonacci_2 (int n) {
		if (n <= 1)
			return n;

		int tmp;
		int num1 = 1;
		int num2 = 1;

		for (int i = 2; i< n; i++) {
			tmp = num2;
			num2 = (num1 + num2) % 1234567; // 모듈화
			num1 = tmp;
		}
		return num1;
	}


}



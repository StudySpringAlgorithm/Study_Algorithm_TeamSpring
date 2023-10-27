package day1;

public class Main {

	public static void main(String[] args) {

		int answer1 = 12;
		System.out.println(solution1(answer1));

		int answer2 = 2;
		System.out.println(solution2(answer2));

		long answer3 = 12345;

		for (int i = 0; i < solution3(answer3).length; i++){
			System.out.printf("%d", solution3(answer3)[i]);
		}


	}

	public static int solution1(int n) {

		int answer = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				answer += n / i;
		}
		return answer;

	}

	public static String solution2(int num) {

		if ( num % 2 == 0)
			return "Even"; // 0 포함
		else
			return "Odd"; // 음수 포함
	}

	public static int[] solution3(long n) {

		int lengthNum = 1;
		long tmp = n;

		for (int i = 0; 0 != (tmp /= 10) ; i++){ lengthNum++; }

		int[] answer = new int[lengthNum];

		for (int i = 0; i < lengthNum ; i++ ) {

			if (10 < n)
				answer[i] = (int)(n % 10);
			else
				answer[i] = (int)n;
			n /= 10;
		}

		return answer;
	}

}



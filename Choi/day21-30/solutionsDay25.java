public class solutionsDay25 {

	//예상대진표
	public int solution85(int n, int a, int b)
	{
		// 총 경기 수는 항상 n - 1 번

		int matchCount = 1;

		if ( b > a ) {

			while (n >= 1) {

				if ((a % 2 == 1) && (a + 1 == b))
					return matchCount;

				if (a % 2 == 1)
					a++;
				if (b % 2 == 1)
					b++;

				a /= 2;
				b /= 2;
				n /= 2;
				matchCount++;
			}
		} else {
			while (n >= 1) {

				if ((b % 2 == 1) && (b + 1 == a))
					return matchCount;

				if (a % 2 == 1)
					a++;
				if (b % 2 == 1)
					b++;

				a /= 2;
				b /= 2;
				n /= 2;
				matchCount++;
			}
		}


		return matchCount;
	}

	public int solution86(int[] arr) {
		int answer = arr[0];

		for (int i = 1; i < arr.length; i ++) {
			answer = euclidean86 (answer, arr[i]);
		}

		return answer;
	}

	public int euclidean86(int answer, int next) {
		long lcm = (long) answer * next;
		int tmp = 1;

		while ( tmp > 0 ) {
			tmp = answer % next;
			answer = next;
			next = tmp;
		}

		return (int)lcm / answer;
	}


}



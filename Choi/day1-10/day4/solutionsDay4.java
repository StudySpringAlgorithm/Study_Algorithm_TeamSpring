import java.util.Arrays;

public class solutionsDay4 {

	// 제곱근 판별
	//1101
	public long solution1(long n) {
		long answer = 1;
		while(((answer * answer) <= n)){ //Math.sqrt ?
			if ((answer * answer) == n)
				return (answer + 1) * (answer + 1); // Math.pow
			answer++;
		}
		return -1;
	}

	//정수 내림차순으로 배치하기
	//1101
	public static long solution8(long n) {

		int lengthNum = 1;
		long tmp = n;
		long answer = 0;

		for (int i = 0; 0 != (tmp /= 10) ; i++){ lengthNum++; }

		long[] answerArray = new long[lengthNum];

		for (int i = 0; i < lengthNum ; i++ ) {
			if (10 < n)
				answerArray[i] = (n % 10);
			else
				answerArray[i] = n;
			n /= 10;
		}

		long sortTmp = 0;

		for (int i = 0; i < lengthNum; i++) {
			for (int j = 0; j < lengthNum -1; j++) {
				if (answerArray[i] > answerArray[j]) {
					sortTmp = answerArray[i];
					answerArray[i] = answerArray[j];
					answerArray[j] = sortTmp;
				}
			}
		}

		for (long l : answerArray)
			answer = answer * 10 + l;

		return answer;
	}

	//정수 내림차순으로 정렬하기 Ver.2
	//1101
	public static long solution8_1(long n) {

		long answer = 0L;

//		int length = (int)Math.log10(n) + 1;

		char[] tmp = Long.toString(n).toCharArray();

		Arrays.sort(tmp);

//		for (int i = 0; i < length; i ++)

		for (int i = (int)Math.log10(n) + 1; 0 < i; i--) {
			answer = answer * 10 + ((tmp[i - 1] - 48));
		}

		return answer;
	}

	//정수 내림차순으로 배치하기 Ver.3
	//1101
	public static long solution8_2(long n) {

		int lengthNum = 1;
		long tmp = n;
		long answer = 0;

		for (int i = 0; 0 != (tmp /= 10) ; i++){ lengthNum++; }

		long[] answerArray = new long[lengthNum];

		for (int i = 0; i < lengthNum ; i++ ) {
			if (10 < n)
				answerArray[i] = (n % 10);
			else
				answerArray[i] = n;
			n /= 10;
		}

		Arrays.sort(answerArray);

		for (int i = lengthNum; 0 < i; i--) {
			answer = answer * 10 + ((answerArray[i - 1]));
		}

		return answer;
	}

	//하샤드 수
	//1101
	public static boolean solution9(int x) {

		int tmp = x;
		int sum = 0;

		while (tmp > 0) {
			sum += tmp % 10;
			tmp /= 10;
		}

		return (x % sum) == 0;
	}

}
public class solutionsDay16 {

	//과일 장수
	public static int solution57(int k, int m, int[] score) {

		Arrays.sort(score);

		int[] box = new int[m];
		int i = score.length - 1;
		int minValue = k;
		int count = m;
		int answer = 0;

		while ( i >= 0 ) {
			if (count > 0) {
				count--;
				if (score[i] < minValue)
					minValue = score[i];
			}

			if ( count == 0 ) {
				answer += minValue * m;
				count = m;
			}
			i--;
		}
		return answer;
	}

	//모의고사
	public static int[] solution58(int[] answers) {
		int[] minsu = new int[answers.length];
		int[] yeonghee = new int[answers.length];
		int[] taeho = new int[answers.length];

		int[] yArray = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
		int[] tArray = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		for (int i = 0; i < minsu.length; i++) {
			minsu[i] = (i % 5) + 1;
			yeonghee[i] = yArray[i % yArray.length];
			taeho[i] = tArray[i % tArray.length];
		}

		int minsuScore = 0;
		int yeongheeScore = 0;
		int taehoScore = 0;

		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == minsu[i])	minsuScore++;
			if (answers[i] == yeonghee[i])	yeongheeScore++;
			if (answers[i] == taeho[i])	taehoScore++;
		}

		int highestScore = Math.max(minsuScore, Math.max(yeongheeScore, taehoScore));

		List<Integer> answer = new ArrayList<>();
		if (minsuScore == highestScore)	answer.add(1);
		if (yeongheeScore == highestScore)	answer.add(2);
		if (taehoScore == highestScore)	answer.add(3);

		return answer.stream().mapToInt(i -> i).toArray();
	}

	//소수 만들기
	public int solution60(int[] nums) {
		int answer = 0;

		for (int i = 0; i < nums.length - 2; i++) {
			for (int j = i + 1; j < nums.length - 1; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					int sum = nums[i] + nums[j] + nums[k];
					if (isPrime(sum)) answer++;
				}
			}
		}
		return answer;
	}
	public boolean isPrime(int number) {
		//if (number < 2) return false;
		for (int i = 2; i * i <= number; i++)
			if (number % i == 0) return false;

		return true;
	}
}
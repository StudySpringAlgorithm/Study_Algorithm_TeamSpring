public class solutionsDay17 {

	//덧칠하기
	public int solution62(int n, int m, int[] section) {
		int answer = 0;
		int end;
		int done = 0;

//		for (int i = 0; i < section.length; i++) {
//			end = section[i] + m - 1;
//			answer++;
//			i = end;
//		}

		while (done < section.length) {
			end = section[done] + m - 1; //칠
			answer++; // 붓 횟수

			while (done < section.length && section[done] <= end)
				done++;
		}

		return answer;
	}

	//기사단원의 무기
	public int solution(int number, int limit, int power) {
		int answer = 0;
		int knightPower;

		for (int i = 1; i <= number; i++) {
			knightPower = div(i);
			if (knightPower > limit)
				answer += power;
			else
				answer += knightPower;
		}

		return answer;
	}

	public int div(int number) {
		int count = 0;

		for (int i = 1; i <= Math.sqrt(number); i++) {
			if (number % i == 0){
				count++;
				if (i != number /i)
					count++;
			}
		}

		return count;
	}

	// 로또의 최고 순위와 최저 순위
	public int[] solution65(int[] lottos, int[] win_nums) {

		int zero = 0;
		int match = 0;

		for (int i : lottos) {
			if (i == 0)
				zero++;
			else {
				for (int j : win_nums) {
					if (i == j)
						match++;
				}
			}
		}

		int lowRank = 7 - match;
		int highRank = lowRank - zero;

		lowRank = lowRank > 6 ? 6 : lowRank;
		highRank = highRank > 6 ? 6 : highRank;

		return new int[]{highRank, lowRank};
	}

}
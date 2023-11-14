public class solutionsDay11 {
	//이상한 문자 만들기
	//1114
	public String solution37(String s) {
		StringBuilder answer = new StringBuilder();
		int metBlack = 0;
		char[] tmpS = s.toCharArray();

		for (int i = 0; i < tmpS.length; i++) {
			char c = tmpS[i];


			if (tmpS[i] == ' ') {
				answer.append(c);
				metBlack = 0;
			} else {
				if (metBlack % 2 == 0)
					answer.append(Character.toUpperCase(c));
				else
					answer.append(Character.toLowerCase(c));
				metBlack++;
			}
		}
		return answer.toString();
	}

	//삼총사
	//1114
	public int solution38(int[] number) {
		int answer = 0;

		for (int first = 0; first < number.length - 2; first++) {
			for (int second = first + 1; second < number.length - 1; second++) {
				for (int third = second + 1; third < number.length; third++) {
					if (number[first] + number[second] + number[third] == 0)
						answer++;
				}
			}
		}

		return answer;
	}

	//크기가 작은 부분 문자열
	//1114
	public int solution39(String t, String p) {
		int answer = 0;
		char[] tmpT = t.toCharArray();
		Long target;
		Long longP = Long.parseLong(p);

		for (int i = 0; i <= t.length() - p.length(); i++) {
			target = 0L;
			for (int j = 0; j < p.length(); j++) {
				target = target * 10 + tmpT[i + j] - 48;
			}
			if (target <= longP)
				answer++;
		}

		return answer;
	}
}



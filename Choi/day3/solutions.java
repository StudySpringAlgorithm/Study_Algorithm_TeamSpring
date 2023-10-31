public class solutions {

	// 문자열을 정수로 바꾸기
	public int solution1(String s) {
		int answer;
		answer = Integer.parseInt(s);
		return answer;
	}

	// 문자열을 정수로 바꾸기 ver.2
	public int solution1_1(String s) {
		int answer = 0;
		boolean flag = false;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '+')
				continue;
			else if (s.charAt(i) == '-') {
				flag = true;
				continue;
			}
			answer = answer * 10 + s.charAt(i) - 48;
		}
		return flag ? answer * -1 : answer;
	}

	// 나머지가 1이 되는 수 찾기
	public int solution3(int n) {
		int answer = 1;
		while (answer++ < n) { if (n % answer == 1) return answer; }
		return answer;
	}

	// 자릿수 더하기
	public int solution6(int n) {
		int answer = 0;
		while (n > 0) {
			answer += n % 10;
			n /= 10;
		}
		return answer;
	}  

}

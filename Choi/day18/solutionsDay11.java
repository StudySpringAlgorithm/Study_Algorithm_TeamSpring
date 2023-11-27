public class solutionsDay18 {
// 옹알이 (2) // 50점
public int solution66(String[] babbling) {
		int answer = 0;

		for (String b : babbling) {
		String modified = b.replaceAll("aya|ye|woo|ma", "");

		if (modified.isEmpty())
		answer++;
		}

		return answer;
		}

// 옹알이 (2) // 55점
public int solution66_1(String[] babbling) {
		int answer = 0;
		char babyJustSaid = ' ';
		boolean babyCantBabbleIt;

		for (String b : babbling) {
		char[] tmp = b.replaceAll("aya", "1")
		.replace("ye", "2")
		.replace("woo", "3")
		.replace("ma", "4")
		.toCharArray();

		babyCantBabbleIt = true;

		for (char c : tmp) {
		if (babyJustSaid == c) {
		babyCantBabbleIt = false;
		break;
		}

		if (c != '1' && c != '2' && c != '3' && c != '4') {
		babyCantBabbleIt = false;
		break;
		}

		babyJustSaid = c;
		}

		if (babyCantBabbleIt)
		answer++;
		}

		return answer;
		}

// 옹알이 (2)
public int solution66_2(String[] babbling) {
		int answer = 0;

		for (String b : babbling) {
		String replaced = b.replaceAll("aya", "1")
		.replaceAll("ye", "2")
		.replaceAll("woo", "3")
		.replaceAll("ma", "4");

		if (replaced.matches("^[1234]+$") &&
		!replaced.contains("11") &&
		!replaced.contains("22") &&
		!replaced.contains("33") &&
		!replaced.contains("44")) {
		answer++;
		}
		}

		return answer;
		}

// 숫자 짝궁  // 시간 초과
public String solution67(String X, String Y) {
		StringBuilder answer =new StringBuilder();
		List<Character> tmp = new ArrayList<>();

		char[] tmpX = X.toCharArray();
		char[] tmpY = Y.toCharArray();

		for (char x : tmpX) {
		for (int i = 0; i < tmpY.length; i++) {
		if (x == tmpY[i]) {
		tmp.add(x);
		tmpY[i] = 'x';
		break;
		}
		}
		}

		if (tmp.isEmpty())
		return "-1";

		Collections.sort(tmp, Collections.reverseOrder());

		for (char c : tmp)
		answer.append(c);

		String result = answer.toString();
		if (result.matches("0+"))
		return "0";

		return result;
		}

// 숫자 짝궁
public String solution67_1(String X, String Y) {
		Map<Character, Integer> tmpX = new HashMap<>();
		Map<Character, Integer> tmpY = new HashMap<>();
		List<Character> commonNumbers = new ArrayList<>();
		StringBuilder answer = new StringBuilder();


		for (char c : X.toCharArray())
		tmpX.put(c, tmpX.getOrDefault(c, 0) + 1);

		for (char c : Y.toCharArray())
		tmpY.put(c, tmpY.getOrDefault(c, 0) + 1);

		for (char c : tmpX.keySet()) {
		if (tmpY.containsKey(c)) {
		int min = Math.min(tmpX.get(c), tmpY.get(c));
		for (int i = 0; i < min; i++)
		commonNumbers.add(c);
		}
		}

		if (commonNumbers.isEmpty())
		return "-1";

		Collections.sort(commonNumbers, Collections.reverseOrder());

		for (char c : commonNumbers)
		answer.append(c);

		return answer.toString().matches("0+") ? "0" : answer.toString();
		}

// 체육복
public int solution68(int n, int[] lost, int[] reserve) {
		int[] spare = new int[n];
		int answer = 0;

		for (int i : lost)
		spare[i - 1]--;
		for (int i : reserve)
		spare[i - 1]++;

		for (int i = 0; i < spare.length; i++) {
		if (spare[i] == -1) {
		if (i > 0 && spare[i - 1] == 1) {
		spare[i]++;
		spare[i - 1]--;
		} else if (i < spare.length - 1 && spare[i + 1] == 1) {
		spare[i]++;
		spare[i + 1]--;
		}
		}
		}

		for (int i : spare)
		if (i >= 0) answer++;
		return answer;
		}

}



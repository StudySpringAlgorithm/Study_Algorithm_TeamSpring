public class solutionsDay12 {
//
//	// 최소직사각형
//	//1115
//	public int solution41(int[][] sizes) {
//		int x = 0;
//		int y = 0;
//
//		for (int[] i : sizes) {
//			Arrays.sort(i);
//			if (i[0] > x)
//				x = i[0];
//			if (i[1] > y)
//				y = i[1];
//		}
//
//		return x * y;
//	}
//
//	//시저암호
//	//1115
//	public static String solution42(String s, int n) {
//		char[] tmpS = s.toCharArray();
//		StringBuilder answer = new StringBuilder();
//
//		for (char c : tmpS)
//			answer.append(ceasar(c,n));
//
//		return answer.toString();
//	}
//
//	public static char ceasar(char c, int n) {
//		if ('a' <= c && c <= 'z') {
//			c += n;
//			if (c > 'z')
//				c -= 26;
//		} else if ('A' <= c && c <= 'Z') {
//			c += n;
//			if (c > 'Z')
//				c -= 26;
//		}
//		return c;
//	}
//
//	//숫자 문자열과 영단어
//	//1115
//	public int solution43(String s) {
//		int answer = 0;
//		int[] arrayTmp = new int[2];
//
//		while (!s.isEmpty()) {
//			answer *= 10;
//
//			if (!('0' <= s.charAt(0) && s.charAt(0) <= '9')) {
//				arrayTmp = stringToNumber(s);
//				answer += arrayTmp[0];
//				s = s.substring(arrayTmp[1]);
//			} else {
//				answer += s.charAt(0) - '0';
//				s = s.substring(1);
//			}
//		}
//		return answer;
//	}
//
//	public int[] stringToNumber(String s) {
//		String[] numberString = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
//		int i;
//		int j = 0;
//
//		for (i = 0; i < numberString.length; i++) {
//			if (s.startsWith(numberString[i]))
//				break;
//		}
//
//		j = switch (i) {
//			case 0, 4, 5, 9 -> 4;
//			case 1, 2, 6 -> 3;
//			case 3, 7, 8 -> 5;
//			default -> j;
//		};
//
//		return new int[] {i, j};
//	}

}



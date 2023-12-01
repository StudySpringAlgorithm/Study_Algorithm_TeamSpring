public class solutionsDay23 {

	//JadenCase 문자열 만들기 //2
//	public static String solution25(String s) {
//
//		String answer = "";
//
//		char[] tmpArray = s.toCharArray();
//
//		for (int i = 0; i < tmpArray.length; i++) {
//			if (tmpArray[i] == ' ') {
//				if(i + 1 < tmpArray.length && 'a' <= tmpArray[i + 1] && tmpArray[i + 1] <= 'z') {
//					tmpArray[i + 1] -= 32;
//				}
//			} else if ('a' < tmpArray[i] && tmpArray[i] < 'z') {
//				if(i > 0 && ' ' == tmpArray[i - 1]) {
//					break;
//				} else if (i + 1 < tmpArray.length)
//					tmpArray[i + 1] += 32;
//			}
//			answer += tmpArray[i];
//		}
//
//		return answer;
//	}

	//JadenCase 문자열 만들기 //2
	public static String solution25(String s) {

		String answer = "";
		char[] tmpArray = s.toCharArray();

		if ('a' <= tmpArray[0] && tmpArray[0] <= 'z')
			tmpArray[0] -= 32;
		for (int i = 0; i < tmpArray.length; i++){
			if (i != 0 && tmpArray[i - 1] == ' ' && 'a' <= tmpArray[i] && tmpArray[i] <= 'z')
				tmpArray[i] -= 32;
			else if (i != 0 && tmpArray[i - 1] != ' ' && 'A' <= tmpArray[i] && tmpArray[i] <= 'Z')
				tmpArray[i] += 32;
		}

		return new String(tmpArray);
	}

	//이진 변환 반복하기
	public int[] solution84(String s) {
		int removeZero = 0;
		int diversionCount = 0;

		while (!s.equals("1")) {
			diversionCount++;

			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '0')
					removeZero++;
			}
			s = s.replace("0", "");
			s = Integer.toBinaryString(s.length());
		}

		return new int[] {diversionCount, removeZero};
	}

}



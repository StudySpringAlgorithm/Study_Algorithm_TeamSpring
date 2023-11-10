//public class solutionsDay10 {
//
//	// 문자열 내림차순으로 배치하기
//	public String solution(String s) {
//		String answer = "";
//		char[] tmp = s.toCharArray();
//		Arrays.sort(tmp);
//		for (int i = s.length() - 1; 0 <= i; i--)
//			answer = answer + tmp[i];
//		return answer;
//	}
//
//	// 문자열 내림차순으로 배치하기 2
//	public String solution(String s) {
//		char[] tmp = s.toCharArray();
//		Arrays.sort(tmp);
//		return new StringBuilder(new String (tmp)).reverse().toString();
//	}
//
//	//부족한 금액 계산하기
//	public long solution(int price, int money, int count) {
//
//		long answer = money * -1;
//		//(count * (count + 1) / 2
//		for (int i = 0; i < count; i++)
//			answer += (long)price * (i + 1);
//
//		return answer > 0 ? answer : 0;
//	}
//
//	public boolean solution(String s) {
//
//		char[] tmpArray = s.toCharArray();
//
//		if (s.length() != 4 && s.length() != 6) {
//			return false;
//		}
//
//		for (int i : tmpArray) {
//			if (!('0' <= i && i <= '9')) {
//				return false;
//			}
//		}
//
//		return true;
//	}
//
//}
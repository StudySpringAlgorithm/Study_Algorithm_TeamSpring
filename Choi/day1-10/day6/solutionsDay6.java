//public class solutionsDay6 {
//
//	//음양 더하기
//	//1107
//	public int solution13(int[] absolutes, boolean[] signs) {
//
//		int tmp;
//		int answer = 0;
//
//		for (int i = 0; i < absolutes.length; i++) {
//			tmp = absolutes[i];
//			if (!(signs[i]))
//				tmp *= -1;
//			answer += tmp;
//		}
//
//		return answer;
//	}
//
//	//나누어 떨어지는 숫자 배열
//	//1107
//	public int[] solution14(int[] arr, int divisor) {
//
//		int[] answer;
//		List<Integer> integerList = new ArrayList<>();
//
//		for (int i = 0; i < arr.length; i++) {
//			if(arr[i] % divisor == 0)
//				integerList.add(arr[i]);
//		}
//
//		integerList.sort(Comparator.naturalOrder());
//		answer = integerList.stream().mapToInt(i -> i).toArray();
//
//		return (integerList.isEmpty()) ? new int[]{-1} : answer;
//	}
//
//	//없는 숫자 더하기
//	//1107
//	public int solution16(int[] numbers) {
//		int answer = 45;
//		for(int i : numbers)answer -= i;
//		return answer;
//	} // 이중 for문 버려
//
//}
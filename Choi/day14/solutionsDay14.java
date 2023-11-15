public class solutionsDay14 {
//	//두개 뽑아서 더하기
//	public int[] solution48(int[] numbers) {
//		Set<Integer> answer = new HashSet<>();
//
//		for (int i = 0; i < numbers.length - 1; i++) {
//			for (int j = i + 1; j < numbers.length; j++)
//				answer.add(numbers[i] + numbers[j]);
//		}
//
//		return answer.stream().sorted().mapToInt(i -> i).toArray();
//	}
//
//	// 가장 가까운 글자
//	public int[] solution49(String s) {
//		int[] answer = new int[s.length()];
//		char[] tmpS = s.toCharArray();
//
//		Map<Character, Integer> words = new HashMap<>();
//
//		for (int i = 0; i < tmpS.length; i++) {
//			if (words.containsKey(tmpS[i]))
//				answer[i] = i - words.get(tmpS[i]);
//			else
//				answer[i] = -1;
//			words.put(tmpS[i], i);
//		}
//
//		return answer;
//	}
//
//	//푸드 파이트 대회
////	public String solution50(int[] food) {
////		List<Integer> foodList = new ArrayList<>();
////		int[] kcal = new int[food.length - 1];
////
////		for (int i = 1; i < food.length; i++)
////			kcal[i - 1] = food[i] / 2;
////
//////		int heavy= 1;
//////
//////		for (int k : kcal) {
//////			for (int j = 0; j < k; j++)
//////				foodList.add(heavy);
//////			heavy++;
//////		}
////
////		for (int i = 0; i < kcal.length; i++) {
////			for (int j = 0; j < kcal[i]; j++)
////				foodList.add(i + 1);
////		}
////
////		foodList.add(0);
////
////		for (int i = foodList.size() - 2; i >= 0; i--)
////			foodList.add(foodList.get(i));
////
////		return foodList.stream().map(String::valueOf).collect(Collectors.joining());
////	}
//	//푸드 파이트 대회
//	public String solution50(int[] food) {
//		StringBuilder foodTable = new StringBuilder();
//
//		for (int i = 1; i < food.length; i++) {
//			for (int j = 0; j < food[i] / 2; j++)
//				foodTable.append(i);
//		}
////		for (int i = 1; i < food.length; i++)
////			foodTable.append(String.valueOf(i).repeat(Math.max(0, food[i] / 2)));
//
//		foodTable.append("0");
//
//		for (int i = food.length - 1; i > 0; i--) {
//			for (int j = 0; j < food[i] / 2; j++)
//				foodTable.append(i);
//		}
//
//		return foodTable.toString();
//	}
//
//	//콜라 문제
//	public static int solution51(int a, int b, int n) {
//		int answer = 0;
//		int remainder;
//
//		while ( n >= a ) {
//			answer += n / a * b;
//			remainder = n % a;
//			n = n / a * b + remainder;
//		}
//
//		return answer;
//	}

}



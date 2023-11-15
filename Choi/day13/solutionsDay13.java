//public class solutionsDay13 {
//	// 문자열 내 마음대로 정렬하기
//	//1116
//	public String[] solution44(String[] strings, int n) {
//
//
//
//		Arrays.sort(strings, new Comparator<String>() {
//			@Override
//			public int compare(String o1, String o2) {
//				if (o1.charAt(n) != o2.charAt(n))
//					return o1.charAt(n) - o2.charAt(n);
//				return o1.compareTo(o2);
//			}
//		});
//		return strings;
//	}
//
//	// k번째 수
//	//1116
//	public int[] solution46(int[] array, int[][] commands) {
//		int [] answer = new int[commands.length];
//
//		for (int i = 0; i < commands.length; i++) {
//			int[] tmp = new int[commands[i][1] - commands[i][0] + 1];
//
//			int count = 0;
//			for (int j = commands[i][0]; j <= commands[i][1]; j++)
//				tmp[count++] = array[j - 1];
//
//			Arrays.sort(tmp);
//
//			answer[i] = tmp[commands[i][2] - 1];
//		}
//
//		return answer;
//	}
//
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
//}



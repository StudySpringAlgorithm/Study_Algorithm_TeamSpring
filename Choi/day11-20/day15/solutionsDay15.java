public class solutionsDay15 {

	public static String solution54(String[] cards1, String[] cards2, String[] goal) {
		List<String> c1List = new ArrayList<String>(Arrays.asList(cards1));
		List<String> c2List = new ArrayList<String>(Arrays.asList(cards2));

		for (String target : goal) {
			if (!c1List.isEmpty() && c1List.get(0).equals(target))
				c1List.remove(0);
			else if (!c2List.isEmpty() && c2List.get(0).equals(target))
				c2List.remove(0);
			else
				return "No";
		}
		return "Yes";
	}

	public String solution55(int a, int b) {
		String[] days = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
		int[] monthDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int totalDays = b - 1;

		for (int i = 0; i < a - 1; i++)
			totalDays += monthDays[i];

		return days[totalDays % 7];
	}

	public int[] solution56(int k, int[] score) {
		Queue<Integer> hall = new PriorityQueue<>();
		int[] result = new int[score.length];

		for (int i = 0; i < score.length; i++) {
			if (hall.size() < k)
				hall.offer(score[i]);
			else {
				if (score[i] > hall.peek()) {
					hall.poll();
					hall.offer(score[i]);
				}
			}
			result[i] = hall.peek();
		}

		return result;
	}
}
public class solutionsDay7 {

	//핸드폰 번호 가리기
	public String solution(String phone_number) {

		char[] tmp = phone_number.toCharArray();
		for (int i = 0; i < phone_number.length(); i++) {
			if (i < phone_number.length() - 4)
				tmp[i] = '*';
		}
		return String.valueOf(tmp);
	}

	//제일 작은 수 제거하기
	public int[] solution(int[] arr) {
		int minPoint = 0;
		List<Integer> tmp = new ArrayList<>();

		if (arr.length == 1)
			return new int[]{-1};

		minPoint = arr[0];

		for (int i = 0; i < arr.length; i++)
			if (minPoint > arr[i]) minPoint = arr[i];

		for (int i = 0; i < arr.length; i++)
			if (!(minPoint == arr[i])) tmp.add(arr[i]);

		return tmp.stream().mapToInt(i -> i).toArray();
	}

	// 가운데 글자 가져오기
	public String solution(String s) {

		char[] tmp = s.toCharArray();
		String answer = "";

		if ((s.length() % 2) == 0)
			answer += tmp[s.length()/2 - 1];
		answer += tmp[s.length()/2];

		return answer;
	}

}
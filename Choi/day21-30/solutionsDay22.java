public class solutionsDay22 {

	// 신고 결과 받기
	public int[] solution79(String[] id_list, String[] report, int k) {
		Map<String, User79> user = new HashMap<>();
		int[] answer = new int[id_list.length];
		//Map k v

		for (String s : id_list) {
			User79 nullList = new User79();
			user.put(s, nullList);
		}

		for (String s : report) {
			String[] reporting = s.split(" ");

			String reporte_R_Id = reporting[0]; // 신고자
			String reporte_D_Id = reporting[1]; // 신고당한 사람

			User79 reporter = user.get(reporte_R_Id);
			User79 reported = user.get(reporte_D_Id);

			// 중복신고
			if (!reporter.reportUser.contains(reporte_D_Id)) {
				reporter.reportUser.add(reporte_D_Id);
				reported.whoReportMe.add(reporte_R_Id);
			}
		}
		for (int i = 0; i < answer.length; i++) {
			User79 mailedUser = user.get(id_list[i]);

			for (String reportedId : mailedUser.reportUser) {
				User79 reported = user.get(reportedId);

				if (reported.whoReportMe.size() >= k)
					answer[i]++;
			}
		}
		return answer;
	}

	class User79 {
		List<String> reportUser;
		List<String> whoReportMe;

		public User79() {
			this.reportUser = new ArrayList<>();
			this.whoReportMe = new ArrayList<>();
		}
	}

	//최댓값과 최솟값
	public String solution81(String s) {
		String[] arrayS = s.split(" ");
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (String sInt : arrayS) {
			int tmpInt = Integer.parseInt(sInt);
			if (tmpInt < min)
				min = tmpInt;
			if (tmpInt > max)
				max = tmpInt;
		}

		return min + " " + max;
	}

	public String solution81_1(String s) {
		int Max = -2147483648;
		int min = 2147483647;
		int tmpArray[] = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();

		for (int i : tmpArray) {
			if (Max < i)
				Max = i;
			if (min > i)
				min = i;
		}

		return min + " " + Max;
	}

}



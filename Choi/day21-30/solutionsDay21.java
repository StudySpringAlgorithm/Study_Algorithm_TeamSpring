public class solutionsDay21 {

	//개인정보 수집 유효기간
	public int[] solution76(String today, String[] terms, String[] privacies) {
		List<Integer> answer = new ArrayList<>();


		// today	terms	privacies	result
		//"2022.05.19"	["A 6", "B 12", "C 3"]	["2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"]	[1, 3]
		//"2020.01.01"	["Z 3", "D 5"]	["2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"]	[1, 4, 5]

		String[][] termsArray = new String[terms.length][2];
		String[][] privaciesArray = new String[privacies.length][4];

		for (int i = 0; i < terms.length; i++) {
			termsArray[i] = terms[i].split(" ");
		}

		for (int i = 0; i < privacies.length; i++) {
			privaciesArray[i][0] = String.valueOf(privacies[i].charAt(11));
			privaciesArray[i][1] = privacies[i].substring(0, 10); // 날짜 문자열 직접 저장
		}

		for (int i = 0; i < privaciesArray.length; i++) {
			for (int j = 0; j < termsArray.length; j++) {
				if (privaciesArray[i][0].equals(termsArray[j][0])) { // 문자열 비교는 equals 사용
					if (checkDDay(today, termsArray[j], privaciesArray[i][1]))
						answer.add(i + 1);
				}
			}
		}

		int[] answerArray = new int[answer.size()];
		for (int i = 0; i < answer.size(); i++)
			answerArray[i] = answer.get(i);

		return answerArray;
	}

	public boolean checkDDay(String today, String[] termsArray, String privaciesDateStr) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
		LocalDate todayDate = LocalDate.parse(today, formatter);
		LocalDate privacyDate = LocalDate.parse(privaciesDateStr, formatter);

		int monthsToAdd = Integer.parseInt(termsArray[1]);
		LocalDate expiryDate = privacyDate.plusMonths(monthsToAdd);

		return expiryDate.isBefore(todayDate) || expiryDate.isEqual(todayDate);
	}


	// 달리기 경주
	public String[] solution77(String[] players, String[] callings) {
		Map<String, Integer> playerRanks = new HashMap<>();
		String tmpName;
		int tmpRank;

		for (int i = 0; i < players.length; i++)
			playerRanks.put(players[i], i);

		for (String name : callings) {
			tmpRank = playerRanks.get(name);
			tmpName = players[tmpRank - 1];

			players[tmpRank - 1] = name;
			players[tmpRank] = tmpName;

			playerRanks.put(name, tmpRank - 1);
			playerRanks.put(tmpName, tmpRank);
		}

		return players;
	}

}



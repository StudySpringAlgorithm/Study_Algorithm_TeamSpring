public class solutionsDay20 {


	// 햄버거
	public int solution73(int[] ingredient) {
		Queue<Integer> dishIngredient = new LinkedList<>();
		int[] dish = new int[4];
		int answer = 0;

		for (int i = 0; i < ingredient.length; i++) {
			dishIngredient.add(ingredient[i]);
			if (dishIngredient.size() >= 4 && i < ingredient.length - 3) {

				for (int j = 0; j < 4; j++)
					dish[j] = dishIngredient.poll();

				if (isItGoodBugger(dish))
					answer++;
				else {
					for (int j = 0; j < 4; j--)
						dishIngredient.add(dish[j]);
				}
			}
		}

		return answer;
	}

	public boolean isItGoodBugger(int[] dish) {

		int[] goodBugger = new int[]{1, 3, 2, 1};

		for (int i = 0; i < dish.length; i++) {
			if (dish[i] != goodBugger[i])
				return false;
		}

		return true;
	}

	// 햄버거
	public int solution73_1(int[] ingredient) {
		Queue<Integer> dishIngredient = new LinkedList<>();
		int answer = 0;

		for (int i : ingredient) {
			dishIngredient.add(i);

			if (dishIngredient.size() >= 4) {
				List<Integer> tmpDish = new LinkedList<>(dishIngredient);

				if (tmpDish.get(0) == 1 && tmpDish.get(1) == 2 && tmpDish.get(2) == 3 && tmpDish.get(3) == 1) {
					answer++;

					for (int j = 0; j < 4; j++)
						dishIngredient.poll();

				}
			}
		}
		return answer;

	}

	// 햄버거 // 완
	public int solution73_2(int[] ingredient) {
		int goodBugger = 0;
		List<Integer> dishIngredient = new ArrayList<>();

		for (int i : ingredient) {
			dishIngredient.add(i);

			if (dishIngredient.size() > 3) {
				if (dishIngredient.get(dishIngredient.size() - 1) == 1
						&& dishIngredient.get(dishIngredient.size() - 2) == 3
						&& dishIngredient.get(dishIngredient.size() - 3) == 2
						&& dishIngredient.get(dishIngredient.size() - 4) == 1) {

					goodBugger++;

					for (int j = 0; j < 4; j++)
						dishIngredient.remove(dishIngredient.size() - 1);

				}
			}
		}
		return goodBugger;
	}

	// 성격 유형 검사하기
	public static String solution74(String[] survey, int[] choices) {
		StringBuilder answer = new StringBuilder();
		int[] score = new int[4];

		for (int i = 0; i < survey.length; i++) {
			char c = survey[i].charAt(1);

			switch (c) {
				case 'R' ->	score[0] += choices[i] - 4;
				case 'T' -> score[0] -= choices[i] - 4;

				case 'C' -> score[1] += choices[i] - 4;
				case 'F' -> score[1] -= choices[i] - 4;

				case 'J' -> score[2] += choices[i] - 4;
				case 'M' -> score[2] -= choices[i] - 4;

				case 'A' -> score[3] += choices[i] - 4;
				case 'N' -> score[3] -= choices[i] - 4;
			}
		}

		answer.append(score[0] >= 0 ? "R" : "T");
		answer.append(score[1] >= 0 ? "C" : "F");
		answer.append(score[2] >= 0 ? "J" : "M");
		answer.append(score[3] >= 0 ? "A" : "N");

		return answer.toString();
	}


	// 바탕화면 정리
	public int[] solution75(String[] wallpaper) {
		int min_x = Integer.MAX_VALUE;
		int min_y = Integer.MAX_VALUE;
		int max_x = -1;
		int max_y = -1;

		for (int i = 0; i < wallpaper.length; i++) {
			for (int j = 0; j < wallpaper[i].length(); j++) {
				if (wallpaper[i].charAt(j) == '#') {
					min_x = Math.min(min_x, i);
					min_y = Math.min(min_y, j);
					max_x = Math.max(max_x, i);
					max_y = Math.max(max_y, j);
				}
			}
		}

		max_x += 1;
		max_y += 1;

		return new int[]{min_x, min_y, max_x, max_y};
	}


}
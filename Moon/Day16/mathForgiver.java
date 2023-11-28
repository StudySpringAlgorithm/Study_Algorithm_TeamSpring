package Day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class mathForgiver {

    public static void main(String[] args) {
        int[] case1 = {1,2,3,4,5};
        int[] case2 = {1,3,2,4,2};

        for (int num : solution(case1)) {
            System.out.println(num);
        }

        for (int num : solution(case2)) {
            System.out.println(num);
        }

    }

    private static int[] solution(int[] answers) {

        int[] scores = new int[3];

        scores[0] = gildong1(answers);
        scores[1] = minsu2(answers);
        scores[2] = hayuel3(answers);

        return null;
    }

    private static int gildong1(int[] answer) {
        int score = 0;
        for (int i = 0; i < answer.length; i++) {
            int forgiverChoseAnswer = (i % 5) + 1;

            if (answer[i] == forgiverChoseAnswer) {
                score++;
            }
        }
        return score;
    }
    private static int minsu2(int[] answer) {
        int score = 0;
        for (int i = 0; i < answer.length; i++) {
            int forgiverChoseAnswer = 0;
            if (i % 2 == 0) {
                forgiverChoseAnswer = 2;
            } else {
                forgiverChoseAnswer = (i / 2) % 5 + 1;
            }

            if (answer[i] == forgiverChoseAnswer) {
                score++;
            }
        }
        return score;
    }
    private static int hayuel3(int[] answer) {
        int score = 0;
        for (int i = 0; i < answer.length; i++) {
            int [] pattern = {3, 1, 2, 4, 5};
            int index = i % pattern.length;
            int forgiverChoseAnswer = pattern[index];

            if (answer[i] == forgiverChoseAnswer) {
                score++;
            }
        }
        return score;
    }
}

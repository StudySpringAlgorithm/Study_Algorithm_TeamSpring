package Day15;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class CardBundle {
    public static void main(String[] args) {

    }

    private static String solution(String[] cards1, String[] cards2, String[] goal) {
        String[] answer = new String[goal.length];
        Queue<String> queue1 = new LinkedList<>();
        for (String card : cards1) {
            queue1.offer(card);
        }
        Queue<String> queue2 = new LinkedList<>();
        for (String card : cards2) {
            queue2.offer(card);
        }

        for (int i = 0; i < goal.length; i++) {
            if (goal[i].equals(queue1.peek())) {
                answer[i] = queue1.poll();
            }
            if (goal[i].equals(queue2.peek())) {
                answer[i] = queue2.poll();
            }
        }

        if (Arrays.equals(goal, answer)) {
            return "Yes";
        } else {
            return "No";
        }
    }
}

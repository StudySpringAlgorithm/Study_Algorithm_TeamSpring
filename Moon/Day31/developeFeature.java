package Day31;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class developeFeature {

    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};

        for (int num : solution(progresses, speeds)) {
            System.out.print(num + " ");
        }

    }

    private static int[] solution (int[] progresses, int[] speeds) {

        List<Integer> answer = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            queue.add((100 - progresses[i]) / speeds[i]);
        }

        int count = 1;
        int first = queue.poll();

        while (!queue.isEmpty()) {
            if (first > queue.peek()) {
                count++;
                queue.poll();
            } else {
                answer.add(count);
                queue.poll();
                count = 1;
            }

        }
        answer.add(count);

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

}

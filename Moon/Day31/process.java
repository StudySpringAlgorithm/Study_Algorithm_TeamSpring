package Day31;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class process {

    public static void main(String[] args) {
        int[] priorities = {2, 1, 3, 2};
        int location = 2;

        System.out.println(answer(priorities, location));

    }

    private static int answer(int[] priorities, int location) {
        // 우선순위 큐 선언(내림 차순)
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        int answer = 0;

        // 우선순위 큐에 우선순위 요소 추가
        for (int i : priorities) {
            queue.offer(i);
        }

        // 큐가 빌 때까지 반복
        while (!queue.isEmpty()) {
            // 기존 우선순위 배열 순회
            for (int i = 0; i < priorities.length; i++) {
                // 현재 작업의 위치 찾기
                if (queue.peek() == priorities[i]) {
                    queue.poll();
                    answer++;

                    // 현재 작업이 location과 같으면 answer 반환
                    if (location == i) {
                        return answer;
                    }
                }
            }
        }

        return answer;
    }

    private static int solution(int[] intPriorities, int location) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();

        intPriorities[location] = 0;

        for (int num : intPriorities) {
            queue.add(num);
        }

        Integer[] priorities = Arrays.stream(intPriorities).boxed().toArray(Integer[]::new);
        Arrays.sort(priorities, Collections.reverseOrder());

        int index = 0;
        while (!queue.isEmpty()) {
            int target = queue.peek();

            if (target == priorities[index]) {
                if (target == 0) {
                    System.out.println("찾았따");
                    return answer;
                }

                if (target == priorities[index]) {
                    index++;
                    answer++;
                    queue.poll();
                    continue;
                }
            }

            queue.add(target);
            queue.poll();

        }

        return answer;
    }

}

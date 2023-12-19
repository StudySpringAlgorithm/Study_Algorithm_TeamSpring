package Day32;

public class TargetNum {

    private static int count = 0;
    public static void main(String[] args) {
        int[] numbers = {1,1,1,1,1};
        int target = 3;

        System.out.println(solution(numbers, target));

    }

    public static int solution(int[] numbers, int target) {
        int answer = 0;
        dfs(numbers, 0, target, 0);

        answer = count;
        return answer;
    }

    public static void dfs(int[] numbers, int depth, int target, int result) {
        if (depth == numbers.length) {
            if (target == result) {
                count++;
            }
            return;
        }

        int plus = result + numbers[depth];
        int minus = result - numbers[depth];

        dfs(numbers, depth+1, target, plus);
        dfs(numbers, depth+1, target, minus);
    }
}

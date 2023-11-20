package Day14;

public class foodFighter {

    public String solution(int[] food) {
        StringBuffer left = new StringBuffer();
        System.out.println();
        for (int i = 1; i < food.length; i++) {
            int foodNum = food[i];
            if (foodNum % 2 != 0) {
                foodNum--;
                // 0일 경우 스킵
                if (foodNum == 0) {
                    continue;
                }
            }
            for (int j = 0; j < foodNum/2; j++) {
                left.append(i);
            }
        }
        String answer = left + "0";
        StringBuffer right = left.reverse();
        answer += right;
        return answer;
    }
}

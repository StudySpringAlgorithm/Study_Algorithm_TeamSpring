package Day13;

import java.util.ArrayList;

public class kNum {
    public static void main(String[] args) {

    }

    private static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j = commands[i][0]; j <= commands[i][1]; j++) {
                temp.add(array[j-1]);
            }
            temp.sort(null);
            int indexNum = temp.get(commands[i][2] - 1);
            answer[i] = indexNum;
        }
        return answer;
    }
}

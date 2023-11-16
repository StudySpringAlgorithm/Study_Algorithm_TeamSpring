package Chang.day13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class twosum {

    public int[] solution(int[] numbers) {
        int[] answer = {};
        List<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){
                int sum = numbers[i] + numbers[j];
                if(!list.contains(sum)){
                    list.add(sum);
                }
            }
        }
        list.sort(null);
        answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}

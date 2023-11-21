## 모의고사
```java
import java.util.*;
class Solution {
    private static int[][] supo = {
        {1, 2, 3, 4, 5},
        {2, 1, 2, 3, 2, 4, 2, 5},
        {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}        
    };
    
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] correct = new int[3];
        for(int i = 0; i < answers.length; i++){
            for(int j = 0; j < 3; j++){
                int size = supo[j].length;
                if(answers[i] == supo[j][i % size]){
                    correct[j]++;
                }
            }
        }
        int max = 0;
        
        for(int i = 0; i < correct.length; i++){
            max = Math.max(max, correct[i]);
        }
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < correct.length; i++){
            if(max == correct[i]){
                list.add(i+1);
            }
        }
        
        answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
```

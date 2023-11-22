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

## 과일장수
```java
import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int[] arr = new int[score.length / m];
        
        Arrays.sort(score);
        
        for(int i = score.length; i >= m; i-=m){
            answer += score[i - m] * m;
        }
        return answer;
    }
}
```

## 소수 만들기
```java
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
 
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                for(int k = j + 1; k < nums.length; k++){
                    if(isPrime(nums[i] + nums[j] + nums[k])){
                        answer++;
                    }
                }
            }
        }


        return answer;
    }
    
    private boolean isPrime(int num){
        if(num == 0 || num == 1){
            return false;
        }
        
        for(int i = 2; i < num / 2; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;        
    }
}
```
## 명예의 전당 (1)
```java
import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for(int i = 0; i < score.length; i++){
            queue.add(score[i]);

            if(queue.size() > k){
                queue.poll();
            }
            answer[i] = queue.peek();
        }

        return answer;
    }
}
```

## 2016년
```java
class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] lastDay = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int count = -1;
        for(int i = 1; i < a; i++){
            count += lastDay[i-1];
        }
        
        return day[(count+b)%7];
    }
}
```

## 카드 뭉치
```java
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        boolean check = true;
        int index1 = 0;
        int index2 = 0;
        
        for(int i = 0; i < goal.length; i++){
            if(index1 < cards1.length && cards1[index1].equals(goal[i])){
                index1++;
            }else if(index2 < cards2.length && cards2[index2].equals(goal[i])){
                index2++;
            }else{
                check = false;
            }
        }
        return !check ? "No" : "Yes";
    }
}
```


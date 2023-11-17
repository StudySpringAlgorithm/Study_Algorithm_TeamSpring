## 가장 가까운 같은 글자

```java
import java.util.*;
class Solution {
    public static int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> map = new HashMap<>();
    
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            answer[i] = i - map.getOrDefault(ch, i+1);
            map.put(ch, i);
        }
        return answer;
    }
}
```

## 푸드 파이트 대회
```java
class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();

        for (int i = food.length - 1; i > 0; i--) {
            int value = food[i] / 2;
            sb.append(String.valueOf(i).repeat(value));
        }
        
        String answer = sb.toString();
        
        return sb.reverse().append("0").append(answer).toString();
    }
}
```

## 콜라 문제
```java
class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while(n >= a){
            answer += (n / a) * b;
            n = ((n / a) * b) + (n % a);
        }
        return answer;
    }
}

```
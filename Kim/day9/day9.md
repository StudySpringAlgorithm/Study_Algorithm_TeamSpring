## 문자열 내림차순으로 배치하기
```java
import java.util.*;
class Solution {
    public String solution(String s) {
        String[] str = s.split("");
        Arrays.sort(str, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for(String a : str){
            sb.append(a);
        }
        return sb.toString();
    }
}
```

## 부족한 금액 계산하기
```java
class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long sum = 0;
        for(int i = 1; i <= count; i++){
            sum += price * i;
        }
    
        answer = money - sum > 0 ? 0 :Math.abs(money - sum);
    
        return answer;
    }
}
```

## 문자열 다루기 기본
```java
class Solution {
    public boolean solution(String s) {
        if (s.length() == 4 || s.length() == 6) return s.matches("(^[0-9]*$)");
        return false;
    }
}
```
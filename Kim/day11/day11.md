## 이상한 문자 만들기
```java
class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] arr = s.split("");
        int index = 0;

        for (String str : arr) {
            if (" ".equals(str)) {
                index = 0;
                sb.append(str);
            } else {
                sb.append(index++ % 2 == 0 ? str.toUpperCase() : str.toLowerCase());
            }
        }

        return sb.toString();
    }
}
```

## 삼총사
```java
class Solution {
    public int solution(int[] number) {
        int answer = 0;
        
        for(int i = 0; i < number.length; i++){
            for(int j = i + 1; j < number.length; j++){
                for(int k = j + 1; k < number.length; k++){
                    if(number[i] + number[j] + number[k] == 0){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}
```

## 크기가 작은 부분
```java
import java.util.*;
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int plen = p.length();
        long num = Long.parseLong(p);
        
        for(int i = 0; i <= t.length() - plen; i++){
            long a = Long.parseLong(t.substring(i, i + plen));
            if(a <= num){
                answer++;
            }
        }
        return answer;
    }
}
```
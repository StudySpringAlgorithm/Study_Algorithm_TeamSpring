## 정수 제곱근 판별
```java
class Solution {
    public long solution(long n) {
      double sqrt = Math.sqrt(n);
      return Math.pow((int)sqrt, 2) == n ? (long) Math.pow(sqrt + 1, 2) : -1;
    }
}
```

## 정수 내림차순으로 배치하기
```java
import java.util.*;
class Solution {
    public long solution(long n) {
      char[] arr = String.valueOf(n).toCharArray();
      Arrays.sort(arr);
  
      String str = "";
      for(int i = s.length()-1; i >= 0; i--){
        str += arr[i];
      }
      
      return Long.parseLong(str);
    }
  
    public long streamSolution(long n) {
      String[] arr = String.valueOf(n).split("");
      Arrays.sort(arr, Comparator.reverseOrder());
      String result = Arrays.stream(arr).map(String::valueOf).collect(Collectors.joining());
  
      return Long.parseLong(result);
    }
}
```
- `sorted(Comparator.reverseOrder())` : 스트림의 요소를 큰 순서로 정렬
- `map(String::valueOf)` : 스트림의 각 요소를 문자열로 반환
- `collect(Collectors.joining())` : 스트림의 요소를 하나의 문자열로 결합

## 하샤드 수
```java
import java.util.*;

public class Solution {
    public boolean solution(int x) {
      boolean answer = true;
      String s = String.valueOf(x);
      int sum = 0;
      int a = x;
      for(int i=1; i<=s.length(); i++){
        sum += a % 10;
        a /= 10;
      }
  
      return x % sum == 0;
    }
	
    public int streamSolution(int n){
      return x % String.valueOf(x).chars().map(Character::getNumericValue).sum() == 0;
    }
}
```
- `String.valueOf(x)` : 정수 n을 문자열로 반환한다.
- `.chars()` : 문자열을 IntStream으로 변환, 각 문자들의 유니코드 코드 포인트가 들어있다.
  - ex) 문자열 "Hello" :  "H"는 72, "e"는 101, "l"은 108, "o"는 111
- `.map(Character::getNumericValue)` : Character 클래스의 getNumericValue 메소드를 사용해서 각 문자를 숫자로 변환한다.
- `.sum()` : 스트림의 모든 숫자를 합산한다.
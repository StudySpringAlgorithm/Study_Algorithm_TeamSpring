## 문자열을 정수로 바꾸기
```java
class Solution {
    public int solution(String s) {
        return Integer.parseInt(s);
        //return Integer.valueOf(s);
    }
}
```
- valueOf()는 parseInt()를 호출해서 문자열을 정수값으로 변환시키고 Integer로 박싱해서 값을 반환한다. 
- 두 메소드 모두 반환타입만 다를 뿐 같은 기능이기 때문에 상황에 맞는 메소드를 잘 선택해서 사용하면 된다.

## 나머지가 1이 되는 수 찾기
```java
class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++){
            if(n % i == 1){
                answer = i;
                break;
            }
        }
        return answer;
    }

    public int streamSolution(int n){
        return IntStream.rangeClosed(1, n).filter(i -> n % i == 1).findFirst().orElse(0);
    }
}
```
- `range()` : 끝 값이 범위에 포함되지 않음
- `rangeClosed()` : 끝 값이 범위에 포함 됨
- `.findFirst()` : 필터링 된 값의 가장 첫번째 요소를 찾는다.
## 자릿수 더하기
```java
import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        while(n != 0){
            answer += n % 10;
            n = n / 10;
        }

        return answer;
    }
	
    public int streamSolution(int n){
        return String.valueOf(n).chars().map(Character::getNumericValue).sum();
    }
}
```
- `String.valueOf(n)` : 정수 n을 문자열로 반환한다.
- `.chars()` : 문자열을 IntStream으로 변환, 각 문자들의 유니코드 코드 포인트가 들어있다.
  - ex) 문자열 "Hello" :  "H"는 72, "e"는 101, "l"은 108, "o"는 111
- `.map(Character::getNumericValue)` : Character 클래스의 getNumericValue 메소드를 사용해서 각 문자를 숫자로 변환한다.
- `.sum()` : 스트림의 모든 숫자를 합산한다.
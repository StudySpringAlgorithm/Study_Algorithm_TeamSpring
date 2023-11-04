## 두 정수 사이의 합
```java
class Solution {
    public long solution(int a, int b) {
      long answer = 0;
      int temp = 0;
      if(a > b){
        temp = a;
        a = b;
        b = temp;
      }
  
      for(int i = a; i <= b; i++){
        answer += i;
      }
      return answer;
    }

  public long solution(int a, int b) {
        if(a > b){
            int temp = a;
            a = b;
            b = temp;
        }
	  
        return LongStream.rangeClosed(a, b).sum();
  }
}
```

## 콜라츠 추측
```java
class Solution {
    public int solution(long num) {
      int answer = 0;
      int cnt = 0;
	  
      while(num != 1){
        if(cnt == 500){
          answer = -1;
          break;
        }
        num = num % 2 == 0 ? num / 2 : num * 3 + 1;
        answer = ++cnt;
  
      }
      return answer;
    }
}
```

## 서울에서 김서방 찾기
```java
class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        for(int i = 0; i < seoul.length; i++) {
            if ("Kim".equals(seoul[i])) {
                answer = "김서방은 " + i + "에 있다";
            }
        }
        return answer;
    }
}
```
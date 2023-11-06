## 음양더하기
```java
class Solution {
	public int solution(int[] absolutes, boolean[] signs) {
		int answer = 0;

		for(int i = 0; i<absolutes.length; i++){
			if(!signs[i]){
				absolutes[i] = absolutes[i] * -1;
			}
			answer += absolutes[i];
		}
		return answer;
	}
}
```

## 나누어 떨어지는 숫자 배열
```java
import java.util.*;
class Solution {
	public int[] solution(int[] arr, int divisor) {
		int[] answer = {};
		int n = 0;
		int num = 0;
		for(int a : arr){
			if(a % divisor == 0){
				n++;
			}
		}

		if(n == 0){
			answer = new int[]{-1};
		}else{
			answer = new int[n];

			for(int a : arr){
				if(a % divisor == 0){
					answer[num] = a;
					num++;
				}
			}

			Arrays.sort(answer);
		}

		return answer;
	}
	
    public int[] streamSolution(int[] arr, int divisor){
        class Solution {
            public int[] solution(int[] arr, int divisor) {
                int[] answer =  Arrays.stream(arr)
                    .filter(i -> i % divisor == 0)
                    .sorted()
                    .toArray();
    
                return answer.length == 0 ? new int[]{-1} : answer;
            }
        }
    }
}
```

## 없는 숫자 더하기
```java
class Solution {
	public int solution(int[] numbers) {
		int answer = 45;
		for(int a : numbers){
			answer -= a;
		}
		return answer;
	}
}
```
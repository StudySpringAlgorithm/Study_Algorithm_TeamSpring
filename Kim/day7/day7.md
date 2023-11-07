## 핸드폰 번호 가리기
```java
class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String[] arr = phone_number.split("");
        int length = arr.length;
    
        for(int i = 0; i < length; i++){
            answer += i < length - 4 ? "*" : arr[i];
        }
        return answer;
    }

    public String solution(String phone_number) {
        int startIdx = phone_number.length() - 4;

        char[] chars = phone_number.toCharArray();

        for (int i = 0; i < startIdx; i++) {
            chars[i] = '*';
        }

        return new String(chars);
    }
}
```

## 제일 작은 수 제거하기
```java
import java.util.*;
class Solution {
	public int[] solution(int[] arr) {
		if(arr.length == 1){
			return new int[]{-1};
		}

		int index = 0;
		int[] answer = new int[arr.length-1];
		int min = Integer.MAX_VALUE;

		for(int i : arr){
			min = Math.min(min, i);
		}

		for(int a : arr){
			if(a != min){
				answer[index++] = a;
			}
		}

		return answer;
	}
}
```

## 가운데 글자 가져오기
```java
class Solution {
	public String solution(String s) {
		int index = s.length() / 2;
		return s.length() % 2 != 0 ? s.substring(index, index+1) : s.substring(index-1, index+1);
	}
}
```
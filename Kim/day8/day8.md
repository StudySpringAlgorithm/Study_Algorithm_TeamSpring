## 수박수박수박수박수박수?
```java
class Solution {
    public String solution(int n) {
        String answer = "";
        for(int i =0; i < n; i++){
            answer += i % 2 == 0 ? "수" : "박";
        }
        return answer;
    }
    
    public String solution(int n) {
        char[] arr = new char[n];
        for(int i =0; i < n; i++){
            arr[i] = i % 2 == 0 ? '수' : '박';
        }
        return new String(arr);
    }
}
```

## 내적
```java
class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i = 0; i < a.length; i++){
            answer += a[i] * b[i];
        }
        return answer;
    }
}
```

## 약수의 개수와 덧셈
```java
class Solution {
    public int solution(int left, int right) {
            int sum = 0;
            for(int i = left; i <= right; i++){
                int cnt = 0;
                for(int j = 1; j <= i; j++){
                    if(i%j==0){
                        cnt++;
                    }
                }
                sum += cnt%2==0 ? i : -i;
            }
            return sum;
    }
}
```
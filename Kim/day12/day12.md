## 최소직사각형
```java
class Solution {
    public int solution(int[][] sizes) {

        int w = 0;
        int h = 0;
        
        for(int i = 0; i < sizes.length; i++){
            
            int a = sizes[i][0];
            int b = sizes[i][1];

            sizes[i][0] = Math.max(a, b);
            sizes[i][1] = Math.min(a, b);

            w = Math.max(w, sizes[i][0]);
            h = Math.max(h, sizes[i][1]);
        }

        return w * h;
    }
}
```

## 시저암호
```java
class Solution {
    public String solution(String s, int n) {
        char[] ch = s.toCharArray();

        for(int i = 0; i < ch.length; i++){
            if(Character.isLowerCase(ch[i])){
                ch[i] = (char) ((ch[i] - 'a' + n)% 26 + 'a');
            }else if(Character.isUpperCase(ch[i])){
                ch[i] = (char) ((ch[i] - 'A' + n)% 26 + 'A');
            }
        }
        return new String(ch);
    }
}
```

## 숫자 문자열과 영단어
```java
class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] word = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i = 0; i < word.length; i++){
            s = s.replace(word[i], Integer.toString(i));
        }
        
        answer = Integer.parseInt(s);
        return answer;
    }
}
```
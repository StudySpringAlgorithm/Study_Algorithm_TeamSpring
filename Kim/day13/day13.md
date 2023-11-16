## 문자열 내 마음대로 정렬하기

```java
import java.util.*;

class Solution {

    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        String[] arr = new String[strings.length];

        for (int i = 0; i < strings.length; i++) {
            arr[i] = strings[i].charAt(n) + strings[i];
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i].substring(1);
        }

        return answer;
    }
}

class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (a, b) -> {
            char charA = a.charAt(n);
            char charB = b.charAt(n);

            if (charA != charB) {
                return Character.compare(charA, charB);
            } else {
                return a.compareTo(b);
            }
        });

        return strings;
    }
}
```

## K번째수
```java
import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0; i < commands.length; i++){
            ArrayList<Integer> list = new ArrayList<Integer>();
            
            for(int j = commands[i][0]-1; j < commands[i][1]; j++){
                list.add(array[j]);
            }
            Collections.sort(list);
            answer[i] = list.get(commands[i][2]-1);
            
        }
        return answer;
    }
}
```

## 두 개 뽑아서 더하기
```java
import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0; i < numbers.length; i++){
            int a = numbers[i];
            for(int j = i + 1; j < numbers.length; j++){
                int sum = a + numbers[j];
                if(!list.contains(sum)){
                    list.add(sum);
                }    
            }
        }
        Collections.sort(list);
        answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
```
## 행렬의 덧셈
```java
class Solution {
	public int[][] solution(int[][] arr1, int[][] arr2) {

		int[][] answer = new int[arr1.length][arr1[0].length];

		for(int i = 0; i < arr1.length; i++){
			for(int j = 0; j < arr1[i].length; j++){
				answer[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		return answer;
	}
}
```

## 직사각형 별찍기
```java
import java.util.Scanner;

class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		for(int i = 0; i < b; i++){
			for(int j = 0; j < a; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
```

## 최대공약수와 최소공배수
```java
class Solution {
	public int[] solution(int n, int m) {
		int[] answer = new int[2];
		answer[0] = gdc(n ,m);
		answer[1] = lcm(n ,m);
		return answer;
	}

	static int gdc(int a, int b){
		int temp = 0;
		if(a < b){
			temp = a;
			a = b;
			b = temp;
		}
		while(b!=0){
			temp = a%b;
			a = b;
			b = temp;
		}

		return a;
	}
	static int lcm(int a, int b){
		return a*b / gdc(a, b);
	}
}
```

## 3진법 뒤집기
```java
import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        
        while(n!=0){
            list.add(n%3);
            n /= 3;
        }
        
        int index = 1;
        
        for(int i = list.size()-1; i >= 0; i--){
            answer += list.get(i) * index;
            index *= 3;
        }
        return answer;
    }
}
```
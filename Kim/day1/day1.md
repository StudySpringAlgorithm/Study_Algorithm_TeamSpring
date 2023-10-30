## 약수의 합 
```java
public class SumOfAliquot {
	public static int solution(int n) {
		int answer = 0;
		for(int i = 1; i <= n; i++){
			if(n % i == 0){
				answer += i;
			}
		}
		return answer;
	}

	public int streamSolution(int n) {
		return IntStream.range(1, n + 1).filter(m -> n % m == 0).sum();
	}
}
```
- `IntStream.range(1, n + 1)` : 1부터 n까지의 정수 스트림 생성
- `.filter(m -> n % m == 0)` : n을 m으로 나눈 나머지가 0인 값을 필터링 함
- `.sum()` : 스트림에 있는 모든 숫자들을 다 더한 값을 반환 함
### for 채점 결과
![사진](for1.png)
### stream 채점 결과
![사진](stream1.png)

## 자연수 뒤집어 배열로 만들기
```java
public class ReverseArray {

	public static int[] solution(long n) {
		String s = String.valueOf(n);
		int[] answer = new int[s.length()];
		for(int i = 0; i < s.length(); i++){
			answer[i] = (int) (n % 10);
			n /= 10;
		}
		return answer;
	}

	public static int[] afterSolution(long n){
		String[] arr = String.valueOf(n).split("");
		List<String> list = Arrays.asList(arr);
		Collections.reverse(list);
		return list.stream().mapToInt(Integer::parseInt).toArray();
	}
}
```
- `list.stream()` : list를 스트림으로 변환
- `.mapToInt(Integer::parseInt)` : 스트림의 각 요소를 정수로 변환, parseInt 메소드를 사용하여 각 요소를 integer로 파싱
- `.toArray()` : 스트림에 있는 요소를 배열로 반환
### for 채점 결과
![사진](for2.png)
### stream 채점 결과
![사진](stream2.png)
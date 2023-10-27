알고리즘 문제를 풀다보면 자주 빨간글씨로 <span style="color:red">"시간초과"</span> 를 마주할 때가 많다. 때문에 문제에 대한 해답을 찾는 것도 중요하지만 그 해답을 효울적인 방법으로 구현하는것 또한 중요하다고 할 수 있다.

즉 시간 복잡도를 고려해서 코드를 짜야 한다는 것이다!

### 시간 복잡도란?
> 시간 복잡도는 문제를 해결하는데 걸리는 시간과 입력의 함수 관계.
쉽게 말해 알고리즘이 **얼마나 오래 걸리는지**

이런 시간 복잡도를 표현하는 방식이 있는데 `빅오(Big-O)` 라는 표기법을 사용한다 그래프를 한번 보고 예시를 보면서 하나씩 살펴보자

![](https://velog.velcdn.com/images/foqlzm12345/post/42e23c1a-0540-46e1-8429-6fcd22f82e52/image.png)

#### O(1)

```java
function O_1_algorithm(arr, index) {
  return arr[index];
}
let arr = [1, 2, 3, 4, 5];
let index = 1;
let result = O_1_algorithm(arr, index);
console.log(result);
```

이 경우에는 `O(1)` 이다
입력값 (arr, index)가 아무리 커져도 즉시 index값에 접근하기 때문에 즉시 출력값을 구할 수 있다.<br>
`O(1)` 은 입력값이 증가하더라도 시간이 늘어나지 않는다.

#### O(log n)
O(log n)은 표에서 얼핏 보이듯이 O(1)다음으로 가장 빠른 시간 복잡도를 가지고 있다. <br>
입력값이 두 배로 증가할 때마다 한 단계씩 늘어나는 알고리즘이다.<br>
이해를 돕기 위한 일상에서 찾아 볼 수 있는 게임으로는 업다운 게임이 있다.

```java
public static int getStairlength(int n) {
    int stairlength = 1;
    int Height = 1;

    while (Height < n) {
        stairlength++;
        Height *= 2;
    }

    return stairlength;
}
```

계단 쌓기 코드를 만들어 보았다<br>
첫번째 칸에는 한층 그다음부터는 두층씩 쌓아서<br>
층수의 총수를 입력받았을때 계단의 길이를 구하는 코드이다<br>
n = 64 이면 9번 실행<br>
n = 124 이면 10번 실행<br>
즉 입력값이 두배로 늘어날 때 시간은 한단계씩 늘어나는 알고리즘이다.

#### O(n)

```java
function O_n_algorithm(n) {
  for (let i = 0; i < n; i++) {
    // do something for 1 second
  }
}
```
이 경우에는 `O(n)` 이다
O_n_algorithm 함수에선 입력값(n)이 1 증가할 때마다 코드의 실행 시간이 1초씩 증가한다<br>
만약 for문의 i < 2 가 만약 i < 2n이 된다면 1이 증가할 때마다 2초씩 늘어나는 형식이겠지만<br>
같은 비율로 증가하는 알고리즘은 모두 O(n)으로 표기한다

#### O(n2)

```java
function O_quadratic_algorithm(n) {
  for (let i = 0; i < n; i++) {
    for (let j = 0; j < n; j++) {
      // do something for 1 second
    }
  }
}
```
O(n2)의 가장 이해하기 쉬운 코드는 이중포문 삼중포문이 있다<br>
입력값이 커질 수록 그 시간도 제곱으로 증가하는데 O(n)에서 언급한것과 마찬가지로 <br>
그 수가 증가하는것에 대한 같은 비율로 증가하기에 O(n3)와 같은 표기는 따로하지 않는다

#### O(2n)
```java
function fibonacci(n) {
  if (n <= 1) {
    return 1;
  }
  return fibonacci(n - 1) + fibonacci(n - 2);
}

// n 1 ~ 5
1
1
2
3
5
8
```
O(2n)의 알고리즘중 가장 대표적인 알고리즘 중에 재귀로 구현하는 피보나치 수열의 코드를 예시로 가져와 보았다. <br>
가장 느린 시간 복잡도를 가지고 있기에 만약 알고리즘을 이런 형식으로 짠거 같다면 잘못 짰다! 라고 생각해야할 것이다

#### 문제풀기!

```
public static int arraySum(int[] array) {
    int sum = 0;

    for (int num : array)
        sum += num;

    return sum;
}

public static int median(int[] array) {
    int middle = array.length / 2;

    if (array.length % 2 == 0)
        return (array[middle-1] + array[middle]) / 2;
    else
        return array[middle];
}
```



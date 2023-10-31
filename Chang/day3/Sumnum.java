package Chang.day3;

//자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만드는 문제
public class Sumnum {
    public class Solution {
        public int solution(int n) {
            int sum = 0;

            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }

            return sum;
        }
    }
}


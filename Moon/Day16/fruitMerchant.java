package Day16;

import java.util.Arrays;

public class fruitMerchant {

  public static void main(String[] args) {
    int[] case1 = {1, 2, 3, 1, 2, 3, 1};
    int[] case2 = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};

    System.out.println(solution(4,3,case2));



  }

  private static int solution(int k, int m, int[] score) {
    int answer = 0;

    Arrays.sort(score);

    int[] box = new int[m];
//    4 4 4 | 4 4 4 | 2 2 2 | 2 1 1
    for (int i = score.length-1; i >= 0; i--) {

    }

    return answer;
  }

  private static int getArrayMin(int[] arr, int max) {
    int min = max;
    for (int num : arr) {
      if (min > num) {
        min = num;
      }
    }

    return min;
  }

}

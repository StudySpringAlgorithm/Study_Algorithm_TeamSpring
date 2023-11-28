package Day17;

public class paint {

  public static void main(String[] args) {
    System.out.println(solution(8, 4, new int[]{2, 3, 6})); // 2
    System.out.println(solution(5, 4, new int[]{1, 3})); // 1
    System.out.println(solution(4, 1, new int[]{1, 2, 3, 4})); // 4
  }

  private static int solution(int n, int m, int[] section) {
    int answer = 1;
    int first = section[0];
    for (int sec : section) {
      if (sec < first + m) {
        continue;
      }
      first = sec;
      answer++;
    }
    return answer;
  }
}

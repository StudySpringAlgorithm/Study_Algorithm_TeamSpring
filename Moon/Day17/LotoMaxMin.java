package Day17;

public class LotoMaxMin {

  public static void main(String[] args) {
    int[] lottos = {44, 1, 0, 0, 31, 25};
    int[] win_nums = {31, 10, 45, 1, 6, 19};
    System.out.println(solution(lottos, win_nums)[0] + " " + solution(lottos, win_nums)[1]);
  }

  private static int[] solution(int[] lottos, int[] win_nums) {
    int[] answer = new int[2];
    int matches = 0;
    int zeroCount = 0;
    for (int myNum : lottos) {
      if (myNum == 0) {
        zeroCount++;
      }
      for (int winNum : win_nums) {
        if (myNum == winNum) {
          matches++;
        }
      }
    }
    answer[1] = getRank(matches);
    answer[0] = getRank(matches + zeroCount);

    return answer;
  }

  private static int getRank(int n) {
    if (n == 6) {
      return 1;
    }
    if (n == 5) {
      return 2;
    }
    if (n == 4) {
      return 3;
    }
    if (n == 3) {
      return 4;
    }
    if (n == 2) {
      return 5;
    }
    return 6;
  }
}

package Day19;

public class splitStr {

  public static void main(String[] args) {
    String str1 = "banana";
    String str2 = "abracadabra";
    String str3 = "aaabbaccccabba";

    System.out.println(solution(str1));
    System.out.println(solution(str2));
    System.out.println(solution(str3));
  }

  private static int solution(String s) {
    int answer = 0;

    for (int i = 0; i < s.length(); i++) {
      char first = s.charAt(i);
      int count = 0;
      for (int j = i; j < s.length(); j++) {
        char ch = s.charAt(j);
        if (ch == first) {
          count++;
        } else {
          count--;
        }

        if (count == 0) {
          answer++;
          i = j;
          break;
        }

        if (j == s.length() - 1) {
          answer++;
          i = j;
        }
      }
    }

    return answer;
  }


}

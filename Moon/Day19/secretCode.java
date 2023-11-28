package Day19;

public class secretCode {

  public static void main(String[] args) {

    System.out.println(solution("aukks", "wbqd", 5));

  }

  private static String  solution(String s, String skip, int index) {
    String alphabet = "abcdefghijklmnopqrstuvwxyz";
    alphabet = alphabet + alphabet;
    String answer = "";

    String[] skipList = skip.split("p");
    for (int i = 0; i < skip.length(); i++) {
      alphabet = alphabet.replace(skipList[i], "");
    }

    for (int i = 0; i < s.length(); i++) {
      char targetWord = s.charAt(i);
      int targetIndex = alphabet.indexOf(targetWord) + index;

      while (targetIndex < 0 || targetIndex >= alphabet.length()) {
        alphabet = alphabet + alphabet;
      }

      answer += alphabet.charAt(targetIndex);
    }

    return answer;
  }

}

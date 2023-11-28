package Day19;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class roughKeyBoard {

  public static void main(String[] args) {
    String[] keymap = {"AA"};
    String[] targets = {"B"};

    int[] test = keyMap(keymap, targets);
    for (int i : test) {
      System.out.println(i);
    }
  }

  private static int[] keyMap(String[] keymap, String[] targets) {
    int[] answer = new int[targets.length];
    Map<Character, Integer> keyMap = new HashMap<>();

    for (String key : keymap) {
      for (int i = 0; i < key.length(); i++) {
        Character target = key.charAt(i);
        if (!keyMap.containsKey(target) || keyMap.get(target) > i) {
          keyMap.put(target, i + 1);
        }
      }
    }

    for (int i = 0; i < targets.length; i++) {
      answer[i] = getPressCount(targets[i], keyMap);
    }

    return answer;
  }

  private static int getPressCount(String s, Map<Character, Integer> keyMap) {
    int count = 0;
    char[] strArr = s.toCharArray();
    for (char str : strArr) {
      if (keyMap.containsKey(str)) {
        count += keyMap.get(str);
      } else {
        return -1;
      }
    }
    return count;
  }

  private static int[] solution(String[] keymap, String[] targets) {
    int[] answer = new int[targets.length];
    int answerIndex = 0;

    for (String target : targets) {
      int answerNum = 0;
      for (int i = 0; i < target.length(); i++) {
        int min = 101;
        char ch = target.charAt(i);
        for (String key : keymap) {
          int pressCount = key.indexOf(String.valueOf(ch)) + 1;
          if (pressCount == 0) {
            continue;
          }
          if (pressCount < min) {
            min = pressCount;
          }
        }
        answerNum += min;
      }
      answer[answerIndex] = answerNum;
      answerIndex++;
    }
    if (answer[0] == 101) {
      return new int[]{-1};
    }
    return answer;
  }
}

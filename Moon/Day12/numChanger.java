package Day12;

public class numChanger {

    public static void main(String[] args) {
        
    }

    private static int solution(String s) {
        String[] numStrList = {"zero", "0", "one", "1", "two", "2", "three", "3", "four", "4", "five", "5", "six", "6", "seven", "7", "eight", "8", "nine", "9"};
        String numStr = "";
        for (int i = 0; i < numStrList.length; i = i +2) {
            numStr = numStrList[i];
            if (s.contains(numStr)) {
                s = s.replaceAll(numStr, numStrList[i+1]);
            }
        }
        int answer = Integer.valueOf(s);
        return answer;
    }
}

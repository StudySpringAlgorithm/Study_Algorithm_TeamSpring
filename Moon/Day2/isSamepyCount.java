package Day2;

public class isSamepyCount {

    public static void main(String[] args) {
        System.out.println(isSameCount("pPoooyY"));
        System.out.println(betterSolution("pPoooyY"));
    }

    private static boolean isSameCount(String s) {
        String str = s.toLowerCase();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'p') {
                count ++;
            } else if (str.charAt(i) == 'y') {
                count--;
            }
        }

        return count == 0;
    }

    private static boolean betterSolution(String s) {
        int countP = 0;
        int countY = 0;

        for (char c : s.toLowerCase().toCharArray()) {
            if (c == 'p') {
                countP++;
            } else if (c == 'y') {
                countY++;
            }
        }

        return countP == countY;
    }
}

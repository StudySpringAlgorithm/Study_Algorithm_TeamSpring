package Day22;

import Chang.day3.Sumnum.Solution;

public class MaxMin {

    public static void main(String[] args) {
        String s = "1 2 3 4";
        System.out.println(solution(s));
    }

    private static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] arr = s.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (String str : arr) {
            int num = Integer.parseInt(str);
            max = Math.max(num, max);
            min = Math.min(num, min);
        }
        sb.append(min).append(" ").append(max);

        return sb.toString();
    }

}

package Day12;

public class minRec {
    public static void main(String[] args) {
        int[][] sizes = new int[][]{new int[]{50}};
    }

    private static int solution(int[][] sizes) {
        int answer = 0;
        for (int i = 0; i < sizes.length; i++) {
            int temp1 = sizes[i][0];
            int temp2 = sizes[i][1];
            sizes[i][0] = Math.max(temp1, temp2);
            sizes[i][1] = Math.min(temp1, temp2);

        }
        int max1 = sizes[0][0];
        int max2 = sizes[0][1];
        for (int i = 1; i < sizes.length; i++) {
            if (max1 < sizes[i][0]) {
                max1 = sizes[i][0];
            }
            if (max2 < sizes[i][1]) {
                max2 = sizes[i][1];
            }
        }
        answer = max1 * max2;
        return answer;
    }
}

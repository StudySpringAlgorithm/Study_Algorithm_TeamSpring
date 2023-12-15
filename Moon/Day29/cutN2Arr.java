package Day29;

public class cutN2Arr {

    public static void main(String[] args) {
        for (int num : solution1(3,2,5)) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (int num : solution2(3,2,5)) {
            System.out.print(num + " ");
        }
    }

    public static int[] solution1(int n, long left, long right) {
        int[][] rowCol = new int[n][n];

        // 배열 채우기
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                rowCol[i][j] = i + 1;
                rowCol[j][i] = i + 1;
            }
        }

        // 2차원 배열을 1차원 배열로 변환
        int size = (int)(right - left + 1);
        int[] answer = new int[size];

        // left부터 right까지
        for (long i = left; i <= right; i++) {
            int row = (int)(i / n);
            int col = (int)(i % n);
            answer[(int)(i - left)] = rowCol[row][col];
        }

        return answer;
    }

    public static int[] solution2(int n, long left, long right) {
        int[] answer = new int[(int)(right - left + 1)];

        for (long i = left; i <= right; i++) {
            int row = (int)(i / n);
            int col = (int)(i % n);
            answer[(int)(i - left)] = Math.max(row, col) + 1;
        }

        return answer;
    }

}

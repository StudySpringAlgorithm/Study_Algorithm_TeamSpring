package Day29;

public class rowColMultiply {

    public static void main(String[] args) {
        int[][] arr1 = {{1, 4}, {3, 2}, {4, 1}};
        int[][] arr2 = {{3, 3}, {3, 3}};

        for (int[] arr : solution(arr1, arr2)) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int p = arr2[0].length;
        int[][] answer = new int[m][p];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        return answer;
    }

}

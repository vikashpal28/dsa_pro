package miscelleous1;

import java.util.Arrays;

public class solution6 {
    public static int[][] rotateMatRight(int[][] mat, int n, int m, int k) {
        k = k % m;
        for (int i = 0; i < n; i++) {
            int[] newRow = new int[m];
            for (int j = 0; j < m; j++) {
                newRow[(j + k) % m] = mat[i][j];
            }
            mat[i] = newRow;
        }
        return mat;
    }

    public static void main(String[] args) {
        int[][] num = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }

        };
        System.out.println(Arrays.deepToString(rotateMatRight(num, 3, 4, 1)));
    }
}

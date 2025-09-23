package Intermediate;

import java.util.Arrays;

public class solution3 {
    
     public static int[][] flipAndInvertImage(int[][] image) {
        int m = image.length;
        int n = image[0].length;

        int[][] result = new int[m][n];

        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                result[i][j] = image[i][n-j-1];
            }
        }
        
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(result[i][j] == 0) result[i][j] = 1;
                else result[i][j] = 0;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] arr = {
            {1,1,0},
            {1,0,1},
            {0,0,0}
        };
        int[][] result = flipAndInvertImage(arr);

        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}

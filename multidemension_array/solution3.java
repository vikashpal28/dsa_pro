package multidemension_array;

import java.util.Arrays;

public class solution3 {

    public static void inplaceRotate(int[][] arr, int n) {
    
        for(int i =0;i<n;i++){
            for(int j = i+1;j<n;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
// for col wise use this code
        for(int j =0;j<n;j++){
            for(int i = 0 ;i<n/2;i++){
             int temp = arr[i][j];
             arr[i][j] = arr[n-1-i][j];
             arr[n-1-i][j] = temp;
            }
        }
        // col wise output:-
        // [3, 6, 6]
        // [2, 5, 9]
        // [1, 4, 3] 

        //row wise use this code
        for(int i =0;i<n;i++){
            for(int j =0;j<n/2;j++){
           int temp = arr[i][j];
           arr[i][j] = arr[i][n-1-j];
           arr[i][n-1-j] = temp;
            }
        }

        // row wise output:-

        // [3, 4, 1]
        // [9, 5, 2]
        // [6, 6, 3]

    
    }
    public static void main(String[] args) {
        int[][] num= {
            {1,2,3},
            {4,5,6},
            {3,9,6}
        };
        
        inplaceRotate(num, 3);
        for(int[] n : num){
            System.out.println(Arrays.toString(n));
        }
    }

    
}

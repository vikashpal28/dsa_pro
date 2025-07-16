

import java.util.Arrays;

public class solution4 {

     public static void setZeros(int matrix[][]) {
        // Write your code here..
        boolean colZero = false;
        boolean rowZero = false;

        for(int i =0;i<matrix.length;i++){
            if(matrix[i][0] == 0){
                colZero = true;
            }
        }

        for(int j = 0;j<matrix[0].length;j++){
            if(matrix[0][j] == 0){
                rowZero = true;
            }
        }

        for(int i = 1 ;i<matrix.length;i++ ){
        for(int j = 1;j<matrix[0].length;j++){
            if(matrix[i][j] == 0){
          matrix[i][0] = 0;
          matrix[0][j] = 0;
            }
        }
        }

        for(int i =1;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        if(colZero){
            for(int i =0;i<matrix.length;i++){
                matrix[i][0] = 0;
            }
        }

        if(rowZero){
            for(int j =0;j<matrix[0].length;j++){
                matrix[0][j] = 0;
            }
        }
        
    }

    public static void main(String[] args) {
        int[][] num = { {1, 2, 3},
  {4, 0, 6},
  {7, 8, 9} };
  setZeros(num);
  for(int[] n : num){
    System.out.println(Arrays.toString(n));
  }


    }
    
}

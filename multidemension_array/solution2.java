

public class solution2 {

    public static boolean isMatrixSymmetric(int[][] matrix) {
        // Write your code here.
        if(matrix.length!= matrix[0].length) return false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
   
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3},
            {2,4,5},
            {3,5,8}
        } ;
     System.out.println(isMatrixSymmetric(matrix));
    }
}


public class Solution5 {

	public static void spiralPrint(int matrix[][]){
		//Your code goes here

		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            System.out.println("");
            return;
        }
		int top = 0;
		int bottom = matrix.length - 1;
		int left = 0;
		int right = matrix[0].length - 1;
		

		while(left<=right && top<=bottom){
			for(int i = left;i<=right;i++){
				System.out.print(matrix[top][i] + " ");
			}
			top++;
			for(int i = top;i<=bottom;i++){
				System.out.print(matrix[i][right] + " ");
			}
			right--;

			if(top<=bottom){
				for(int i = right; i>=left;i--){
					System.out.print(matrix[bottom][i] + " ");
				}
				bottom--;
			}

			if(left<=right){
				for(int i = bottom;i>=top;i--){
					System.out.print(matrix[i][left] + " ");
				}
				left++;
			}

		}
	}
}
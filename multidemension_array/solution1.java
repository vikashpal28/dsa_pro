package multidemension_array;

import java.util.ArrayList;
import java.util.Arrays;

public class solution1 {
    public static Integer coverageOfMatrix(ArrayList<ArrayList<Integer>> mat) {
      int coverage = 0;
        for(int i =0;i<mat.size();i++){
            for(int j = 0;j<mat.get(0).size();j++){
                if(mat.get(i).get(j) == 0){
                
                    if(j<mat.get(0).size()-1&&mat.get(i).get(j+1) == 1){
                        coverage++;
                    }
                     if(i<mat.size()-1&&mat.get(i+1).get(j) == 1){
                        coverage++;
                    }
                    if(j>0&&mat.get(i).get(j-1)==1){
                        coverage++;
                    }
                    if(i>0&&mat.get(i-1).get(j)==1){
                        coverage++;
                    }
                }

            }
        }
		
		return coverage;
	}
    public static void main(String[] args) {
         ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

    matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
    matrix.add(new ArrayList<>(Arrays.asList(0, 1, 0)));
    matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
        System.out.println("Total coverage of zeros: " + coverageOfMatrix(matrix));
    }
}

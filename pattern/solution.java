package pattern;

import java.util.ArrayList;
import java.util.List;

public class solution {
    // pascal traingle stored in stored in List form;
    public List<List<Integer>> pascalpattern(int num){
        List<List<Integer>> traingle = new ArrayList<>();

        for(int i = 0;i<num;i++){
            List<Integer> row  = new ArrayList<>();
            for(int j = 0;j<=i;j++){
                if(j == 0 || j == i){
                    row.add(1);
                }
                else{
                    int val = traingle.get(i-1).get(j-1) + traingle.get(i-1).get(j);
                    row.add(val);
                }
            }
            traingle.add(row);
        }
        return traingle;
        
    }

    public static void main(String[] args) {
        int num = 5;
        solution obj = new solution();
        System.out.println(obj.pascalpattern(num));
    }
}

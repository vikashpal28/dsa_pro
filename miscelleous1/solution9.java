package miscelleous1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class solution9 {
    public static ArrayList<Integer> findTriplets(int[] arr, int n){
        HashMap<Integer, List<Integer> > val = new HashMap<>();
        for(int i = 0;i<n;i++){
            val.computeIfAbsent(arr[i], k -> new ArrayList<>()).add(i);
        }

        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if( i == j) continue;
                int sum = arr[i] + arr[j];

                if(val.containsKey(sum)){
                    for( int k : val.get(sum)){
                        System.out.print(k + " ");
                      if(k != i && k != j){
                  return new ArrayList<>(Arrays.asList(arr[i], arr[j] ,arr[k]));
                      }
                    }
                }
            }
        }
        return new ArrayList<>();
    }
    public static void main(String[] args) {
        int[] arr = {10, 5, 5, 6, 2};
        int n = arr.length;
        System.out.println(findTriplets(arr, n));
    }
}

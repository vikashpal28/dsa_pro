import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class solution5 {
    
     public static int subArrayCount(ArrayList < Integer > arr, int k) {

    	 // Write your code here.
       Map<Integer, Integer> modCount = new HashMap<>();
        modCount.put(0, 1);

        int prefixSum = 0, count = 0;
        for (int num : arr) {
            prefixSum += num;
            int mod = (prefixSum % k + k) % k;

            count += modCount.getOrDefault(mod, 0);
            modCount.put(mod, modCount.getOrDefault(mod, 0) + 1);
         }
         return count;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(4);
        arr.add(5);
        arr.add(0);
        arr.add(-2);
        arr.add(-3);
        arr.add(1);
        // arr.add(4);
        System.out.println(subArrayCount(arr, 5));
    }
}

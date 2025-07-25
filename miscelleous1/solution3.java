package miscelleous1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class solution3 {
    
    public static ArrayList<Integer> majorityElement(ArrayList<Integer> arr){
        Map<Integer , Integer> freq = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.size();
        for(int num : arr){
         freq.put(num, freq.getOrDefault(num, 0)+1);
         System.out.println(num + " " + freq.getOrDefault(num, 0));
        }
        for(Map.Entry<Integer , Integer> entry : freq.entrySet()){
            if(entry.getValue()>n/3){
                result.add(entry.getKey());
            }
        }
        return result;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(1);
        arr.add(5);
        arr.add(2);
        arr.add(3);
        System.out.println(majorityElement(arr));

    }
}

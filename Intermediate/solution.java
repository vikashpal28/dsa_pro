package Intermediate;

import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.Map.Entry;

public class solution {

    public static int singleNonDuplicate(ArrayList<Integer> arr) {
        // Write your code here.
        // complexity O(logn);
        // HashMap<Integer,Integer> result = new HashMap<>();

        // for(int num : arr){
        // result.put(num,result.getOrDefault(num,0)+1);
        // }

        // for(Entry<Integer, Integer> entry : result.entrySet()){
        // if(entry.getValue() == 1){
        // return entry.getKey();
        // }
        // }
        // return -1;

        // second method


    //   for sorted array we used this method
        int low = 0;
        int high = arr.size() - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;

            if (mid % 2 == 1)
                mid--;

            if (arr.get(mid).equals(arr.get(mid + 1))) {
                low = mid + 2;
            } else {
                high = mid;
            }
        }
        return arr.get(low);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        // arr.add(10);
        // arr.add(20);
        // arr.add(50);
        // arr.add(10);
        // arr.add(20);
        // arr.add(10);
        // arr.add(10);
        // arr.add(50);

        arr.add(1);
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(4);
        arr.add(5);
        arr.add(5);

        System.out.println(singleNonDuplicate(arr));

    }

    public void generator(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'generator'");
    }

}

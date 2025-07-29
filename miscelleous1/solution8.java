package miscelleous1;

import java.util.ArrayList;

public class solution8 {
    public static void pushZeroes(ArrayList<Integer> arr){
        int insertPos = 0;
        int n = arr.size();
        for(int i = 0;i<n;i++){
            if(arr.get(i)!=0){
                arr.set(insertPos,arr.get(i));
                insertPos++;
            }
        }
        // second part for rest element at the end
        while (insertPos<n) {
            arr.set(insertPos,0);
            insertPos++;
        }
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
     public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(2);
        num.add(0);
        num.add(4);
        num.add(9);
        num.add(0);
        num.add(23);
        pushZeroes(num);
     }
}

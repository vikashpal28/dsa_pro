package recursion;

import java.util.ArrayList;
import java.util.Arrays;

// import miscelleous1.soulution17;

public class merge {

    public static void main(String[] args) {
        int[] arr = {2,3,5,69,8,1};
        helper(arr, 0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    private static void helper(int[] arr ,int start , int end ){
        if(start<end){
            int mid = start + (end-start)/2;
            helper(arr, start, mid);
            helper(arr, mid+1, end);
            merge(arr, start, mid, end);
        }
    }

    private static void merge(int[] arr, int start, int mid, int end){
        int i = start, j = mid+1;
        ArrayList<Integer> temp = new ArrayList<>();

        while (i<=mid && j<=end) {
            if(arr[i]<=arr[j]){
                temp.add(arr[i++]);
            }
            else{
                temp.add(arr[j++]);
            } 
        }
        while(i<=mid) temp.add(arr[i++]);
        while(j<=end) temp.add(arr[j++]);

        for(int idx = 0;idx<temp.size();idx++){
            arr[start+idx] = temp.get(idx);
        }
    }
}



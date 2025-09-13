package recursion;

import java.util.Arrays;

public class quick {
    private static void quickSort(int[] arr , int start , int end){
        if(start<end){
            int pivotIndex = partition(arr,  start , end); // get the pivot index
            quickSort(arr, start, pivotIndex-1); // left side
            quickSort(arr, pivotIndex+1, end); // right side
        }
    }
    
    private static int partition(int[] arr , int start ,int end){
        int pivot = arr[end];
        int i = start-1;
        // initial it start from -1;

        for(int j = start;j<end;j++){
            if(arr[j]<=pivot){
                i++; // frist increase 
                swap(arr, i, j); // than swapping is used

            }
        }
        swap(arr, i+1,end); // after the loop is over the set the pivot position
        return i+1; // return the pivot position
    }

    private static void swap(int[] arr ,int i, int j){
       int temp = arr[i];
       arr[i] = arr[j];
       arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,7,3,9};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}

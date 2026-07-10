package sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        
        System.out.println("Given Array: " + Arrays.toString(arr));
       MergeSort merge = new MergeSort();

        merge.partialSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    public void partialSort(int[] arr , int low , int high){
        if(low >= high){
            return;
        }

        int mid = low + (high - low)/2;
        
        //partial sort
        partialSort(arr, low, mid);
        partialSort(arr, mid+1, high);

        merge(arr, low, mid, high);
    }

    public void merge(int[] arr , int low , int mid , int high){
        int n1 = mid -low + 1;
        int n2 = high - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for(int i = 0;i< n1 ;i++){
            leftArray[i] = arr[low + i];
        }

        for(int j = 0; j<n2; j++){
            rightArray[j] = arr[mid+1+j];
        }
        
         int k = low;
         int j = 0 , i = 0;

         while (i < n1 && j < n2) {
            if(leftArray[i] <= rightArray[j]){
                arr[k] = leftArray[i];
                i++;
            }
            else{
                arr[k] = rightArray[j];
                j++;
            }
            k++;
         }

       while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArray[] if any
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }   

        
    }
}

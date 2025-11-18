package sorting;

public class QuickSort {
    public static void quicksort(int[] arr , int low , int high){
        if(low < high){
            //partition index
          int pi = partition(arr , low , high);
            
          //recursively sorted left and right part
          quicksort(arr, low, pi-1);
          quicksort(arr, pi+1, high);
        }
    }

    private static int partition(int[] arr , int low ,int high){
        int pivot = arr[high]; // set pivot at last
        int i = low -1;

        for(int j = low;j<high;j++){
            if(arr[j] <= pivot){
                i++;
                 int temp = arr[i];
                 arr[i] = arr[j];
                 arr[j] = temp;
            }
        }
        // place the pivot at correct index
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;

    }
    public static void main(String[] args) {
        // int[] arr = {1,8,7,4,9,2};
        int[] arr = {10, 7, 8, 9, 1, 5};
        quicksort(arr, 0, arr.length-1);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

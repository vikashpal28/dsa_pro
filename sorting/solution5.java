package sorting;


import java.util.Arrays;

public class solution5 {
     public static void sort012(int[] arr)
    {

        // simple method

        //Write your code here
        // int count1 = 0, count2 = 0, count3 = 0;
        // for(int i = 0;i<arr.length;i++){
        //     if(arr[i] == 0) count1++;
        //     else if(arr[i] == 1) count2++;
        //     else count3++;
        // }
        // int idx = 0;
        // for(int i =0;i<count1;i++)  arr[idx++] = 0;
        // for(int i =0;i<count2;i++)  arr[idx++] = 1;
        // for(int i =0;i<count3;i++)  arr[idx++] = 2;

        // Dutch National Flag
        int n = arr.length;
        int mid = 0, low = 0, high = n-1;
        while (mid<=high) {
            if(arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }
            else if (arr[mid] == 1) {
                mid++;
            }
            else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
            
        }
        
        
    }
    public static void main(String[] args) {
        int[] num = {1,0,2,0,2,1};
        sort012(num);
        System.out.println("Sorted Array:- " + Arrays.toString(num));
    }
}

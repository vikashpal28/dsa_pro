import java.util.Arrays;

public class Solution1 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        
        int[] newArr = new int[n+m];

        System.arraycopy(nums1, 0, newArr, 0, n);
        System.arraycopy(nums2, 0, newArr, n, m);
        Arrays.sort(newArr);
        double result;
        if(newArr.length%2 == 0){
         result =  (newArr[(newArr.length/2)-1] + newArr[(newArr.length/2)])/2.0;
        }
        else{
          result = newArr[newArr.length/2];
        }
        return result;
          
        
    }
    public static void main(String[] args) {
        int[] num1 = {1,2};
        int[] num2 = {3,4};
        System.out.println(findMedianSortedArrays(num1,num2));
    }
}

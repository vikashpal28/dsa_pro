package pattern;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution1 {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];
        leftSum[0] = 0;
        rightSum[n-1] = 0;
        for(int i = 1;i<n;i++){
           leftSum[i] = leftSum[i-1] + nums[i-1];
        }
        System.out.println(Arrays.toString(leftSum));

        for(int i = n-2;i>=0;i--){
            rightSum[i] = rightSum[i+1] + nums[i+1]; 
        }

         System.out.println(Arrays.toString(rightSum));

        int[] result = new int[n];

        for(int i = 0;i<n;i++){
            result[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
    return result;

    }

    public static void main(String[] args) {
        int[] nums = {10,4,8,3};

        Solution1 sol = new Solution1();
        System.out.println(Arrays.toString(sol.leftRightDifference(nums)));

    }
}

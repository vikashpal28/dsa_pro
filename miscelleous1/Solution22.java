package miscelleous1;

public class Solution22 {
    public static int maxSubArray(int[] arr) {
        int kadaneMax = maxKadane(arr);
        int kadaneMin = maxSubKadane(arr);
        int total = 0;

        for (int num : arr) {
            total += num;
        }

        // If all elements are negative, return the max subarray (non-wrapping)
        if (kadaneMax < 0) return kadaneMax;

        int maxWrap = total - kadaneMin;

        return Math.max(kadaneMax, maxWrap);
    }

    private static int maxKadane(int[] arr) {
        int currentSum = arr[0];
        int maxSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    private static int maxSubKadane(int[] arr) {
        int currentSum = arr[0];
        int minSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.min(arr[i], currentSum + arr[i]);
            minSum = Math.min(minSum, currentSum);
        }
        return minSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, -3, -4, 5};
        System.out.println(maxSubArray(arr)); // Output: 8
    }
}

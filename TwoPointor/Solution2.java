package TwoPointor;

public class Solution2 {
    public static int pairSum(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int count = 0;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                count++;
                left++;
                right--;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return count > 0 ? count : -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int target = 3;
        System.out.println(pairSum(arr, target));  // Output: 2 → (1,6), (2,5)
    }
}

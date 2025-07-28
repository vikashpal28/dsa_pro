package miscelleous1;

import java.util.Arrays;

public class solution7 {
    public static String FourSum(int[] arr, int target, int n) {
        Arrays.sort(arr);// sorting help of remove duplicate elements
        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                int left = j + 1;
                int right = n - 1;
                while (left < right) {
                    int sum = arr[i] + arr[j] + arr[left] + arr[right];
                    if (sum == target) {
                        return "yes";
                    } else if (sum < target) {
                        left++;
                    } else if (sum > target) {
                        right--;
                    }
                }
            }
        }
        return "no";

    }
    public static void main(String[] args) {
        int[] arr = {2,4,6,1,-8,7};
        int target = 13;
        int n = arr.length;
        System.out.println(FourSum(arr, target, n));
    }
}

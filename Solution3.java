public class Solution3 {

    public static boolean isPossible(int[] num, int n) {
        int count = 0;

        for (int i = 0; i < n - 1; i++) {
            if (num[i] > num[i + 1]) {
                count++;
                if (count > 1) return false;

                if (i == 0 || num[i - 1] <= num[i + 1]) {
                    num[i] = num[i + 1]; // Lower current element
                } else {
                    num[i + 1] = num[i]; // Raise next element
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {4, 2, 3};
        int[] arr2 = {3, 4, 2, 1};

        System.out.println(isPossible(arr1, arr1.length)); // true
        System.out.println(isPossible(arr2, arr2.length)); // false
    }
}

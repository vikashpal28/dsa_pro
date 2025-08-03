package miscelleous1;

public class solution11 {
    public static int MaxSumOfRectangle(int[][] arr, int n, int m) {
        int maxSum = Integer.MIN_VALUE;

        for (int left = 0; left < m; left++) {
            int[] temp = new int[n];
            for (int right = left; right < m; right++) {
                for (int i = 0; i < n; i++) {
                    temp[i] += arr[i][right];
                }
                int currentSum = Kadanas(temp);
                maxSum = Math.max(maxSum, currentSum);

            }
        }
        return maxSum;
    }

    private static int Kadanas(int[] arr) {
        int currentSum = arr[0];
        int maxSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, -1, -4, -20 },
                { -8, -3, 4, 2, 1 },
                { 3, 8, 10, 1, 3 },
                { -4, -1, 1, 7, -6 }
        };
        System.out.println(MaxSumOfRectangle(arr, 4, 5));
    }
}

class Solution {
    public static String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();

        for (int start = 0; start < arr.length; start += 2 * k) {
            int i = start;
            int j = Math.min(start + k - 1, arr.length - 1); // reverse only up to k or end of array
            System.out.println(i + " " + j);
            // Reverse characters from i to j
            while (i < j) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        // Solution sol = new Solution();
        String s = "abcdefg";
        int k = 2;
        System.out.println(reverseStr(s, k)); // Output: "bacdfeg"
    }
}

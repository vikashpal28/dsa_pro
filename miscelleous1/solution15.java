package miscelleous1;

import java.util.ArrayList;
import java.util.Collections;

public class solution15 {
    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        Collections.sort(arr);
        int missing = -1;
        int repeating = -1;

        // Detect the repeating number
        for (int i = 0; i < n - 1; i++) {
            if (arr.get(i).equals(arr.get(i + 1))) {
                repeating = arr.get(i);
                break;
            }
        }

        // Detect the missing number
        boolean[] seen = new boolean[n + 1];
        for (int num : arr) {
            seen[num] = true;
        }

        for (int i = 1; i <= n; i++) {
            if (!seen[i]) {
                missing = i;
                break;
            }
        }

        return new int[]{missing, repeating};
    }

}

import java.util.ArrayList;

public class Solution1 {
    // Rotates the array left by k positions and returns the result
    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        k = k % arr.size();
        if (k < 0) {
            k += arr.size();
        }
        for (int i = 0; i < k; i++) {
            rotateOnce(arr);
        }
        return arr; // ? Now this matches the return type
    }

    private static void rotateOnce(ArrayList<Integer> arr) {
        int temp = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            arr.set(i - 1, arr.get(i));
        }
        arr.set(arr.size() - 1, temp);
    }
}

// Given an array 'arr' with 'n' elements,
//  the task is to rotate the array to the left by 'k' 
// steps, where 'k' is non-negative.

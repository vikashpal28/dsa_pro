package dp;

import java.util.ArrayList;
import java.util.List;

public class ZigZag {

    public static final int MAX = 1000000007;

    public static void main(String[] args) {
      int count =  zigZagArrays(3, 1, 3);
      System.out.println("ZigZag arrays:- "+count);

    }

    public static int zigZagArrays(int n, int l, int r) {
        return backTrack(new ArrayList<>(), n, l, r);
    }

    public static int backTrack(List<Integer> current, int n, int l, int r) {
        // each length should be equal than it suitable the condition
        if (current.size() == n) {
            return 1;
        }
        int total_Count = 0;
        for (int x = l; x <= r; x++) {
            if (isValid(current, x)) {
                current.add(x);
                total_Count = (total_Count + backTrack(current, n, l, r)) % MAX;
                current.remove(current.size()-1);
            }
        }

        return total_Count;
    }

    public static boolean isValid(List<Integer> current, int nextValue) {
        int size = current.size();

        if (size >= 1) {
            // it check the adjacent elements are equal or not
            if (current.get(size - 1) == nextValue) {
                return false;
            }
        }

        if (size >= 2) {
            int prePrevious = current.get(size - 2);
            int pre = current.get(size - 1);

            // if check the strictly increasing
            if (prePrevious < pre && pre < nextValue) {
                return false;
            }
            // it check the stricty decreasing
            if (prePrevious > pre && pre > nextValue) {
                return false;
            }

        }
        return true;
    }

}

// it is a brute force
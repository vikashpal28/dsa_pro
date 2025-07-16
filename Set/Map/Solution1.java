package Set.Map;

import java.util.ArrayList;
import java.util.HashSet;

public class Solution1 {
    public static int minElementsToRemove(ArrayList<Integer> arr) {
        HashSet<Integer> seen = new HashSet<>();
        int removals = 0;

        for (int num : arr) {
            if (seen.contains(num)) {
                removals++; // Duplicate found
            } else {
                seen.add(num); // Unique, keep it
            }
        }

        return removals;
    }
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        // num.add(1);
        // num.add(2);
        System.out.println(minElementsToRemove(num));
    }
}

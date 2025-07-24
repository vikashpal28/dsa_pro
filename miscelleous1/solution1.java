package miscelleous1;

import java.util.ArrayList;

public class solution1 {
    public static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2, int m) {
        ArrayList<Integer> Intersection = new ArrayList<>();
		 int i = 0, j = 0;

    while (i < n && j < m) {
        if (arr1.get(i).equals(arr2.get(j))) {
            Intersection.add(arr1.get(i));
            i++;
            j++;
        } else if (arr1.get(i) < arr2.get(j)) {
            i++;
        } else {
            j++;
        }
    }
		return Intersection;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(1);
        arr2.add(3);
        arr2.add(4);

        ArrayList<Integer> result = findArrayIntersection(arr1, 3, arr2, 3);
        System.out.println(result);
    }
}

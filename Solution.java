import java.util.* ;
public class Solution {
	public static int findSecondLargest(int n, int[] arr) {
		Arrays.sort(arr);
		int largest = arr[n-1];
		for(int i = n-2;i>=0;i--){
			if(arr[i]!=largest){
				return arr[i];
			}
		}
		return -1;
	}
}

// You have been given an array/list 'ARR' of integers. Your task is to find the second largest element present in the 'ARR'.

// Note:
// a) Duplicate elements may be present.

// b) If no such element is present return -1.
package miscelleous1;

import java.util.* ;

public class Solution4 {

    public static int[] sort(int n, int arr[]) {
        // Step 1: Find the maximum element
      int max = Arrays.stream(arr).max().getAsInt();
		int min = Arrays.stream(arr).min().getAsInt();
        
		int range = max - min + 1;
		int[] count = new int[range];
		for(int i =0;i<n;i++){
			count[arr[i]-min]++;
            System.out.println(i + " " + (arr[i]-min));
		}
		int idx = 0;
		for(int i =0;i<range;i++){
			while(count[i]-->0){
                System.out.print(count[i]);
				arr[idx++] = i+min;
			}
		}
		return arr;
    }
    public static void main(String[] args) {
        int[] num = {-1,2,-1,7,2};
        int k = num.length;
        System.out.println(Arrays.toString(sort(k, num)));
    }

}


package arr;

public class Solution1 {
    public int firstMissingInteger(int[] arr){
        int n = arr.length;

        for(int i = 0;i<n;i++){
            while(arr[i] > 0 && arr[i] <= n && arr[arr[i]-1] != arr[i]){
                int temIndex = arr[i] -1;
                int temp = arr[temIndex];
                arr[temIndex] = arr[i];
                arr[i] = temp;
            }
        }

        for(int i = 0;i<n;i++){
            if(arr[i] != i+1){
                return i+1;
            }
        }
        return n+1;
    } 
    public static void main(String[] args) {
        // int[] arr = new int{1,2,3,4,5};
        int[] arr = {1, 2, -1, 4, 5};
        Solution1 sol = new Solution1();
        System.out.println(sol.firstMissingInteger(arr));

    }
}

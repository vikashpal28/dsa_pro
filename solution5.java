
public class solution5 {
    public static void main(String[] args) {
        int[] arr = {  10, 8,1, 7 };
        System.out.println(firstMissing(arr, 4));
    }

    public static int firstMissing(int[] arr, int n) {
        for(int i =0;i<n;i++){
            while(arr[i]>0&&arr[i]<=n&&arr[arr[i]-1]!=arr[i]){
                int temp = arr[i];
                arr[i] = arr[temp-1];
                arr[temp-1] = temp;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]!=i+1){
                return i+1;
            }
        }
        // System.out.println("n = "+n);
        return n+1;
    }
    
}

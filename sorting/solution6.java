package sorting;

public class solution6 {
    
    public static int findMajority(int[] arr, int n) {
    int freq = 0, ans = 0;
    for(int i =0;i<n;i++){
        if(freq == 0){
            ans = arr[i];
        }
        freq += (arr[i] == ans) ? 1 : -1;
        // System.out.println( arr[i] + " " + ans);
        // System.out.println("frequency : "+freq);
    }
    int count =0;
    for(int i =0;i<n;i++){
        // System.out.println(arr[i] + " " + ans);
        if(arr[i] == ans){
            count++;
        }
    }
    return (count>n/2) ? ans : -1; 
    
    }
    public static void main(String[] args) {
        int[] num = {1,2,2,1,1};
        int n = 5;
        System.out.println(findMajority(num, n));
    }
}

package TwoPointor;

public class solution1 {
    
    public static int[] separateNegativeAndPositive(int a[]){
       int left = 0;
       int right = a.length-1;
       while(left<=right){
        if(a[left]<0){
            left++;
        }
        else if(a[right]>=0){
            right--;
        }
        else{
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
        }
       }
       return a;

    }
    public static void main(String[] args) {
        int[] num = {1, 2, -3, 4, -4, -5};
        int[] result = separateNegativeAndPositive(num);
        for(int n : result){
            System.out.print(n + " ");
        }
    }
}

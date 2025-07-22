package sorting;

public class solution4 {
    public static int MaxSubArray(int[] num, int n){
        int CurrentSum = 0;
        int MaxSum = 0;
        for(int value : num){
            CurrentSum = Math.max(value, CurrentSum+value);
            MaxSum = Math.max(CurrentSum, MaxSum);
        }
        return MaxSum;
    }
    public static void main(String[] args) {
        int[] num = {-1,2,3,7,-65};
        System.out.println(MaxSubArray(num, 5));
    }

}

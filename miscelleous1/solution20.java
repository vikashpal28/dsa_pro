package miscelleous1;

public class solution20 {
    public static int[] findFirstAndLast(int[] num, int target){
        int first = findBound(num ,target ,true);
        int last = findBound(num, target, false);
        return new int[]{first,last};
    }
    public static int findBound(int[] num, int target, boolean isFirst){
     int left = 0, right = num.length -1 , bound = -1;
     while(left<=right){
        int mid = left + (right - left)/2;
        if(num[mid] == target){
           bound = mid;
           if(isFirst){
            right = mid-1;
           }
           else{
            left = mid+1;
           }
        }
        else if(num[mid]<target){
            left = mid+1;
        }
        else{
            right = mid -1;
        }
     }
     return bound;
    }
    public static void main(String[] args) {
        int[] num = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = findFirstAndLast(num, target);
        System.out.println("["+result[0] + " " + result[1]+"]");
    }
}

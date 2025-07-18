import java.util.ArrayList;

public class solution3 {
    
    public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {

		// Write your code here.
		for(int i =1;i<arr.size();i++){
			if(!(arr.get(i)+arr.get(i-1) == 0)){
				return 0;
			}
			
		}
        return 1;
    }
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(-3);
        num.add(3);
        System.out.println(LongestSubsetWithZeroSum(num));
       
    }
}

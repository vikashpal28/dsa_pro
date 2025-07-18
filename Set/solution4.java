import java.util.ArrayList;
import java.util.HashMap;

public class solution4 {
    public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {

		// Write your code here.
		HashMap<Integer, Integer> map = new HashMap<>();
		int sum = 0;
		int maxlen = 0;
		if(arr.size() == 0){
			return maxlen;
		}
		for(int i =0;i<arr.size();i++){
           sum += arr.get(i);
		   if(sum == 0){
			   maxlen = i+1;
		   }
		   if(map.containsKey(sum)){
			   maxlen = Math.max(maxlen,i-map.get(sum));
		   }
		   else{
			   map.put(sum,i);
		   }
		}
		return maxlen;
	}
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(-2);
        num.add(-3);
        num.add(4);
        num.add(-1);
        num.add(-2);
        num.add(1);
        num.add(5);
        num.add(-3);
        System.out.println(LongestSubsetWithZeroSum(num));
    }
}

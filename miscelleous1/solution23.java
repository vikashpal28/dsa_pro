package miscelleous1;

import java.util.HashMap;

public class solution23 {
    public static int MinimumOperatrion(String a , String b){
        if(a.length() != b.length()){
            return -1;
        }

        int n = a.length();
        int count = 0;
        HashMap<Character, Integer> str = new HashMap<>();
        for(int i = 0;i<n/2;i++){
          if(str.containsKey(a.charAt(i))){
            str.put(a.charAt(i), str.get(a.charAt(i))+1);
          }
          else{
            str.put(a.charAt(i), 1);
          }
          if(str.containsKey(a.charAt(n-i-1))){
            str.put(a.charAt(n-i-1), str.get(a.charAt(n-i-1))+1);
          }
          else{
            str.put(a.charAt(n-i-1), 1);
          }
          if(str.containsKey(b.charAt(i))){
            str.put(b.charAt(i), str.get(b.charAt(i))+1);
          }
          else{
            str.put(b.charAt(i), 1);
          }
          if(str.containsKey(b.charAt(n-i-1))){
            str.put( b.charAt(n-i-1), str.get(b.charAt(n-i-1))+1);
          }
          else{
            str.put(b.charAt(n-i-1), 1);
          }
          int size = str.size();

          if(size == 4){
            count +=2;
          }

          else if(size == 3){
        if(a.charAt(i) == a.charAt(n-i-1)){
            count += 2;
        }
        else{
            count++;
        }
          }
        else if(size == 2){
            if(str.get(a.charAt(n)) != 2){
             count++;
            }
        } 
        }
         if (n % 2 == 1 && a.charAt(n / 2) != b.charAt(n / 2)) {
			count++;
		}
       return count;
    }
    public static void main(String[] args) {
        String a = "abc";
        String b = "aef";
        System.out.println(MinimumOperatrion(a, b));
    }
}

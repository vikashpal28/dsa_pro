package miscelleous1;

import java.util.Arrays;

public class Solution {
    public static boolean areAnagram(String str1, String str2){
        // Write your code here.
        if(str1.length()!=str2.length()){ return false;
        }
        else{
           char[] ch1 = str1.toLowerCase().toCharArray();
        char[] ch2 = str2.toLowerCase().toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1, ch2);
        }

      
        
        
        
    }
    public static void main(String[] args) {
        String st1 = "listen";
        String st2 = "silent";
        System.out.println(areAnagram(st1, st2));
    }
}
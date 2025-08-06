package miscelleous1;

public class solution16 {
    public static String longestCommonPrefix(String[] strs) {
     if(strs == null || strs.length == 0) return "";

     for(int i = 0;i<strs[0].length();i++){
        // first string
        char ch = strs[0].charAt(i);
        // stored the value of first string to stroed the value
        for(int j = 1;j<strs.length;j++){

            if(i>=strs[j].length() || strs[j].charAt(i) != ch){
                return strs[0].substring(0,i);
            }
        }
     }
    //  if all string match return the first string of array
     return strs[0];
    }
    public static void main(String[] args) {
        String[] str = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(str));
    }
}

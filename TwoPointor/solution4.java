package TwoPointor;

public class solution4 {
    public static String isSubsequence(String str1, String str2) {   
     int i =0;
     int j =0;
     while (i<str1.length()&&j<str2.length()) {
        if(str1.charAt(i) == str2.charAt(j)){
        i++;
        }
        j++;
     }
     return i == str1.length() ? "True" : "False"; 
    }
    public static void main(String[] args) {
          String STR1 = "abc";
        String STR2 = "ahbgdc";
        System.out.println(isSubsequence(STR1, STR2));
    }
}

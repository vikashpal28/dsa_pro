package miscelleous1;

public class solution12 {
    public static String LongestSubString(String s){
     int start = 0, end = 0;
     for(int i = 0;i<s.length();i++){
     int len1 = ExpandToCenter(s, i, i);// odd cases;
     int len2 = ExpandToCenter(s, i, i+1);// even cases;
     int len = Math.max(len1, len2);
     if(len>end-start){
        start = i - (len-1)/2;
        end = i + len/2;
     }
     }
     return s.substring(start, end+1);
    }
    private static int ExpandToCenter(String s, int left, int right){
        while (left>=0&&right<s.length()&&s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right-left-1;
    }
    public static void main(String[] args) {
      String str = "babad";
      System.out.println(LongestSubString(str));
    }
}

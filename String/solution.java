class solution {
    public static boolean isSubsequence(String s, String t) {
      s =  s.toLowerCase();
      t =  t.toLowerCase();
        
        
        char[] ch = s.toCharArray();
        char[] ch1 = t.toCharArray();
        int i =0;
        int j =0;
       while(i<ch.length && j<ch1.length){
        if(ch[i] == ch1[j]){
            i++;
        }
        j++;
       }

       return i == ch.length;
         
    }
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s,t));
    }
}
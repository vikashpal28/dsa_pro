public class solution9 {
    public static int makeBeautiful(String str) {
       int alt0 = 0;
       int alt1 = 0;
       for(int i = 0;i<str.length();i++){
           char expectchar0 = (i%2 == 0) ? '0' : '1';
           char expectchar1 = (i%2 == 0) ? '1' : '0';
           
           if(str.charAt(i) != expectchar0) alt0++;
           if(str.charAt(i) != expectchar1) alt1++;
       }
       return Math.min(alt0, alt1);

    }
    public static void main(String[] args) {
        System.out.println(makeBeautiful("101011"));
    }
}

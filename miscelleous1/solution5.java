package miscelleous1;

public class solution5 {
    public static int reverseInt(int x){
        int rev = 0;
        while(x!=0){
            int digit = x%10;
            if(rev>Integer.MAX_VALUE/10||rev<Integer.MIN_VALUE/10){
                return 0;
            }
            rev = rev*10 + digit;
            x/=10;
        }
        return rev;
    }
    public static void main(String[] args) {
        System.out.println(reverseInt(123));
    }
}

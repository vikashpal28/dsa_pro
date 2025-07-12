public class solution10 {
    public static void main(String[] args) {
        String str = "101";
        System.out.println(nextLargestPalindrome(str, 3));
    }

    public static String nextLargestPalindrome(String number, int length) {
        if(number.matches("9+")){
            return "1" + "0".repeat(length-1) + "1";
        }

        int mid = length/2;
        boolean isodd = (length%2!=0);

        String left = number.substring(0,mid);
        String middle = isodd ? String.valueOf(number.charAt(mid)) : "";

        // create a mirror palindrome  
        String reverseLeft = new StringBuilder(left).reverse().toString();
        String candiadate = left + middle + reverseLeft;
        
        if(candiadate.compareTo(number) > 0){
        return candiadate;
        }

        // Increment (left + middle), then mirror again
        String toincrement = left + middle;
        String increment = addOnce(toincrement);

         String newLeft = increment.substring(0, mid);
        String newMiddle = isodd ? String.valueOf(increment.charAt(mid)) : "";
        String newReversed = new StringBuilder(newLeft).reverse().toString();

        return newLeft + newMiddle + newReversed;

	}

    private static String addOnce(String num){
        StringBuilder sb = new StringBuilder(num);
        int i = sb.length()-1;
        while (i>=0) {
            if(sb.charAt(i)== '9'){
                sb.setCharAt(i, '0');
                i--;
            }
            else{
                sb.setCharAt(i, (char)(sb.charAt(i)+1));
                break;
            }
            
        }
        if(i<0){
            sb.insert(0, '1');
        }
        return sb.toString();

    }
}

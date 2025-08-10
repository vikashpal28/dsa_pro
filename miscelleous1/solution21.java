package miscelleous1;

public class solution21 {
    public static String countAndSay(int n) {
        if (n == 1) return "1";  // Base case

        String s = countAndSay(n - 1);  // Recursive call
        StringBuilder result = new StringBuilder();
        int counter = 1;  // Start with 1 occurrence of the first character

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                counter++;  // Same character, increment count
            } else {
                result.append(counter).append(s.charAt(i - 1));  // Append count and previous character
                counter = 1;  // Reset counter for new character
            }
        }

    
        result.append(counter).append(s.charAt(s.length() - 1));

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(6));  // Output: "1211"
    }
}

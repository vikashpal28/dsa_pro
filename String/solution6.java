import java.util.Scanner;

public class solution6 {
    
    static String reverseStringWordWise(String input) {
        // Write your code here
      String[] words = input.trim().split("\\s+");
      StringBuilder reversed = new StringBuilder();
      for(int i =words.length-1;i>=0;i--){
          reversed.append(words[i]);
          if(i!=0){
            reversed.append(" ");
          }
      }
      return reversed.toString();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String ans = reverseStringWordWise(input);
        System.out.println(ans);
        sc.close();
    }

}

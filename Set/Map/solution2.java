import java.util.HashSet;

public class solution2 {
    
    public static char firstNonRepeatingCharacter(String str) {
    HashSet<Character> seen = new HashSet<>();
    HashSet<Character> repeated = new HashSet<>();
    for( char c : str.toCharArray()){
        if(seen.contains(c)){
            repeated.add(c);
        }
        else{
            seen.add(c);
        }
    }
    for(char c : str.toCharArray()){
        if(!repeated.contains(c)){
            return c;
        }
    }
    return str.charAt(0);
    }
    public static void main(String[] args) {
        String str = "aabbbccd";
        System.out.println(firstNonRepeatingCharacter(str));
    }

}


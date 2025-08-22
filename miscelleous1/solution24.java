package miscelleous1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class solution24 {
    public static List<String> letterCombinations(String digits) {
        if(digits == null || digits.length() == 0) return List.of();
        HashMap<Character , List<String>> str = new HashMap<>();
        str.put('2', Arrays.asList("a", "b", "c"));
        str.put('3', Arrays.asList("d", "e", "f"));
        str.put('4', Arrays.asList("g", "h", "i"));
        str.put('5', Arrays.asList("j", "k", "l"));
        str.put('6', Arrays.asList("m", "n", "o"));
        str.put('7', Arrays.asList("p", "q", "r", "s"));
        str.put('8', Arrays.asList("t", "u", "v"));
        str.put('9', Arrays.asList("w", "x", "y", "z"));

        List<String> result = new ArrayList<>();
        brankTrack(result, str, digits, 0, new StringBuilder());
        return result;
        

    }
    private static void brankTrack(List<String> result, HashMap<Character, List<String>> map, String digits, int index, StringBuilder current){
        if(index == digits.length()){
            result.add(current.toString());
            return;
        }
        char digit = digits.charAt(index);
        // System.out.println(map.get(digit));
        List<String> letters = map.get(digit);
        if(letters == null) return;

        for(String letter : letters){
            System.out.println(letter);
            current.append(letter);
            brankTrack(result, map, digits, index+1, current);
            current.deleteCharAt(current.length()-1);
            
        }
    }
    public static void main(String[] args) {
        String num = "23";
        System.out.println(letterCombinations(num));
    }
}

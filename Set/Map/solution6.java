package Set.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class solution6 {
    public static ArrayList<ArrayList<String>> getGroupedAnagrams(ArrayList<String> inputStr, int n) {
        HashMap<String, List> anagramGroup = new HashMap<>();
        for(String str : inputStr){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedKey = new String(chars);
             anagramGroup.computeIfAbsent(sortedKey, k -> new ArrayList<>()).add(str);
        }
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        for(List<String> group : anagramGroup.values() ){
         result.add(new ArrayList<>(group));
        }
        return result;
    }
    public static void main(String[] args) {
        // Sample input
        ArrayList<String> inputStr = new ArrayList<>(
            Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat")
        );

        int n = inputStr.size();

        // Get grouped anagrams
        ArrayList<ArrayList<String>> groupedAnagrams = getGroupedAnagrams(inputStr, n);

        // Print the result
        System.out.println("Grouped Anagrams:");
        for (ArrayList<String> group : groupedAnagrams) {
            System.out.println(group);
        }
    }
    
}

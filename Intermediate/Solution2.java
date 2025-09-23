package Intermediate;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution2 {
    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        List<String> wordDict = List.of("cats","dog","sand","and","cat");
        System.out.println(wordDict);
        String s = "catsandog";
        System.out.println("Can be segmented: " + sol.wordBreak(s, wordDict)); // true
    }

    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);
        System.out.println(wordSet);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}

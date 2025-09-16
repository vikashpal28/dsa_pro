package Intermediate;

import java.util.HashSet;

public class Solution1 {
    
    public static int longestSequence(int[] arr){
        HashSet<Integer> numSet = new HashSet<>();
        for(int num : arr){
            numSet.add(num);
        }
        int longestStreak = 0;
        for(int num : numSet){
            if(!numSet.contains(num-1)){
                int current = num;
                System.out.println(("current : "+current));
                int currentStreak = 1;

                while (numSet.contains(current+1)) {
                    System.out.println("current++ : "+current);
                    current++;
                    currentStreak++;
                }
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        return longestStreak;
    }

    public static void main(String[] args) {
        int[] arr = {100,4,200,1,3,2};
        System.out.println(longestSequence(arr));
    
    }
}

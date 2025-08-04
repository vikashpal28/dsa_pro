package miscelleous1;

import java.util.HashMap;

public class solution13 {
    public static int findAllSubarraysWithGivenSum(int arr[], int s) {
        HashMap<Integer, Integer> freqSum = new HashMap<>();
        int count = 0, sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum+=arr[i];
            if(freqSum.containsKey(sum -s)){
                count+=freqSum.get(sum-s);
            }
            freqSum.put(sum, freqSum.getOrDefault(sum,0)+1);
        }
        return count;
    }
}

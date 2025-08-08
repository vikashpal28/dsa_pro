package miscelleous1;

import java.util.HashMap;
import java.util.Map;

public class solution19 {
    public static long[] MaxProduct(int[] arr, int n){
        Map<Long ,Integer> productFreq = new HashMap<>();
        // if(arr.length == 0) return  0;

        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                long product = (long)arr[i]*arr[j];
                productFreq.put(product, productFreq.getOrDefault(product, 0) + 1);
            }
        }
        long Maxprod = -1;
        long maxCount = 0;

        for(Map.Entry<Long,Integer> entry : productFreq.entrySet() ){
            long product = entry.getKey();
            int freq = entry.getValue();

            long count = (long)freq*(freq-1)/2;

            if(count>maxCount || (count == maxCount && product < Maxprod)){
                maxCount = count;
                Maxprod = product;
            }
        }
  return new long[]{Maxprod,maxCount};
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,6};
        long[] result = MaxProduct(arr, 4);
        System.out.println("Product:- "+result[0] + " count:- " + result[1]);
    }
}

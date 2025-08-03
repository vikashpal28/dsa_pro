package miscelleous1;

public class solution10 {
    
    public static char kThCharaterOfDecryptedString(String s, int k){
        int i = 0;
        long total_length = 0;
        while (i<s.length()) {
            // for substring part (letter)
            StringBuilder  segment = new StringBuilder();
            while (i<s.length() && Character.isLetter(s.charAt(i))) {
                segment.append(s.charAt(i));
                i++;
            }

            // for digit 
            StringBuilder freqStr = new StringBuilder();
            while (i<s.length() && Character.isDigit(s.charAt(i))) {
                freqStr.append(s.charAt(i));
                i++;
            }
            

            long freq = Long.parseLong(freqStr.toString());
            // System.out.println("freg " + freq);
            long segmentLen = segment.length();
            // System.out.println("segmentLen " + segmentLen);
            long chunkSize = segmentLen * freq;
            // System.out.println("chunkSize "+chunkSize);


            if (total_length + chunkSize >= k) {
                long offset = k - total_length - 1;
                return segment.charAt((int)(offset % segmentLen));
            }

            total_length += chunkSize;
            // System.out.println(total_length);
         
        }
        

    }
    public static void main(String[] args) {
        String str = "a2b7cd5";
        System.out.println(kThCharaterOfDecryptedString(str, 11));
    }
}

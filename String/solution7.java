public class solution7 {
    public static String encode(String message) {
        StringBuilder ecoding = new StringBuilder();
        int count = 1;
        for(int i =1;i<message.length();i++){
            if(message.charAt(i) == message.charAt(i-1)){
                count++;
            }
            else{
                ecoding.append(message.charAt(i-1)).append(count);
                count = 1;
            }
        }
        ecoding.append(message.charAt(message.length()-1)).append(count);

        return ecoding.toString();
    }
}

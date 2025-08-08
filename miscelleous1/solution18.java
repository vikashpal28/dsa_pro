package miscelleous1;

public class solution18 {
    public static String multiplyStrings(String a, String b) {
        if (a.equals("0") || b.equals("0"))
            return "0";

        int m = a.length();
        int n = b.length();

        int[] result = new int[m + n];

        for (int i = m - 1; i >= 0; i--) {
            int digit1 = a.charAt(i) - '0';
            for (int j = n - 1; j >= 0; j--) {
                int digit2 = b.charAt(i) - '0';
                int product = digit1 * digit2;
                int p1 = i + j;
                int p2 = i + j + 1;
                int sum = product + result[p2];
                result[p2] = sum % 10;
                result[p1] += sum / 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int num :result){
            if(sb.length() == 0 && num == 0) continue;
            sb.append(num);
        }

        return sb.length() == 0 ? "0" : sb.toString();

    }
    public static void main(String[] args) {
        String str1 = "23";
        String str2 = "45";

        System.out.println(multiplyStrings(str1, str2));

    }
}

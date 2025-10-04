package pattern;

public class solution1 {
    // pascal triangle pattern;
    public static void main(String[] args) {
        int num = 5;
        for(int i = 0;i<num;i++){
            for(int space = 0;space <num-i;space++){
                System.out.print(" ");
            }
            int val = 1;
            for(int j = 0;j<=i;j++){
               System.out.print(val + " ");
               val = val*(i-j)/(j+1);
            }
            System.out.println(" ");
        }
    }
}

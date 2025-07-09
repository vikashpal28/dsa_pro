public class solution4 {
    
    public static void main(String[] args) {
        int[] num = {2,4,6};
        System.out.println(arrayEquilibrium(num));
    }

    public static int arrayEquilibrium(int[] arr){
        int totalSum =0;
        for(int num:arr){
            //modern for loop
       totalSum += num;
        }
        // System.out.println("total sum = "+totalSum);
      int leftsum =0;
      for(int i =0;i<arr.length;i++){
      int rightsum  = totalSum-leftsum-arr[i];
      if(leftsum == rightsum){
        return i;
      }
      leftsum += arr[i];
      }
      return -1;
    }
}

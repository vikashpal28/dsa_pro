package sorting;

public class solution2 {
    public static void selectionSort(int arr[], int n) {
        for(int i = 0;i<n-1;i++){
            int minIdex = i;
            for(int j =i+1;j<n;j++){
                if(arr[j]<arr[minIdex]){
                    minIdex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdex];
            arr[minIdex] = temp;
        }
    }
    public static void main(String[] args) {
        int[] num = {1,4,5,6,3};
        int n = 5;
        selectionSort(num, n);

        for(int value : num){
            System.out.print(value + " ");
        }

    }
}

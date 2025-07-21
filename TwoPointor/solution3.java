package TwoPointor;

public class solution3 {

    public static int maxArea(int[] height){
        int left = 0;
        int right = height.length - 1;
        int AreaMax = 0;
        while(left<right){
            int h = Math.min(height[left],height[right]);
            int w = right-left;
            int area = h*w;

            AreaMax = Math.max(AreaMax, area);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return AreaMax;
    }
     public static void main(String[] args) {
        int[] num = {2,3,4,5};
        System.out.println(maxArea(num));
     }
    
}

package LeetCode;

import java.util.Arrays;

public class L238 {
   public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left_product = new int[n];
        int[] right_product = new int[n];

        left_product[0] = 1;
        right_product[n-1] = 1;

        int[] combined_product = new int[n];
        
        for(int i=1; i<n; i++){
            left_product[i] = left_product[i-1]*nums[i-1];
        }

        for(int i=n-2; i>=0; i--){
            right_product[i] = right_product[i+1]*nums[i+1];
        }

        for(int i=0; i<n; i++){
            combined_product[i] = left_product[i]*right_product[i];
        }

        return combined_product;
    }
    public static void main(String[] args){
        L238 data = new L238();
        int[] arr = {1,2,3,4,5,6,7,8};
        data.productExceptSelf(arr);
        System.out.println(Arrays.toString(data.productExceptSelf(arr)));
    }
}

import java.util.Arrays;

public class productOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
    static int[] productExceptSelf(int[] nums){
        // int[] ans = new int[nums.length];
        // int prefix = 1;
        // for(int i =0;i<nums.length;i++){
        //     ans[i] = prefix;
        //     prefix *=nums[i];
        // }
        //  int postfix = 1;
        // for(int i = nums.length-1;i>=0;i--){
        //     ans[i]*=postfix;
        //     postfix*=nums[i];
        // }
        // return ans;

        int n = nums.length;
        /* 
        int[] left = new int[n];
        int[] right = new int[n];
        int[] ans = new int[n];
        left[0]=1;
        right[n-1]=1;
        for(int i = 1;i<n;i++){
            left[i]= left[i-1]*nums[i-1];
        }
        for(int i = n-2;i>=0;i--){
            right[i]= right[i+1]*nums[i+1];
        }
        for(int i = 0 ;i <n;i++){
            ans[i] = left[i]*right[i];
        }
        return ans;
        
        */
         int ans[] = new int [n];
        ans[0] = 1;
        for(int i = 1 ;i<n;i++){
            ans[i] = ans[i-1]*nums[i-1];
        }
        int r = 1;
        for(int i = n-1;i>=0;i--){
            ans[i]=ans[i] * r;
            r=r*nums[i];
        }
        return ans;
         
    }
}

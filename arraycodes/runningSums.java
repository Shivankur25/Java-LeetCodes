import java.util.Arrays;

public class runningSums {
    public static void main(String[] args) {
        int[] ans = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(ans)));
    }
    static int[] runningSum(int[] nums){
        int[] ans = new int[nums.length];
        int sum = 0 ;
        for(int i =0 ;i<nums.length;i++){
            sum += nums[i];
            ans[i] = sum;
        }
        return ans;
    } 
}

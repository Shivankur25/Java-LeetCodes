import java.util.Arrays;

public class numberSmallerInArray{
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
        
    }
    static  int[] smallerNumbersThanCurrent(int[] nums){
        int[] ans = new int[nums.length];
        // int count = 0;
        for(int i = 0; i< nums.length  ;i++){
            //  count =0;
            for(int j = 0 ; j < nums.length;j++){
                if(nums[j] < nums[i]&& j!=i){
                // count++; 
                ans[i] ++; 
                // }else{
                //     ans[j] +=1;
                 }                                             
            }
        }
       
        return ans;
    }
    
}
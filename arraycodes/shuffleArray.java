import java.util.Arrays;

public class shuffleArray {
    public static void main(String[] args) {
        int[] ans = {2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(ans, 3)));
    }
    static int[] shuffle(int[] nums, int n){
        int[] ans = new int[nums.length];
        int j = 0 ;
        int k = n;
        for(int i =0 ;i<nums.length;i++){
            if(i%2==0){
                ans[i] = nums[j];
                j++;
            }else{
                ans[i] = nums[k];
                k++;
            }
        }
        return ans;
    }
}

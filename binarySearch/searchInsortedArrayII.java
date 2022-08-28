import java.util.Arrays;

public class searchInsortedArrayII {
    public static void main(String[] args) {
        int[] nums = {2,5,6,0,0,1,2};
        int target = 3;
        System.out.println(search(nums, target));
    }
    static boolean search(int[] nums , int target){
        boolean ans = true;
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + ((end - start) / 2);
            
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else{
                return ans;
            }
        }
        return false;
    }
  
}


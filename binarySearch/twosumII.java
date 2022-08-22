import java.util.Arrays;

public class twosumII {
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }
    static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;
        int[] ans = new int[2];
        while(start<=end){
            if(numbers[start] + numbers[end] ==target){
                ans[0] = start+1;
                ans[1] = end+1;
                break;
            }
            else if(target>numbers[start]+numbers[end]){
                start++;
            }else if(target<numbers[start] +numbers[end]){
                end--;
            }
        }
        return ans;
    }
}

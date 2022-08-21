public class goodPair {
    public static void main(String[] args) {
        int[] num = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(num));
    }

    static int numIdenticalPairs(int[] nums){
        int sum = 0;
        for(int i =0;i<nums.length - 1;i++){
            for(int j = 1; j< nums.length; j++){
                if (nums[i] == nums[j] && i<j){
                    sum++;
                }
            }
        }return sum;
    }
}

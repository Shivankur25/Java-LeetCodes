public class TwoSum {
    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int target = 9;
        System.out.println(twoSum(arr, target));
    }

    static int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        for (int i = 0; i <= (nums.length - 1); i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    answer[0] = i;
                    answer[1] = j;
                    return answer;
                }
            }
        }
        return new int[] {};

    }
}
import java.util.ArrayList;


public class extraCandies{
    public static void main(String[] args) {
        int[] nums = { 2,3,5,1,3};
        System.out.println((kidswithCandies(nums, 3)));
    }
    static ArrayList<Boolean> kidswithCandies(int[] candies , int extraCandies){
        ArrayList<Boolean> list = new ArrayList<>();
        int[] ans = new int[candies.length];
        int sum = extraCandies;
        for(int  i =0;i<candies.length;i++){
            ans[i] = candies[i] + sum;
        } 
        for(int i = 0 ; i<ans.length;i++){
            if(ans[i]>=max(candies)){
                list.add(true);
            }else{
                list.add(false);
            }
        }
        
        return list;
    }
    static int max(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    
    
}
public class RichestCoWe {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 3, 2, 1 }, { 6, 9, 8 } };
        int richest = wealth(arr);
        System.out.println(richest);

    }

    static int wealth(int[][] arr) {
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;

    }
}

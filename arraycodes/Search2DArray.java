import java.util.Arrays;

public class Search2DArray {
    public static void main(String[] args) {
        int[][] arr = { { 91, 22, 52 }, { 65, 85, 21 }, { 25, 69, 10 } };
        int target = 91;
        System.out.println(min(arr));
        System.out.println(max(arr));
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int min(int[][] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (min > arr[i][j]) {
                    min = arr[i][j];
                }
            }
        }
        return min;
    }

    static int[] search(int[][] arr, int target) {

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (target == arr[i][j]) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[]{-1,-1};
     }
     static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int[] i : arr){
            for(int element : i){
                if(element > max){
                    max = element;                    
                }
            }
        }
        return max;
     }
}

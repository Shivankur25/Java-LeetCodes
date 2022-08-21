// import java.util.Arrays;

public class flipAnImage {
    // public static void main(String[] args) {
    //     int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
    //     int[][] ans = reverse(image);
    //   System.out.println(Arrays.toString(image));
    // }
    // static int[][] flipAnInvert(int[][] image){
    //    int[][] 
    // }
    static int[][] flip(int[][] image){
        int[][] arr = new int[image.length][image.length];
        for(int i = 0;i<image.length;i++){
            for(int j = image[i].length-1 ; j>=0;j--){
                if(image[i][j] == 1){
                    arr[i][j] = 0;
                }else if(image[i][j]==0){
                    arr[i][j]= 1;
                }
            }
            
        } 
         
        return  reverse(arr) ; 
    }

    static int[][] reverse(int[][] arr){
      
        int n = arr.length;
        for(int i = 0 ; i < n ;i++){
            int start = 0; 
            int end = n-1;
            while(start<end){
                int temp  = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] =temp;
                start++;
                end--;
            }
        }return arr;
    }
// optimal solution
    // class Solution {
    //     public int[][] flipAndInvertImage(int[][] A) {
    //         int C = A[0].length;
    //         for (int[] row: A)
    //             for (int i = 0; i < (C + 1) / 2; ++i) {
    //                 int tmp = row[i] ^ 1;
    //                 row[i] = row[C - 1 - i] ^ 1;
    //                 row[C - 1 - i] = tmp;
    //             }
    
    //         return A;
    //     }
    // }
}

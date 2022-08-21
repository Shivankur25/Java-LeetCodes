import java.util.Arrays;

public class oneDto2D {
    public static void main(String[] args) {
        int[] orginal  = {1,2,3,4};
        System.out.println(Arrays.toString(construct2DArray(orginal, 2, 2)));
    }
    static int[][] construct2DArray(int[] original , int m ,int n){
        if(m*n != original.length){
            return new int[][]{};
        }
        int[][] arr = new int[m][n];
        int row = 0 ;
        int col = 0 ;
        for(int i = 0 ; i < original.length;i++){
            arr[row][col] = original[i];
            col++;
            if(col==n){
                row++;
                col = 0;
            }
        }
        
        return arr;
    }
}

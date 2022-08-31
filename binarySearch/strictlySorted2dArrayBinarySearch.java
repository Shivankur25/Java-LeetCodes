import java.util.Arrays;

public class strictlySorted2dArrayBinarySearch {
    public static void main(String[] args) {
        int [][] matrix = {{1,2,3,4},
                            {5,6,7,8},
                            {9,10,11,12}
                        };
        System.out.println(Arrays.toString(search(matrix, 7)));
    }
    static int[] search(int[][] matrix,int target){
        int row = matrix.length;
        int cols = matrix[0].length;
        if(row == 1){
            return binarySearch(matrix, 0, 0, cols-1, target);
        }
        int rstart = 0;
        int rend = row-1;
        int colmid = cols/2;
        while(rstart<(rend-1)){
            int mid = rstart + (rend-rstart)/2;
            if(matrix[mid][colmid]==target){
                return new int[]{mid,colmid};
            }
            if(matrix[mid][colmid] < target){
                rstart = mid;
            }else{
                rend= mid;
            }
        }
        if(matrix[rstart][colmid]==target){
            return new int[]{rstart,colmid};
        }else
        if(matrix[rstart+1][colmid]==target){
            return new int[]{rstart + 1,colmid};
        }
        if(matrix[rstart][colmid-1]>=target){
            return binarySearch(matrix, rstart, 0, colmid-1, target);
        }
        if(matrix[rstart+1][colmid-1]>=target){
            return binarySearch(matrix, rstart, 0, colmid-1, target);
        }
        if(matrix[rstart][colmid+1]<=target && target <= matrix[rstart][colmid+1]){
            return binarySearch(matrix, rstart, colmid+1, cols-1, target);
        }
        if(matrix[rstart+1][colmid+1]<=target){
            return binarySearch(matrix, rstart, colmid+1, cols-1, target);
        }
        return new int[]{-1,-1};
        
    }

    static int[] binarySearch(int[][] matrix , int row , int colstart,int colend,int target ){
        while(colstart<=colend){
            int mid = colstart + (colend - colstart)/2;
            if(matrix[row][mid]== target){
                return new int[]{row,mid};
            }
            if(matrix[row][mid]< target){
                colstart = mid+1;
            }else{
                colend = mid -1;
            }
        }
        return new int[]{-1,-1};
    }
}

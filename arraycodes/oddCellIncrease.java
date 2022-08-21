public class oddCellIncrease{
    public static void main(String[] args) {
        
    }
    static int oddCell(int m , int n, int[][] indices){
        int[][] arr = new int[m][n];
        for(int i = 0 ; i <indices.length;i++){
            int row = indices[i][0]; 
            int col = indices[i][1];
            for(int j = 0 ; j < n ;j++){
                arr[row][j]++;
            }
            for(int j = 0 ; j < m ; j++){
                arr[j][col]++;
            }
        }
        int count = 0;
        for(int[] row: arr){
            for(int col : row){
                if(col % 2 != 0){
                    count ++; 
                }
            }

        

    }return count;
   
}
}
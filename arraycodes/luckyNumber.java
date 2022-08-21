import java.util.ArrayList;

public class luckyNumber {
    public static void main(String[] args) {
        int[][] matrix = {{3,7,8},{9,11,13},{15,16,17}};
        System.out.println(lucky(matrix));
    }
    static ArrayList<Integer> lucky(int[][] matrix){
        ArrayList<Integer> list = new ArrayList<Integer>();
       
        
        for(int i = 0 ; i < matrix.length;i++){
            int minRow = matrix[i][0];
            int rowindex = 0;
            for(int j = 0 ; j< matrix[i].length ;j++){
                if(matrix[i][j] < minRow ){
                    minRow = matrix[i][j];
                    rowindex = j;
                }   
            }
            int maxCol = 0;
            for(int j =0 ; j< matrix.length;j++){
                if(matrix[j][rowindex] > maxCol){
                    maxCol = matrix[j][rowindex];
                }
            } 
            if(minRow == maxCol){
                list.add(minRow);
            } 
            
        }
        return list;
    }
}
    


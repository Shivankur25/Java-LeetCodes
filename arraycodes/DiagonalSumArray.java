public class DiagonalSumArray {
    public static void main(String[] args) {

    }

    static int diagonalSum(int[][] mat) {
        int sum = 0;
       for(int i = 0 ; i< mat.length;i++){
        for(int j = 0 ;j<mat[i].length;j++){
            if((i==j) || (i+j == mat.length-1)){
                sum += mat[i][j];
            }
        }
       }
        
       return sum;


    }
}

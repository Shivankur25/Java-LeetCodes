import java.util.Arrays;

public class spiral2 {
    public static void main(String[] args) {
        int n = 3;
        System.out.println((Arrays.toString(generateMatrix(n))));
        
    }

    static int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int rowbegin = 0;
        int rowend = n-1;
        int colbegin = 0;
        int colend = n-1;
        int count = 1;
        while (rowbegin <= rowend && colbegin <= colend) {
            if(rowbegin <= rowend){
            for (int i = colbegin; i <= colend; i++) {
                arr[rowbegin][i] = count++;
            }
            rowbegin++;
        }
            // rowbegin++;
            if(colbegin<=colend){
            for (int i = rowbegin; i <= rowend; i++) {
                arr[i][colend] = count++;
            }
            colend--;
        }
        if(rowbegin <= rowend){
            for (int i = colend; i >= colbegin; i--) {
                arr[rowend][i] = count++;
            }
            rowend--;
        }
        if(colbegin<=colend){
            for (int i = rowend; i >= rowbegin; i--) {
                arr[i][colbegin] = count++;
            }
            colbegin++;
        }
        }
        return arr;
    }
}

import java.util.ArrayList;

public class spiral {
    public static void main(String[] args) {
        int[][] matrix = { {2,5},{8,4},{0,-1} };
        System.out.println(spiralOrder(matrix));
    }

    static ArrayList<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int rowbegin = 0;
        int rowend = matrix.length - 1;
        int colbegin = 0;
        int colend = matrix[0].length - 1;
        while (rowbegin <= rowend && colbegin <= colend) {
            for (int i = colbegin; i <= colend; i++) {
                list.add(matrix[rowbegin][i]);
            }
            rowbegin++;
            for (int i = rowbegin; i <= rowend; i++) {
                list.add(matrix[i][colend]);
            }
            colend--;
            if (rowbegin <= rowend) {
                for (int i = colend; i >= colbegin; i--) {
                    list.add(matrix[rowend][i]);
                }
                rowend--;
            }   
            if (colbegin <= colend) {
                for (int i = rowend; i >=rowbegin; i--) {
                    list.add(matrix[i][colbegin]);
                }
            
            colbegin++;
            }
        }
        return list;
    }
}

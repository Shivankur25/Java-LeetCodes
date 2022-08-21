import java.util.Arrays;

public class reShapeMAttrix {
    public static void main(String[] args) {
        int[][] mat = { { 1, 2 }, { 3, 4 } };
        System.out.println(Arrays.toString(reShape(mat, 1, 4)));
    }

    static int[][] reShape(int[][] mat, int r, int c) {
        if ((r * c) != (mat.length * mat[0].length)) {
            return mat;
        }
        int[][] arr = new int[r][c];
        int row = 0;
        int col = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                arr[row][col] = mat[i][j];
                col++;
                if(col==c){
                    row++;
                    col = 0;
                }
            }
        }
        return arr;
    }
}

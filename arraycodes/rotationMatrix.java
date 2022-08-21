public class rotationMatrix {
    public static void main(String[] args) {
        int[][] mat = { { 0, 1 }, { 1, 0 } };
        int[][] target = { { 1, 0 }, { 1, 1 } };
        System.out.println(findRotation(mat, target));
    }

    static boolean findRotation(int[][] mat, int[][] target) {
        for(int i = 0 ; i < 4 ;i++){
            if(checkMatrix(mat,target)){
                return true;
              
            }
            mat = rotateMatrix(mat);
        }
        return false;
    }

    private static int[][] rotateMatrix(int[][] mat) {
        int[][] ans = new int[mat.length][mat.length];
        for(int i = 0 ;i <mat.length;i++){
            for(int j = 0; j <mat.length ; j++){
                ans[j][mat.length - i - 1] = mat[i][j];
            }
        }
        return ans;
    }

    static boolean checkMatrix(int[][] mat, int[][] target) {
        for(int i = 0 ;i <mat.length;i++){
            for(int j = 0; j <mat.length ; j++){
                if(mat[i][j] != target[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}

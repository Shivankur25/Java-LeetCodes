
public class SetMatrix {
    public static void main(String[] args) {

    }

    static void setZeroes(int[][] matrix) {
        // int m = matrix.length;
        // int n = matrix[0].length;
        // boolean isC = false;
        // for (int i = 0; i < m; i++) {
        //     if (matrix[i][0] == 0) {
        //         isC = true;
        //     }
        //     for (int j = 1; j < n; j++) {
        //         if (matrix[i][j] == 0) {
        //             matrix[i][0] = 0;
        //             matrix[0][j] = 0;
        //         }
        //     }
        // }
        // for (int i = 1; i < m; i++) {
        //     for (int j = 1; j < n; j++) {
        //         if (matrix[i][0] == 0 || matrix[0][j] == 0) {
        //             matrix[i][j] = 0;
        //         }
        //     }
        // }
        // if (matrix[0][0] == 0) {
        //     for (int j = 0; j < n; j++) {
        //         matrix[0][j] = 0;
        //     }
        // }
        // if (isC) {
        //     for (int i = 0; i < m; i++) {
        //         matrix[i][0] = 0;
        //     }
        // }
        int r=matrix.length;
        int c=matrix[0].length;
        int[] row=new int[r];
        int[] col=new int[c];
        
        for(int i=0;i<matrix.length;i++)
            for(int j=0;j<c;j++)
            if(matrix[i][j]==0)
                {
                    row[i]=1;
                    col[j]=1;
                }
            
       for(int i=0;i<r;i++)
       {
           for(int j=0;j<c;j++)
           {
               if(row[i]==1 || col[j]==1)
               {
                   matrix[i][j]=0;
               }
           }
       }
        
        

    }
}

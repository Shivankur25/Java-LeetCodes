public class findpeakII {
    public static void main(String[] args) {
        // int[][] matrix = 
    }
    static int[] findPeakGrid(int[][] mat){
       
        int max = Integer.MIN_VALUE;
        
        if(mat.length == 0)return new int[]{-1,-1};
        if(mat.length == 1 && mat[0].length == 1){
            return new int[]{0,0};
        }
        for(int i = 0 ; i< mat.length;i++){
            int start = 0 ;
            int end  = mat[i].length;
            while(start<=end){
                if(mat[i][start]>=max){
                    max = mat[i][start];
                    return new int[]{i,start};
                    
                }
                if(mat[i][end]>= max){
                    max = mat[i][end];
                    return new int[]{i,end};
                }
                start ++;
                end -- ;
            }
        }
        return new int[]{-1,-1};
    }
}
public class uniqueNinteger {
    public static void main(String[] args) {
        
    }
    static int[] sumZero(int n){
        int[] res = new int [n];
        int last = (n-1) * n/2;
        if(n==1){
            return new int[]{0};
        }
        int x = 1;
        for(int i = 0; i<n;i++){
            res[i] = x;
            x++;
        }
        res[res.length-1] = last*-1;
        return res;
        
    }
}


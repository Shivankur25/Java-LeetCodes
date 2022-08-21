public class maximumPopulation {
    public static void main(String[] args) {
       
        
    }
    static  int maximum(int[][] logs){
        int arr[] = new int[101];
        for(int i = 0 ;i < logs.length; i++){
            for(int j=logs[i][0]; j<logs[i][1]; j++){
               arr[j - 1950]++ ;
            }
        }
        int max = Integer.MIN_VALUE;
        int year = 0;
        for(int i = 0 ; i< 101 ;i++){
            if(arr[i] > max){
                max =arr[i];
                year = 1950 + i;
            }
        }
        return year;
    }
}

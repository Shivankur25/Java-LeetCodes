public class validPerfectSquare {
    public static void main(String[] args) {
        int num = 100;
        System.out.println(isPerfectSquare(num));
    }
    static boolean isPerfectSquare(int num) {
        int start = 1;
         int end = num/2;
         if(num== 1)return true;
         while(start<=end){
             int mid = start + (end-start)/2;
             if(mid*mid==num){
                 return true;
        
                }else
                if(num/mid>mid){
                   start=mid+1;
               }else{
                   end =mid-1;
               }
                 
             }
         
         return false;
     }
}

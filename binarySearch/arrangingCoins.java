public class arrangingCoins {
    public static void main(String[] args) {
        int n =5;
        System.out.println(coins(n));
    }
    static int coins(int n) {
        long start = 0;
        long end  = n;
        long ans;
        while(start<=end){
            long mid = start + (end -start)/2;
            ans = mid *(mid+1)/2;
            if(ans == n)return (int)mid;
            if(n>ans){
                start= mid+1;
            }else{
                end = mid-1;
            }
        }
        return (int)end;
    }
}

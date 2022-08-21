public class sqrt {
    public static void main(String[] args) {
        int x = 8;
        System.out.println(sqrt1(x));
    }

    static int sqrt1(int x) {
        if(x==1)return 1;
        int start = 1;
        int end = x/2;
        int mid = 1;
        while(start<=end){
            mid = start + (end-start)/2;
            if(mid==x/mid){
                return mid;
            }
            if(mid<x/mid){
                start=mid+1;
            }else if(mid>x/mid){
                end =mid-1;
            }
        }
        return end;
    }
}

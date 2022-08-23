public class kthMissing {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int k = 2;
        System.out.println(findKthPostive(arr, k));
        
    }

    static int findKthPostive(int[] arr, int k) {
      int kthPos = 0;
      int count = 0;
      int i = 0;
      int j = 1;
      while(k!=0){
        if(i<arr.length && arr[i]==j){
            i++;
            j++;
        }else{
            kthPos = j;
            count++;
            j++;
            if(k==count){
                return kthPos;
            }
        }
      }
      return -1;
    }
}

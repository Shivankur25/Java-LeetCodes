import java.util.Arrays;

public class nAndDoubleExist {
    public static void main(String[] args) {
        int[] arr = {7,1,14,11};
        System.out.println(checkIfExist(arr));
    }

    static boolean checkIfExist(int[] arr) {
       Arrays.sort(arr);
       
       for(int i = 0 ; i< arr.length ; i++){
          if(arr[i]==0)i++;
          int ans = 2 * arr[i]; 
          if(found(arr,ans)){
            return true;
          }
       }
       return false;
    }

    static boolean found(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;
        
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else{
                return true;
            }
            
        }
        return false;

    }
}
public class searchInMountain {
    public static void main(String[] args) {
        // do when learn oops;
    }
    int search(int[] arr , int target){
     int peak = mountainSearch(arr);
       int firstTry = orderAgnosticBs(arr, target, 0, peak);
       if(firstTry != -1){
        return firstTry; 
       }
       return orderAgnosticBs(arr, target, peak+1, arr.length-1) ;
    }

    static int mountainSearch(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;// because mid+1 is greater then mid element
            }
        }
        return start;
    }
    static int orderAgnosticBs(int[] arr, int target ,int s ,int e) {
        
        boolean isAsc = arr[s] < arr[e];

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if(isAsc) {
                if (target < arr[mid]) {
                    e = mid - 1;
                } else if (target > arr[mid]) {
                    s = mid + 1;
                }
            }else{
                if (target > arr[mid]) {
                    e = mid - 1;
                } else if (target < arr[mid]) {
                    s = mid + 1;
                }

            }
        }
        return -1;
    }
   
}

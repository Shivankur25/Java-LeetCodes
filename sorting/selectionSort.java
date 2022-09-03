import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
    int[] arr = {3,1,5,4,2};
    selection(arr);
    System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        for(int i = 0 ;i < arr.length ;i++){
            // maximum item in the array and swap with correct index
            int last = arr.length - i -1;
            int maxIndex = getMaxIndex(arr , 0 , last);
            swapArray(arr, maxIndex, last);
        }
    }

    private static int getMaxIndex(int[] arr , int start,int end){
        int max = start;
        for(int i =start ; i<= end;i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
       return max;
    }
    static void swapArray(int[] arr , int first , int end){
        int temp = arr[first];
        arr[first] = arr[end];
        arr[end] =temp;
    }
}
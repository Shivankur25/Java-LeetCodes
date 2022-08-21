public class findMin {
    public static void main(String[] args) {
        int[] arr = { 12, 25, 6, 9, 8, 7, 52, 63, 2 };
       int  ans = Min(arr);
        System.out.println(ans);
    }

    static int Min(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int min = arr[0];
        for (int i = 1 ; i< arr.length;i++) {
            if(min > arr[i]) {
                min = arr[i];
            } 

        }
        return min;
    }
}

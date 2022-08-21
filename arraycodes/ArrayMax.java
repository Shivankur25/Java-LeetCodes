import java.util.Arrays;
import java.util.Scanner;

public class ArrayMax {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            ;
            int[] arr = { 2, 5, 8, 6, 9 };

            // System.out.println(Arrays.toString(arr));
            System.out.println(max(arr));
            reverse(arr);
            System.out.println(Arrays.toString(arr));

        }
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            // swap
            swap(arr, start, end);
            start++;
            end--;
        }

    }

    static void swap(int[] arr, int index1, int index2) {
        int temp =arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static int max(int[] arr) {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

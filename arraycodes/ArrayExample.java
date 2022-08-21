import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int[][] arr = new int[3][4];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = input.nextInt();
                }
            }

            // for (int i = 0; i < arr.length; i++) {
            //     for (int j = 0; j < arr[i].length; j++) {
            //         System.out.print(arr[i][j] + " ");
            //     }
            //     System.out.println();
            // }
            for(int[] num : arr){
                System.out.println(Arrays.toString(num));
            }
        }
    }
}

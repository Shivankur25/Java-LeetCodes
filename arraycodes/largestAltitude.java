
public class largestAltitude {
    public static void main(String[] args) {
        int[] gain = { -5, 1, 5, 0, -7 };
        System.out.println(largest(gain));
    }

    static int largest(int[] gain) {
        int[] arr = new int[gain.length + 1];
        arr[0] = 0;
        int count = 0;
        for (int i = 0; i < gain.length; i++) {
            count = count + gain[i];
            arr[i + 1] = count;

        }
        int ans = ArrayMax(arr);
        return ans;
    }

    static int ArrayMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max)
                max = num;
        }
        return max;
    }
}

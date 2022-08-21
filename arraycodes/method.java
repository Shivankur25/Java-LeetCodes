import java.util.Scanner;

public class method {
    public static void main(String[] args) {
        int result = sum();
        System.out.println("The Sum = " + result);
        int ans = sum2(20,30);
        System.out.println("The Sum = " + ans);
    }

    static int sum() {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter number 1: ");
            int num1 = in.nextInt();
            System.out.print("Enter number 2: ");
            int num2 = in.nextInt();
            int sum = num1 + num2;
            return sum;
        }
    }
    static int sum2(int a,int b){
        int sum = a+b;
        return sum;
    }
}
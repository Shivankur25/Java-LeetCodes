import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // syntax
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            // list.add(25);
            // list.add(97);
            // list.add(58);
            // list.add(96);
            // list.add(85);

            // System.out.println(list);
            // list.clear();
            // System.out.println(list);
            for (int i = 0; i < 3; i++) {
                list.add(new ArrayList<>());
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    list.get(i).add(in.nextInt());
                }
            }
            System.out.println(list);
        }

    }
}

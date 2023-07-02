import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] ints = new int[5];

        String[] strings = new String[5];

        System.out.println(Arrays.toString(ints));
        System.out.println(Arrays.toString(strings));

        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

        System.out.println(Arrays.toString(strings));
    }
}

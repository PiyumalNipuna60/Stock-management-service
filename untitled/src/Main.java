import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static int[] name = new int[2];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        name[0] = 10;
        name[1] = 20;

        grow(10);
        System.out.println(Arrays.toString(name));

    }

    public static void grow(int x) {

//        int[] temp = new int[name.length + 1];
//
//        for (int i = 0; i < name.length; i++) {
//            temp[i]=name[i];
//        }
//
//        temp[temp.length-1]=x;
//
//       name=temp;

        int count = 0;
        for (int i = 0; i < name.length; i++) {
            if (name[i] == x) {
                count++;
            }
        }

        if (count==0){
            int[] temp = new int[name.length + 1];

            for (int i = 0; i < name.length; i++) {
                temp[i] = name[i];
            }

            temp[temp.length - 1] = x;

            name = temp;
        }

    }
}

//[0,0,0]
//[10,0,0]
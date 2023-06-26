import java.util.Scanner;
import java.util.Stack;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    private static String userName = "k";
    private static String password = "1";

    public static void main(String[] args) {


 

    }

    private  static void clearConsole() {
         String os = System.getProperty("os.name");
        System.out.println(os);
        try {
            if (os.equals("Linux")) {
                System.out.printf("\033\143");
            } else if (os.equals("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final Exception e) {
//handle the exception
            System.err.println(e.getMessage());
        }
    }

   

   

  


}
import java.util.Scanner;
import java.util.Stack;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    private static String userName = "k";
    private static String password = "1";

    public static void main(String[] args) {

        loginUser();
       

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

    private static void loginUser() {

        /*----------------HEADER START--------------------*/
        System.out.println();
        for (int i = 0; i < 101; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println("|    \t\t\t\t\t\t\t\t\t\t  Login Page \t\t\t\t\t\t\t\t\t\t\t|");

        for (int i = 0; i < 101; i++) {
            System.out.print("-");
        }
        System.out.println();
        /*----------------HEADER END--------------------*/

        /*----------------user name check--------------------*/
        System.out.println();
        boolean currect = true;
        do {
            System.out.print("User Name : ");
            String name = scan.next();

            if (userName.equals(name)) {
                System.out.println("Correct your user name ..!");
                currect = false;
            } else {
                System.out.println("User Name is invalid, please try again!");
            }
        } while (currect);

        /*----------------Password check--------------------*/
        System.out.println();
        currect = true;
        do {
            System.out.print("Password : ");
            String pws = scan.next();

            if (password.equals(pws)) {
                System.out.println("Correct your Password ..!");
                currect = false;
            } else {
                System.out.println("Password is invalid, please try again!");
            }
        } while (currect);

     HomePage();
    }

   

  


}
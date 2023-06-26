
import java.util.*;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    private static String userName = "k";
    private static String password = "1";


    public static void main(String[] args) {

//        LoginUser();
//        HomePage();

        SupplierManage();

    }

    private static void clearConsole() {
        String os = System.getProperty("os.name");

        try {
            if (os.equals("Linux")) {
                System.out.println("\033\143");
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

    private static void LoginUser() {

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

    private static void HomePage() {
        clearConsole();
        /*----------------HEADER START--------------------*/
        System.out.println();
        for (int i = 0; i < 101; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println("|    \t\t\t\t\t\t  WELCOME TO IJSE STOCK MANAGEMENT SYSTEM \t\t\t\t\t\t\t\t|");

        for (int i = 0; i < 101; i++) {
            System.out.print("-");
        }
        System.out.println();
        /*----------------HEADER END--------------------*/

        System.out.println();
        System.out.println("[1] Change the Credentials \t\t\t\t\t [2] Supplier Manage");
        System.out.println("[3] Stock Manage \t\t\t\t\t\t\t [4] Log out");
        System.out.println("[5] Exit the system");


        boolean currect = false;
        do {
            System.out.print("\nEnter an option to continue > ");
            int num = scan.nextInt();

            switch (num) {
                case 1:
                    clearConsole();
                    CredentialsManage();
                    currect = false;
                    break;
                case 2:
                    clearConsole();
                    SupplierManage();
                    currect = false;
                    break;
                case 3:
                    clearConsole();
                    System.out.println("3");
                    currect = false;
                    break;
                case 4:
                    clearConsole();
                    LoginUser();
                    currect = false;
                    break;
                case 5:
                    clearConsole();
                    ExitSystem();
                    currect = false;
                    break;
                default:
                    System.out.println("Wrong input");
                    currect = true;
            }
        } while (currect);

    }



 
    
}
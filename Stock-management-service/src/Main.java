
import java.util.*;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    private static String userName = "k";
    private static String password = "1";
    private static String[][] supplier = new String[2][0];


    public static void main(String[] args) {

//        LoginUser();
//        HomePage();

        AddSupplier();
 //       UpdateSupplier();


    }


    /*----------------Consol clear--------------------*/
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


    /*----------------Login Page--------------------*/
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


    /*----------------Home Page--------------------*/
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


    /*----------------OPTION 01--------------------*/
    private static void CredentialsManage() {

        /*----------------HEADER START--------------------*/
        System.out.println();
        for (int i = 0; i < 101; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println("|    \t\t\t\t\t\t\t\t\t  CREDENTIAL MANAGE \t\t\t\t\t\t\t\t\t\t|");

        for (int i = 0; i < 101; i++) {
            System.out.print("-");
        }
        System.out.println();
        /*----------------HEADER END--------------------*/

        boolean continueProgram = true;
        do {

            /*----------------user name check--------------------*/
            boolean correct = true;
            do {
                System.out.print("\nPlease enter the user name to verify it's you : ");
                String name = scan.next();

                if (!userName.equals(name)) {
                    System.out.println("Invalid user name. try again!");
                } else {
                    System.out.println("Hey " + userName);
                    correct = false;
                }
            } while (correct);

            /*----------------password check and set new password--------------------*/
            do {
                System.out.print("\nPlease enter current password : ");
                String pws = scan.next();

                if (!password.equals(pws)) {
                    System.out.println("Incorrect password. try again!");
                    correct = true;
                } else {
                    System.out.print("Enter your new password : ");
                    password = scan.next();
                    correct = false;
                }
            } while (correct);

            /*----------------close program (Y/N)--------------------*/
            System.out.print("Password change successfully!. do you want to go home page (Y/N) : ");
            String yesOrNo = scan.next();
            if (yesOrNo.equals("y") | yesOrNo.equals("Y")) {
                continueProgram = false;
                HomePage();
            } else {
                System.out.println("----------------------------------------------------------------");
            }
        } while (continueProgram);
    }


    /*----------------OPTION 02--------------------*/
    private static void SupplierManage() {
        /*----------------HEADER START--------------------*/
        System.out.println();
        for (int i = 0; i < 101; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println("|    \t\t\t\t\t\t\t\t\t\t  SUPPLIER MANAGE  \t\t\t\t\t\t\t\t\t\t|");

        for (int i = 0; i < 101; i++) {
            System.out.print("-");
        }
        System.out.println();
        /*----------------HEADER END--------------------*/

        System.out.println();
        System.out.println("[1] Add Supplier \t\t\t\t\t\t\t\t [2] Update Supplier");
        System.out.println("[3] Delete Supplier \t\t\t\t\t\t\t [4] View Suppliers");
        System.out.println("[5] Search Supplier \t\t\t\t\t\t\t [6] Home Page");


        boolean currect = false;
        do {
            System.out.print("\nEnter an option to continue > ");
            int num = scan.nextInt();

            switch (num) {
                case 1:
                    clearConsole();
                    AddSupplier();
                    currect = false;
                    break;
                case 2:
                    clearConsole();
                    UpdateSupplier();
                    currect = false;
                    break;
                case 3:
                    clearConsole();
                    System.out.println("3");
                    currect = false;
                    break;
                case 4:
                    clearConsole();
                    System.out.println("4");
                    currect = false;
                    break;
                case 5:
                    clearConsole();
                    System.out.println("5");
                    currect = false;
                    break;
                case 6:
                    clearConsole();
                    HomePage();
                    currect = false;
                    break;
                default:
                    System.out.println("Wrong input");
                    currect = true;
            }
        } while (currect);
    }



 /*----------------OPTION 05--------------------*/
    private static void ExitSystem() {
    }


    /*---------------------------------------------*/


    /*----------------Supplier Add--------------------*/
    private static void AddSupplier() {
        /*----------------HEADER START--------------------*/
        System.out.println();
        for (int i = 0; i < 101; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println("|    \t\t\t\t\t\t\t\t\t\t  ADD SUPPLIER  \t\t\t\t\t\t\t\t\t\t|");

        for (int i = 0; i < 101; i++) {
            System.out.print("-");
        }
        System.out.println();
        /*----------------HEADER END--------------------*/


        boolean continueProgram = true;
        do {
            System.out.print("Supplier ID   : ");
            String id = scan.next();

            if (isExits(id)) {
                System.out.println("Already exits. try another supplier id! \n");
            } else {
                System.out.print("Supplier Name   : ");
                String name = scan.next();

                isAdded(id, name);
                System.out.print("\nadded successfully! Do you ant to add another supplier(Y/N) : ");
                String yesOrNo = scan.next();
                if (yesOrNo.equals("n") | yesOrNo.equals("N")) {
                    continueProgram = false;
                    SupplierManage();
                } else {
                    System.out.println("----------------------------------------------------------------");
                }
            }
        } while (continueProgram);
    }

/*----------------Supplier Update--------------------*/
private static void UpdateSupplier() {
     /*----------------HEADER START--------------------*/
        System.out.println();
        for (int i = 0; i < 101; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println("|    \t\t\t\t\t\t\t\t\t\t  UPDATE SUPPLIER  \t\t\t\t\t\t\t\t\t\t|");

        for (int i = 0; i < 101; i++) {
            System.out.print("-");
        }
        System.out.println();
        /*----------------HEADER END--------------------*/


    boolean continueProgram = true;
    do {
        System.out.print("Supplier ID : ");
        String id = scan.next();

        if (isExits(id)){
            System.out.println("Supplier Name : "+GetName(id)+"\n");
            System.out.println("Enter the new Supplier Name : ");
            String name = scan.next();
            supplier[1][GetIndex(id)]=name;
            PrintSupplier();

            System.out.print("\nadded successfully! Do you ant to add another supplier(Y/N) : ");
            String yesOrNo = scan.next();
            if (yesOrNo.equals("n") | yesOrNo.equals("N")) {
                continueProgram = false;
                SupplierManage();
            } else {
                System.out.println("----------------------------------------------------------------");
            }
        }else {
            System.out.println("Can't find supplier id. try again! \n");
        }
    }while (continueProgram);
}


    /*----------------search and get supplier name--------------------*/
    private static String GetName(String id) {
    String name="";
        for (int i = 0; i < supplier[0].length; i++) {
            if (supplier[0][i].equals(id)){
                name= supplier[1][i];
            }
        }
        return name;
    }


    /*----------------search and get supplier index--------------------*/
    private static int GetIndex(String id) {
        int name=-1;
        for (int i = 0; i < supplier[0].length; i++) {
            if (supplier[0][i].equals(id)){
                name= i;
            }
        }
        return name;
    }


    /*----------------check supplier is added supplier--------------------*/
    private static void isAdded(String id, String name) {
        String[][] temp = new String[2][supplier[0].length + 1];

        for (int i = 0; i < supplier[0].length; i++) {
            temp[0][i] = supplier[0][i];
            temp[1][i] = supplier[1][i];
        }

        temp[0][temp[0].length - 1] = id;
        temp[1][temp[0].length - 1] = name;

        /*----------------print--------------------*/
        for (int i = 0; i < temp[0].length; i++) {
            supplier = temp;
            System.out.println(supplier[0][i] + ", " + supplier[1][i]);
        }
    }

    /*----------------Exit Supplier--------------------*/
    private static boolean isExits(String id) {
        boolean isAdd = false;
        for (int i = 0; i < supplier[0].length; i++) {
            if (supplier[0][i].equals(id)) {
                isAdd = true;
                break;
            }
        }
        return isAdd;
    }


    /*----------------print Supplier--------------------*/
    private static void PrintSupplier() {
        for (int i = 0; i < supplier[0].length; i++) {
            System.out.println(supplier[0][i] + ", " + supplier[1][i]);
        }
    }



}
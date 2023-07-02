import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    private static String userName = "k";
    private static String password = "1";
    private static String[][] supplier = new String[2][0];
    private static String[] itemCategory = new String[0];

    private static String[][] item = new String[0][7];


    public static void main(String[] args) {

//        LoginUser();
      // HomePage();
        StockManagement();


    }


    /*----------------Console clear--------------------*/
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
                    StockManagement();
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


    /*----------------OPTION 01 (HomePage) --------------------*/
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
            boolean b = CloseProgram("Password change successfully!. do you want to go home page (Y/N) :","do you want to go home page (Y/N) : ");
            if (b){
                continueProgram=false;
                HomePage();
            }
        } while (continueProgram);
    }



    /*----------------OPTION 02 (HomePage) --------------------*/
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
                    DeleteSupplier();
                    currect = false;
                    break;
                case 4:
                    clearConsole();
                    ViewSuppliers();
                    currect = false;
                    break;
                case 5:
                    clearConsole();
                    SearchSupplier();
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



    /*----------------OPTION 05 (HomePage) --------------------*/
    private static void ExitSystem() {
    }


    /*----------------Supplier Add / OPTION 01 (SupplierManage)--------------------*/
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
                boolean b = CloseProgram("\nadded successfully! Do you ant to add another supplier(Y/N) : ", "Do you ant to add another supplier(Y/N) : ");
                if (b){

                }else {
                    clearConsole();
                    SupplierManage();
                    continueProgram = false;
                }
            }
        } while (continueProgram);
    }


    /*----------------Supplier Update / OPTION 02 (SupplierManage)--------------------*/
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

        if (isExits(id)) {
            System.out.println("Supplier Name : " + GetName(id) + "\n");
            System.out.println("Enter the new Supplier Name : ");
            String name = scan.next();
            supplier[1][GetIndex(id)] = name;
            ViewSuppliers();

            boolean b = CloseProgram("\nUpdate successfully! Do you ant to update another supplier(Y/N) : ", "Do you ant to update another supplier(Y/N) : ");
            if (b){

            }else {
                continueProgram = false;
                SupplierManage();
            }

        } else {
            System.out.println("Can't find supplier id. try again! \n");
        }
    } while (continueProgram);
    }


    /*----------------Supplier Delete / OPTION 03 (SupplierManage)--------------------*/
    private static void DeleteSupplier() {
        /*----------------HEADER START--------------------*/
        System.out.println();
        for (int i = 0; i < 101; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println("|    \t\t\t\t\t\t\t\t\t\t  DELETE SUPPLIER  \t\t\t\t\t\t\t\t\t\t|");

        for (int i = 0; i < 101; i++) {
            System.out.print("-");
        }
        System.out.println();
        /*----------------HEADER END--------------------*/

        boolean continueProgram = true;
        do {
            System.out.print("Supplier ID : ");
            String id = scan.next();

            if (isExits(id)) {
                int i = GetIndex(id);
                supplier[0][i] = "null";
                supplier[1][i] = "null";
                ShortArray();
                PrintSupplier();

                boolean b = CloseProgram("\nDelete successfully! Do you ant to delete another supplier(Y/N) : ", "Do you ant to Delete another supplier(Y/N) : ");
                if (b){

                }else {
                    continueProgram = false;
                    SupplierManage();
                }
            } else {
                System.out.println("Can't find supplier id. try again! \n");
                if (supplier[0].length==0){
                    boolean continueP = true;
                    do {
                        boolean b = CloseProgram("\nDelete successfully! Do you ant to delete another supplier(Y/N) : ", "Do you ant to Delete another supplier(Y/N) : ");
                        if (b){

                        }else {
                            continueProgram = false;
                            SupplierManage();
                        }
                    } while (continueP);
                }
            }
        } while (continueProgram);
    }


    /*----------------Supplier View / OPTION 04 (SupplierManage)--------------------*/
    private static void ViewSuppliers() {
        /*----------------HEADER START--------------------*/
        System.out.println();
        for (int i = 0; i < 101; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println("|    \t\t\t\t\t\t\t\t\t\t  View SUPPLIER  \t\t\t\t\t\t\t\t\t\t|");

        for (int i = 0; i < 101; i++) {
            System.out.print("-");
        }
        System.out.println();
        /*----------------HEADER END--------------------*/

        System.out.println("\n");

       if (supplier[0].length==0){
           System.out.println("---------------------------------------------------------");
           System.out.println("|\t\tSUPPLIER ID \t\t|\t\t SUPPLIER NAME \t\t|");
           System.out.println("---------------------------------------------------------");
           System.out.println("|  Data is Empty");
           System.out.println("---------------------------------------------------------");



       }else {
           System.out.println("---------------------------------------------------------");
           System.out.println("|\t\tSUPPLIER ID \t\t|\t\t SUPPLIER NAME \t\t|");
           System.out.println("---------------------------------------------------------");
           for (int i = 0; i < supplier[0].length; i++) {
               System.out.println("|\t\t\t"+supplier[0][i] + " \t\t\t|\t\t\t " + supplier[1][i]+"\t\t\t|");
           }
           System.out.println("---------------------------------------------------------");
       }

        boolean b = CloseProgram("\nDo you wont go to Supplier Manage form (Y/N) : ", "Do you wont go to Supplier Manage form (Y/N) : ");
        if (b){
            clearConsole();
            SupplierManage();
        }else {
            System.out.println("Wrong input!");
            L1:
            while (true){
                boolean x = CloseProgram("\nDo you wont go to Supplier Manage form (Y/N) : ", "Do you wont go to Supplier Manage form (Y/N) : ");
                if (x){
                    clearConsole();
                    SupplierManage();
                    break L1;
                } else {
                    System.out.println("Wrong input!");

                }
            }
        }
    }


    /*----------------Supplier Search / OPTION 05 (SupplierManage)--------------------*/
    private static void SearchSupplier() {
        /*----------------HEADER START--------------------*/
        System.out.println();
        for (int i = 0; i < 101; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println("|    \t\t\t\t\t\t\t\t\t\t  SEARCH SUPPLIER  \t\t\t\t\t\t\t\t\t\t|");

        for (int i = 0; i < 101; i++) {
            System.out.print("-");
        }
        System.out.println();
        /*----------------HEADER END--------------------*/

        boolean isCurrect=true;
        do {
            System.out.print("Supplier ID : ");
            String id = scan.next();

            int x = -1;
            for (int i = 0; i < supplier[0].length; i++) {
                if (id.equals(supplier[0][i])) {
                    x = i;
                }
            }

            if (x == -1) {
                System.out.println("Can't find supplier id. try again");
            } else {
                System.out.println("Supplier Name : " + supplier[1][x]);
            }

            boolean b = CloseProgram("Do you want Serch again (Y/N) ? ", "Do you want Search again (Y/N) ? ");
            if (!b) {
                isCurrect = false;
                clearConsole();
                SupplierManage();
            }
        }while (isCurrect);
    }



    /*----------------OPTION 02 (HomePage) ---------------------*/
    private static void StockManagement() {
        /*----------------HEADER START--------------------*/
        System.out.println();
        for (int i = 0; i < 101; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println("|    \t\t\t\t\t\t\t\t\t\t  STOCK MANAGEMENT  \t\t\t\t\t\t\t\t\t|");

        for (int i = 0; i < 101; i++) {
            System.out.print("-");
        }
        System.out.println();
        /*----------------HEADER END--------------------*/

        System.out.println();
        System.out.println("[1] Manage Item Categories \t\t\t\t\t\t\t [2] Add Item");
        System.out.println("[3] Get Item Supplier Wise \t\t\t\t\t\t\t [4] View Items");
        System.out.println("[5] Rank Item Per Unit Price \t\t\t\t\t\t [6] Home Page");


        boolean currect = false;
        do {
            System.out.print("\nEnter an option to continue > ");
            int num = scan.nextInt();

            switch (num) {
                case 1:
                    clearConsole();
                    ManageItemCategory();
                    currect = false;
                    break;
                case 2:
                    clearConsole();
                    AddItem();
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
                    ViewItem();
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

    private static void ViewItem() {

    }


    /*----------------OPTION 01 (StockManagement) --------------------*/
    private static void ManageItemCategory() {
        /*----------------HEADER START--------------------*/
        System.out.println();
        for (int i = 0; i < 101; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println("|    \t\t\t\t\t\t\t\t\t  MANAGE ITEM CATEGORY  \t\t\t\t\t\t\t\t\t|");

        for (int i = 0; i < 101; i++) {
            System.out.print("-");
        }
        System.out.println();
        /*----------------HEADER END--------------------*/

        System.out.println();
        System.out.println("[1] Add New Item Category \t\t\t\t\t\t\t [2] Delete Item Category");
        System.out.println("[3] Update Item Category \t\t\t\t\t\t\t [4] Stock Management");

        boolean currect = false;
        do {
            System.out.print("\nEnter an option to continue > ");
            int num = scan.nextInt();

            switch (num) {
                case 1:
                    clearConsole();
                    AddItemCategory();
                    currect = false;
                    break;
                case 2:
                    clearConsole();
                    DeleteItemCategory();
                    currect = false;
                    break;
                case 3:
                    clearConsole();
                    UpdateItemCategory();
                    currect = false;
                    break;
                case 4:
                    clearConsole();
                    StockManagement();
                    currect = false;
                    break;
                default:
                    System.out.println("Wrong input");
                    currect = true;
            }
        } while (currect);
    }


    /*----------------OPTION 01 (ManageItemCategory) --------------------*/
    private static void AddItemCategory() {
        /*----------------HEADER START--------------------*/
        System.out.println();
        for (int i = 0; i < 101; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println("|    \t\t\t\t\t\t\t\t\t  ADD ITEM CATEGORY  \t\t\t\t\t\t\t\t\t\t|");

        for (int i = 0; i < 101; i++) {
            System.out.print("-");
        }
        System.out.println();
        /*----------------HEADER END--------------------*/


        boolean continueProgram = true;
        do {
            System.out.println();
            System.out.print("Enter the new item category : ");
            String name = scan.next();

            if (isExitsCategory(name)) {
                System.out.println("Already exits. try another supplier id! \n");
                boolean b = CloseProgram("Do you ant to add another category(Y/N) : ", "Do you ant to add another category(Y/N) : ");
//                System.out.println(Arrays.toString(itemCategory));
                if (b) {
                } else {
                    clearConsole();
                    ManageItemCategory();
                    continueProgram = false;
                }
            } else {
                isAddedCategory(name);
                boolean b = CloseProgram("added successfully! Do you ant to add another category(Y/N) : ", "Do you ant to add another category(Y/N) : ");
                System.out.println(Arrays.toString(itemCategory));
                if (b) {
                } else {
                    clearConsole();
                    ManageItemCategory();
                    continueProgram = false;
                }
            }
        } while (continueProgram);
    }


    /*----------------OPTION 02 (ManageItemCategory) --------------------*/
    private static void DeleteItemCategory() {
        /*----------------HEADER START--------------------*/
        System.out.println();
        for (int i = 0; i < 101; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println("|    \t\t\t\t\t\t\t\t\t\t  DELETE CATEGORY  \t\t\t\t\t\t\t\t\t\t|");

        for (int i = 0; i < 101; i++) {
            System.out.print("-");
        }
        System.out.println();
        /*----------------HEADER END--------------------*/


        boolean continueProgram = true;
        do {
            System.out.println();
            System.out.print("Enter the new item category : ");
            String name = scan.next();

            if (isExitsCategory(name)) {

                String[] temp = new String[itemCategory.length - 1];
                int j=0;
                for (int i = 0; i < itemCategory.length; i++) {
                    if (!name.equals(itemCategory[i])){
                        temp[j]=itemCategory[i];
                        j++;
                    }
                }
                itemCategory=temp;


                boolean b = CloseProgram("Delete successfully!. Do you ant to delete another category(Y/N) : ", "Do you ant to Delete another category(Y/N) : ");
                System.out.println(Arrays.toString(itemCategory));
                if (b) {
                } else {
                    clearConsole();
                    ManageItemCategory();
                    continueProgram = false;
                }
            } else {
                if (itemCategory.length==0){
                    System.out.println("Category Data is Empty!");
                }
                System.out.println("Category is not!");
                boolean b = CloseProgram("Do you ant to delete another category(Y/N) : ", "Do you ant to delete another category(Y/N) : ");
//                System.out.println(Arrays.toString(itemCategory));
                if (b) {
                } else {
                    clearConsole();
                    ManageItemCategory();
                    continueProgram = false;
                }
            }
        } while (continueProgram);
    }


    /*----------------OPTION 02 (ManageItemCategory) --------------------*/
    private static void UpdateItemCategory() {
        /*----------------HEADER START--------------------*/
        System.out.println();
        for (int i = 0; i < 101; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println("|    \t\t\t\t\t\t\t\t\t\t  UPDATE CATEGORY  \t\t\t\t\t\t\t\t\t\t|");

        for (int i = 0; i < 101; i++) {
            System.out.print("-");
        }
        System.out.println();
        /*----------------HEADER END--------------------*/


        boolean continueProgram = true;
        do {
            System.out.println();
            System.out.print("Enter the new item category : ");
            String name = scan.next();

            if (isExitsCategory(name)) {
                System.out.print("Enter the change item category : ");
                String newName = scan.next();
                for (int i = 0; i < itemCategory.length; i++) {
                    if (name.equals(itemCategory[i])){
                        itemCategory[i]=newName;
                    }
                }

                boolean b = CloseProgram("Update successfully!. Do you want to Update another category(Y/N) : ", "Do you wont to Update another category(Y/N) : ");
                System.out.println(Arrays.toString(itemCategory));
                if (b) {
                } else {
                    clearConsole();
                    ManageItemCategory();
                    continueProgram = false;
                }
            } else {
                if (itemCategory.length==0){
                    System.out.println("don't have any item categories in the system");
                }
                System.out.println("Category is not!");
                boolean b = CloseProgram("Do you wont to Update another category(Y/N) : ", "Do you want to Update another category(Y/N) : ");
                System.out.println(Arrays.toString(itemCategory));
                if (b) {
                } else {
                    clearConsole();
                    ManageItemCategory();
                    continueProgram = false;
                }
            }
        } while (continueProgram);
    }



    /*----------------OPTION 02 (StockManagement) --------------------*/
    private static void AddItem() {
        /*----------------HEADER START--------------------*/
        System.out.println();
        for (int i = 0; i < 101; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println("|    \t\t\t\t\t\t\t\t\t  ADD ITEM   \t\t\t\t\t\t\t\t\t\t\t\t|");

        for (int i = 0; i < 101; i++) {
            System.out.print("-");
        }
        System.out.println();
        /*----------------HEADER END--------------------*/

        System.out.println();
      if (itemCategory.length==0){
          System.out.println("OOPS! It seems that you don't have any item categories in the system.");
          boolean b = CloseProgram("Do you wont to add another category(Y/N) : ", "Do you want to add another category(Y/N) : ");
          System.out.println(Arrays.toString(itemCategory));
          if (b) {
              clearConsole();
              AddItemCategory();
          } else {
              clearConsole();
              StockManagement();
          }
      }

      if (supplier[0].length==0){
          System.out.println("OOPS! It seems that you don't have any Suppliers in the system.");
          boolean b = CloseProgram("Do you wont to add new Suppliers(Y/N) : ", "Do you want to add new Suppliers(Y/N) : ");
          System.out.println(Arrays.toString(itemCategory));
          if (b) {
              clearConsole();
              AddSupplier();
          } else {
              clearConsole();
              StockManagement();
          }
      }

        boolean continueProgram = true;
        do {
            System.out.println();
            System.out.print("Enter the new item code : ");
            String code = scan.next();

            if (isExitsItem(code)) {
                System.out.println("Already exits. try another Item code! \n");
                boolean b = CloseProgram("Do you want to add another Item(Y/N) : ", "Do you want to add another Item(Y/N) : ");
                if (b) {
                } else {
                    clearConsole();
                    StockManagement();
                    continueProgram = false;
                }
            } else {

                System.out.println("\nSuppliers List : ");
                System.out.println("-------------------------------------------------------------------------");
                System.out.println("|\t\t#\t\t|\t\tSUPPLIER ID \t\t|\t\t SUPPLIER NAME \t\t|");
                System.out.println("-------------------------------------------------------------------------");
                for (int i = 0; i < supplier[0].length; i++) {
                    System.out.println("|\t\t"+(i+1)+"\t\t|\t\t\t"+supplier[0][i] + " \t\t\t|\t\t\t " + supplier[1][i]+"\t\t\t|");
                }
                System.out.println("-------------------------------------------------------------------------");

                System.out.print("\nEnter the Supplier number : ");
                int supplier = scan.nextInt();

                System.out.println("\nItem Category : ");
                System.out.println("---------------------------------------------");
                System.out.println("|\t\t#\t\t|\t\tSUPPLIER ID \t\t|");
                System.out.println("---------------------------------------------");
                for (int i = 0; i < itemCategory.length; i++) {
                    System.out.println("|\t\t"+(i+1)+"\t\t|\t\t\t"+itemCategory[i] + " \t\t\t|");
                }
                System.out.println("---------------------------------------------");


                System.out.print("\nEnter the category number : ");
                int category = scan.nextInt();

                System.out.print("description : ");
                String description = scan.next();

                System.out.print("unit Price : ");
                String unitPrice = scan.next();

                System.out.print("qty On Hand : ");
                String qtyOnHand = scan.next();

                isAddedItem(code,(supplier-1),(category-1),description,unitPrice,qtyOnHand);

                System.out.println(Arrays.deepToString(item));
                boolean b = CloseProgram("added successfully! Do you want to add another Item(Y/N) : ", "Do you want to add another Item(Y/N) : ");
                System.out.println(Arrays.toString(item));
                if (b) {
                } else {
                    clearConsole();
                    ManageItemCategory();
                    continueProgram = false;
                }
            }
        } while (continueProgram);

    }






    /*========================================================================================*/

    /*----------------close program (Y/N)--------------------*/
    private static boolean CloseProgram(String x,String y) {
        boolean b=true;
        System.out.print(x);
        String yesOrNo = scan.next();
        yesOrNo = yesOrNo.toUpperCase();
        if (yesOrNo.equals("YES") | yesOrNo.equals("Y")) {
            b = true;
        } else if(yesOrNo.equals("NO") | yesOrNo.equals("N")) {
            b=false;
            System.out.println("----------------------------------------------------------------");
        } else {
            boolean isCorrect=true;
            do {
                System.out.print(y);
                String yesONo = scan.next();
                yesONo = yesONo.toUpperCase();
                if (yesONo.equals("YES") | yesONo.equals("Y")) {
                    isCorrect=false;
                    b = true;
                } else if(yesONo.equals("NO") | yesONo.equals("N")) {
                    System.out.println("----------------------------------------------------------------");
                    isCorrect=false;
                    b=false;
                }
            }while (isCorrect);
        }
        return b;
    }


    /*----------------Null values ain karala short karanna--------------------*/
    private static void ShortArray() {

        for (int i = 0; i < supplier[0].length; i++) {
            if (supplier[0][i].equals("null")) {
                for (int j = i; j < supplier[0].length - 1; j++) {
                    supplier[0][j] = supplier[0][j + 1];
                    supplier[1][j] = supplier[1][j + 1];
                }
            }
        }

        String temp[][] = new String[2][supplier[0].length - 1];
        for (int i = 0; i < temp[0].length; i++) {
            temp[0][i] = supplier[0][i];
            temp[1][i] = supplier[1][i];
        }
        supplier = temp;
    }


    /*----------------search and get supplier name--------------------*/
    private static String GetName(String id) {
        String name = "";
        for (int i = 0; i < supplier[0].length; i++) {
            if (supplier[0][i].equals(id)) {
                name = supplier[1][i];
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


    /*------------------------------------- added ------------------------------------------*/

    /*----------------check supplier and added supplier--------------------*/
    private static void isAdded(String id, String name) {
        String[][] temp = new String[2][supplier[0].length + 1];

        for (int i = 0; i < supplier[0].length; i++) {
            temp[0][i] = supplier[0][i];
            temp[1][i] = supplier[1][i];
        }

        temp[0][temp[0].length - 1] = id;
        temp[1][temp[0].length - 1] = name;

        supplier=temp;
    }

    /*----------------check category and add item category--------------------*/
    private static void isAddedCategory(String name) {
        String[] temp = new String[itemCategory.length + 1];
        for (int i = 0; i < itemCategory.length; i++) {
            temp[i]=itemCategory[i];
        }
        temp[temp.length-1]=name;
        itemCategory=temp;
    }

    /*----------------check item and add item --------------------*/
    private static void isAddedItem(String code, int number, int category, String description, String unitPrice, String qtyOnHand) {
        String[][] temp = new String[item.length + 1][7];
        for (int i = 0; i < item.length; i++) {
            temp[i]=item[i];
        }
        temp[item.length][0]=code;
        temp[item.length][1]=description;
        temp[item.length][2]=unitPrice;
        temp[item.length][3]=qtyOnHand;
        temp[item.length][4]=supplier[0][number];
        temp[item.length][5]=supplier[1][number];
        temp[item.length][6]=itemCategory[category];

        item=temp;
    }


    /*------------------------------------- Exit ------------------------------------------*/

    /*----------------check Exit item --------------------*/
    private static boolean isExitsItem(String code) {
        boolean yesNo=false;
        for (int i = 0; i < item.length; i++) {
            if (code.equals(item[0][i])){
                yesNo=true;
            }
        }
        return yesNo;
    }

    /*----------------check Exit item category--------------------*/
    private static boolean isExitsCategory(String name) {
        boolean yesNo = false;
        for (int i = 0; i < itemCategory.length; i++) {
            if (name.equals(itemCategory[i])) {
                yesNo = true;
            }
        }
        return yesNo;
    }

    /*----------------check Exit Supplier--------------------*/
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
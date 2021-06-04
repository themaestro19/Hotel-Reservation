import java.util.Scanner;

public class MainMenu {

    public static void Menu(){
        Scanner scanner = new Scanner(System.in);
        String order = "";

        printMenu();

        do{
            order = scanner.nextLine();

            if(order.length() == 1) {
                switch (order.charAt(0)) {
                    case '1':
                        break;
                    case '4':
                        Admin.AdminMenu();
                        break;
                    case '5':
                        System.out.println("Exit");
                        break;
                    default:
                        System.out.println("Wrong Action!!");
                }
            }else{
                System.out.println("Invalid Input!!");
            }
        }while (order.charAt(0) != 5 || order.length() != 1);



    }

    public static void printMenu(){
        System.out.println("Welcome to the Hotel Reservation Application\n\n" +
                           "------------------------------------------------\n" +
                           "1. Find and reserve a room\n" +
                           "2. See my reservations\n" +
                           "3. Create an Account\n" +
                           "4. Admin\n" +
                           "5. Exit\n" +
                           "-----------------------------------------------\n" +
                           "Please select a number for the menu option");
    }
}

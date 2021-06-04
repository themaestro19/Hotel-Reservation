import java.util.Scanner;

public class Admin {

    public static void AdminMenu(){
        String order = "";
        Scanner scanner = new Scanner(System.in);

        printAdminMenu();

        order = scanner.nextLine();
        switch (order.charAt(0)){
            case '1':
                displayAllCustomers();
                break;
            case '2':
                displayAllRooms();
                break;
            case '3':
                displayAllReservations();
                break;
            case '4':
                addRoom();
                break;
            case '6':
                MainMenu.printMenu();
                break;
            default:
                System.out.println("Wrong Action!!");
        }
    }

    private static void addRoom(){

    }

    private static void displayAllCustomers(){

    }

    private static void displayAllRooms(){

    }

    private static void displayAllReservations(){

    }

    public static void printAdminMenu(){
        System.out.println("Admin Menu\n\n" +
                "------------------------------------------------\n" +
                "1. See all Customers\n" +
                "2. See all Rooms\n" +
                "3. See all Reservations\n" +
                "4. Add a Room\n" +
                "5. Add Test Data\n" +
                "6. Back to Main Menu\n" +
                "------------------------------------------------\n" +
                "Please select a number for the menu options");
    }
}

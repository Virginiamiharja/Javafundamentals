import java.util.ArrayList;
import java.util.Scanner;

public class App {
    // Ini dibikin static biar dia bisa langsung manggil gitu tanpa buat instance
    // contoh employeeCount
    static Scanner scanner = new Scanner(System.in);
    // Ini artinya si Buah itu type data dimana dia itu object
    static ArrayList<Buah> listBuah = new ArrayList<Buah>();

    public static void main(String[] args) throws Exception {
        while (true) {
            // Main menu
            System.out.println("WELCOME TO TOKO BUAH");
            System.out.println("====================");
            System.out.println("1. Add Buah");
            System.out.println("2. List Buah");
            System.out.println("3. Exit");
            System.out.print("Choose menu: ");

            String menu = scanner.next();

            if (menu.equals("1")) {
                Menu.tambahBuah();
            } else if (menu.equals("2")) {
                Menu.listBuah();
            } else {
                break;
            }
        }
    }
}

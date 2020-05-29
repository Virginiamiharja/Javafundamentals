import java.util.ArrayList;
import java.util.Scanner;

public class App {
    // Ini dibikin static biar dia bisa langsung manggil gitu tanpa buat instance
    // contoh employeeCount
    private static Scanner scanner = new Scanner(System.in);
    // Ini artinya si Buah itu type data dimana dia itu object
    private static ArrayList<Buah> listBuah = new ArrayList<Buah>();

    public static void main(String[] args) throws Exception {
        // Main menu
        System.out.println("WELCOME TO TOKO BUAH");
        System.out.println("====================");
        System.out.println("1. Add Buah");
        System.out.println("2. List Buah");
        System.out.println("3. Exit");
        System.out.print("Choose menu: ");

        int menu = scanner.nextInt();

        switch (menu) {
            case 1:
                tambahBuah();
                // break;
            case 2:
                listBuah();
                break;
            case 3:
                break;
        }
    }

    public static void tambahBuah() {
        while (true) {
            String inputNama = readInput("Nama buah: ");
            int inputHarga = scanner.nextInt();
            int inputStock = scanner.nextInt();

            Buah buah = new Buah(inputNama, inputHarga, inputStock);
            listBuah.add(buah);

            System.out.print("Repeat? (y/n)");
            String opt = scanner.next();

            // Jadi katanya kalo pake yang "==" dia itu bukan ngecompare valuenya tapi letak
            // dalam ram gitu
            if (opt.equalsIgnoreCase("N")) {
                break;
            }
        }
    }

    // Karena dia mereturn sesuatu jadi jangan pake void
    public static String readInput(String message) {
        System.out.print(message);
        return scanner.next();
    }

    // Trs kita pake method overloading untuk int
    public static int readInput(int message) {
        System.out.print(message);
        return scanner.nextInt();
    }

    public static void listBuah() {
        // listBuah.forEach(item -> {
        // System.out.println(
        // "1. " + item.getNama() + " || " + item.getHarga() + " || " + item.getStock()
        // + "pcs");
        // });

        System.out.println("========= List Buah =========");
        for (int i = 0; i < listBuah.size(); i++) {
            System.out.println((i + 1) + ". " + listBuah.get(i).getNama() + " || " + listBuah.get(i).getHarga() + " || "
                    + listBuah.get(i).getStock() + "pcs");

        }
    }
}

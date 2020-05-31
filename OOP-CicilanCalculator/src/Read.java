import java.util.Scanner;

public class Read {

    private static Scanner scanner = new Scanner(System.in);

    public static String readString(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    public static double readDouble(String message) {
        System.out.print(message);
        return scanner.nextDouble();
    }

}
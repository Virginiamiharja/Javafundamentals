import java.text.NumberFormat;

public class Display {

    public static void displayMessage(String message) {
        System.out.println(message);
    }

    public static void displayNumber(String message, double sisaBayaran) {
        System.out.println(message + " " + NumberFormat.getCurrencyInstance().format(sisaBayaran));
    }

}
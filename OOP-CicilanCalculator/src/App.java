import java.util.Scanner;
import java.text.NumberFormat;

public class App {
    public static Scanner scanner = new Scanner(System.in);
    // Constant variable makanya dia capslock
    static final int BULAN_DALAM_TAHUN = 12;

    public static void main(String[] args) throws Exception {

        int hargaAwal = (int) Console.readInputNumber("Harga awal : ", 1_000_000, 10_000_000);
        int durasiCicilan = (int) Console.readInputNumber("Durasi cicilan : ", 1);
        double bunga = Console.readInputNumber("Bunga : ", 0);

        Calculate calculate = new Calculate(hargaAwal, durasiCicilan, bunga);
        Report report = new Report(calculate);

        report.tampilBayaran();
        report.tampilSisaBayaranPerBulan();

    }

}

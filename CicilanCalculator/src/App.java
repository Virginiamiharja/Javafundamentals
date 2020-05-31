package CicilanCalculator.src;

import java.util.Scanner;
import java.text.NumberFormat;

public class App {
    public static Scanner scanner = new Scanner(System.in);
    // Constant variable makanya dia capslock
    private static final int BULAN_DALAM_TAHUN = 12;
    private static final int PERCENT = 100;

    public static void main(String[] args) throws Exception {
        int hargaAwal;
        int durasiCicilan;
        double bunga;
        double sisaBayaran;

        while (true) {
            hargaAwal = (int) readInputNumber("Input harga awal: ");
            if (hargaAwal >= 1000_000 && hargaAwal <= 100_000_000) {
                break;
            }
            System.out.println("Harga minimal 1000.000");
        }

        while (true) {
            durasiCicilan = (int) readInputNumber("Input durasi cicilan: ");
            if (durasiCicilan >= 1) {
                break;
            }
            System.out.println("Durasi minimal 1 tahun");
        }

        while (true) {
            bunga = readInputNumber("Input bunga: ");
            if (bunga >= 0) {
                break;
            }
            System.out.println("Bunga minimal 0");
        }

        final double bayaranPerBulan = (hargaAwal + (hargaAwal * (bunga / PERCENT)))
                / (durasiCicilan * BULAN_DALAM_TAHUN);

        System.out.println("========== Pembayaran Setiap Bulan ==========");
        tampilBayaran(bayaranPerBulan);

        System.out.println("========== Sisa Bayaran Per Bulan ==========");
        sisaBayaran = hargaAwal + (hargaAwal * (bunga / PERCENT));
        for (int i = 0; i < durasiCicilan * BULAN_DALAM_TAHUN; i++) {
            sisaBayaran -= bayaranPerBulan;
            System.out.println(NumberFormat.getCurrencyInstance().format(sisaBayaran));
        }

    }

    public static void tampilBayaran(double bayaranPerBulan) {
        System.out.println(NumberFormat.getCurrencyInstance().format(bayaranPerBulan));
    }

    public static double readInputNumber(String message) {
        System.out.print(message);
        return scanner.nextDouble();
    }
}

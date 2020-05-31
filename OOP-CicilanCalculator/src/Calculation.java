public class Calculation {
    private static int BULAN_DALAM_TAHUN = 12;
    private static int PERCENT = 100;

    public static void calculateBayaranPerBulan(int hargaAwal, int durasiCicilan, double bunga) {
        // Cicilan cicilan = new Cicilan();

        // Lupa ini final buat apa ya ?
        final double bayaranPerBulan = (hargaAwal + (hargaAwal * (bunga / PERCENT)))
                / (durasiCicilan * BULAN_DALAM_TAHUN);

        Display.displayMessage("===== Pembayaran Setiap Bulan =====");
        Display.displayNumber("Sebesar", bayaranPerBulan);

        // System.out.println(cicilan.getHargaAwal());
        // System.out.println(cicilan.getDurasiCicilan());
        // System.out.println(cicilan.getBunga());

        calculateSisaBayaranPerBulan(bayaranPerBulan, durasiCicilan, bunga, hargaAwal);
    }

    public static void calculateSisaBayaranPerBulan(double bayaranPerBulan, int durasiCicilan, double bunga,
            int hargaAwal) {
        double sisaBayaran = hargaAwal + (hargaAwal * (bunga / PERCENT));
        Display.displayMessage("===== Sisa Bayaran per Bulan =====");
        for (int i = 0; i < durasiCicilan * BULAN_DALAM_TAHUN; i++) {
            sisaBayaran -= bayaranPerBulan;
            Display.displayNumber("Bulan " + (i + 1), sisaBayaran);
        }
    }
}
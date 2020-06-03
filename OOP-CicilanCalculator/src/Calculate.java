public class Calculate {

    private int hargaAwal;
    private int durasiCicilan;
    private double bunga;

    private static final int PERCENT = 100;

    public Calculate(int hargaAwal, int durasiCicilan, double bunga) {
        this.hargaAwal = hargaAwal;
        this.durasiCicilan = durasiCicilan;
        this.bunga = bunga;
    }

    public int getDurasiCicilan() {
        return this.durasiCicilan;
    }

    public double hitungBayaranPerBulan() {
        return (hargaAwal + (hargaAwal * (bunga / PERCENT))) / (durasiCicilan * App.BULAN_DALAM_TAHUN);
    }

    public double hitungSisaBayaranPerBulan(int bulanSudahDibayar) {
        double totalBayaran = hargaAwal + (hargaAwal * (bunga / PERCENT));
        double sudahDibayar = hitungBayaranPerBulan() * bulanSudahDibayar;

        return totalBayaran - sudahDibayar;
    }
}
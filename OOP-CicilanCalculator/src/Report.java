import java.text.NumberFormat;

public class Report {

    private Calculate calculate;

    public Report(Calculate calculate) {
        this.calculate = calculate;
    }

    public void tampilBayaran() {
        System.out.println("---------- PEMBAYARAN SETIAP BULAN ----------");
        System.out.println(NumberFormat.getCurrencyInstance().format(calculate.hitungBayaranPerBulan()));
    }

    public void tampilSisaBayaranPerBulan() {
        System.out.println("---------- SISA BAYARAN PER BULAN ----------");

        for (int bulan = 1; bulan <= calculate.getDurasiCicilan() * App.BULAN_DALAM_TAHUN; bulan++) {
            System.out.println(NumberFormat.getCurrencyInstance().format(calculate.hitungSisaBayaranPerBulan(bulan)));
        }
    }
}
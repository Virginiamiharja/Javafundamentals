public class Cicilan {

    private int hargaAwal;
    private int durasiCicilan;
    private double bunga;

    public int getHargaAwal() {
        return hargaAwal;
    }

    public void setHargaAwal(int hargaAwal) {
        if (hargaAwal >= 1000_000 && hargaAwal <= 10_000_000) {
            this.hargaAwal = hargaAwal;
        } else {
            Display.displayMessage("Harga minimum 1 juta dan maximum 10 juta");
        }
    }

    public int getDurasiCicilan() {
        return durasiCicilan;
    }

    public void setDurasiCicilan(int durasiCicilan) {
        if (durasiCicilan >= 1) {
            this.durasiCicilan = durasiCicilan;
        } else {
            Display.displayMessage("Durasi cicilan minimum 1 tahun");
        }
    }

    public double getBunga() {
        return bunga;
    }

    public void setBunga(double bunga) {
        if (bunga >= 0) {
            this.bunga = bunga;
            // Ini sengaja ngelempar params disini karena ketika di class Calculation,
            // ketika ngeget bunga, durasiCicilan, dan hargaAwal dia itu kaya ga ke set sama
            // sekali jadi masih 0
            Calculation.calculateBayaranPerBulan(this.getHargaAwal(), this.getDurasiCicilan(), this.getBunga());
        } else {
            Display.displayMessage("Bunga tidak boleh kurang dari 0%");
        }
    }

}
public class App {

    public static void main(String[] args) throws Exception {
        int hargaAwal;
        int durasiCicilan;
        double bunga;
        Cicilan cicilan = new Cicilan();

        Display.displayMessage("Welcome to Cicilan Calculator UNICORN");
        Display.displayMessage("=============================");

        while (cicilan.getHargaAwal() == 0) {
            hargaAwal = (int) Read.readDouble("Masukkan harga awal: ");
            cicilan.setHargaAwal(hargaAwal);
        }

        while (cicilan.getDurasiCicilan() == 0) {
            durasiCicilan = (int) Read.readDouble("Masukkan durasi cicilan: ");
            cicilan.setDurasiCicilan(durasiCicilan);
        }

        while (cicilan.getBunga() == 0) {
            bunga = Read.readDouble("Masukkan bunga: ");
            cicilan.setBunga(bunga);
        }
    }

}

import java.util.ArrayList;

public class Buah {
    private String nama;
    private int harga;
    private int stock;
    public int buahCount;

    public Buah(String nama, int harga, int stock) {
        // Gaperlu digunakan karena kita akan pake si setter
        // this.nama = nama;
        // this.harga = harga;
        // this.stock = stock;

        // Jadinya kita pake begini
        setNama(nama);
        setHarga(harga);
        setStock(stock);
        buahCount++;
    }

    public String getNama() {
        return nama;
    }

    // Kenapa constructor dibuat private karena kan dia dipake di kelas ini sendiri
    // yaitu di constructor
    private void setNama(String nama) {
        if (nama.length() == 0) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.nama = nama;
    }

    public int getHarga() {
        return harga;
    }

    private void setHarga(int harga) {
        if (harga <= 0) {
            throw new IllegalArgumentException("Price cannot be less than or equals to 0");
        }
        this.harga = harga;
    }

    public int getStock() {
        return stock;
    }

    private void setStock(int stock) {
        if (stock < 0) {
            throw new IllegalArgumentException("Stock cannot be less than 0");
        }
        this.stock = stock;
    }
}
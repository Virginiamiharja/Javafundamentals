import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        // System.out.println("Hello World")

        // Primitive data types
        // umur -> byte
        final byte umur = 45;

        // short
        final short iniShort = 128;

        // int
        final int iniInt = 1_142_342;

        // loat
        final float iniFloat = 147.324F;

        // double
        final double iniDouble = 142.32D;

        // string
        final String nama = "Seto";

        // char
        final char grade = 'B';

        final boolean isVerified = true;

        // Reference data types
        // Ini jadi kaya array kosong trs kita define panjang arraynya berapa
        // String people[] = new String[5];
        // people[0] = "Seto";
        // System.out.println(Arrays.toString(people));

        // Ini kalo kita udah tau isi arraynya
        // int number[] = { 1, 2, 3, 4, 5 };
        // System.out.println(Arrays.toString(number));

        // Array 2 dimensi
        final int matrix[][] = new int[4][3];
        matrix[0][1] = 17;
        matrix[1][0] = 7;
        // Walaupun array 3 dimensi pun dia bakal tetep kebuka semua
        // System.out.println(Arrays.deepToString(matrix));
        // Constant variable
        final float PI = 3.14F;

        // Untuk membuat bisa inputan, tolong tampung semua dari system.in
        // Scanner scanner = new Scanner(System.in);
        // next Byte itu akan membaca token pertama
        // byte inputAge = scanner.nextByte();
        // System.out.println("Age: " + inputAge);

        // Ini juga membaca token pertama, token pertama itu Hello World dia bacanya
        // Hello
        // Kalo mau biar dia bisa baca semuanya pake nextLine()
        // String inputName = scanner.next();

        // System.out.print("Masukkan nama anda : ");
        // String inputName = scanner.nextLine();
        // System.out.println("Nama: " + inputName);

        // Nama ada <Nama>, berumur <Umur>, tinggal di <Tempat_Tinggal>, lahir tahun
        // <Tahunlahir>
    }
}
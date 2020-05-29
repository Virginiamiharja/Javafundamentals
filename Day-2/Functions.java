import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Functions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.print("Input nilai minimum : ");
        // byte inputMin = scanner.nextByte();

        // System.out.print("Input nilai minimum : ");
        // byte inputMax = scanner.nextByte();

        // System.out.println(generateArrayFromRange(inputMin, inputMax));

        System.out.print("Input angka : ");
        byte inputNumber = scanner.nextByte();

        System.out.println(includeValue(inputNumber));
    }

    public static boolean includeValue(int inputNumber) {
        int arrNumber[] = { 1, 2, 3, 4, 5 };

        // // Pake for biasa
        // for (int i = 0; i < arrNumber.length; i++) {
        //     if (inputNumber == arrNumber[i])
        //         return true;
        // }

        // return false;

        // Pake foreach
        for (int i : arrNumber) {
            if (i == inputNumber)
                return true;
        }
        return false;
    }

    // Void itu artinya dia ga ngereturn apa2
    // Kita ganti arrayList biar dia ngereturn arrayList
    public static ArrayList<Integer> generateArrayFromRange(int inputMin, int inputMax) {
        // Bikin misalnya kita input -3 trs 5, nah kita harus print -3, -2, -1, 0, 1, 2,
        // ,3 ,4 ,5
        // Step 1 cari jarak dari -3 ke 5 berarti taroh lah 8 nah (input min - input
        // max) + 1
        // Trs kita looping deh, for i = 0 ; i < range ; i++ dimana si rangenya itu si
        // (input min - input max) + 1

        if (inputMin < inputMax) {
            // Cara panjang
            int range = (inputMax - inputMin) + 1;
            // int arrNumber[] = new int[range];
            // for (int i = 0; i < range; i++) {
            // arrNumber[i] = i + inputMin;
            // }
            // System.out.println(Arrays.toString(arrNumber));

            // Cara pendek pakai array list, kalo si array list itu sifatnya dinamis
            // Ini artinya array list arrNumber setiap indexnya adalah integer
            ArrayList<Integer> arrNumber = new ArrayList<Integer>();
            for (int i = inputMin; i <= inputMax; i++) {
                arrNumber.add(i);
            }

            // System.out.println(arrNumber);
            return arrNumber;
        }
        return new ArrayList<Integer>();
    }

}
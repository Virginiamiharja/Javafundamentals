public class Menu {

    public static void tambahBuah() {
        while (true) {
            String inputNama = Console.readInputString("Nama buah: ");
            // Ini dipakein int untuk ngeconvert karena si methodnya dia pake double
            int inputHarga = (int) Console.readInputNumber("Harga buah: ");
            int inputStock = (int) Console.readInputNumber("Stock buah: ");

            Buah buah = new Buah(inputNama, inputHarga, inputStock);
            App.listBuah.add(buah);

            System.out.print("Repeat? (y/n)");
            String opt = App.scanner.next();

            // Jadi katanya kalo pake yang "==" dia itu bukan ngecompare valuenya tapi letak
            // dalam ram gitu
            if (opt.equalsIgnoreCase("N")) {
                break;
            }
        }
    }

    public static void listBuah() {
        System.out.println("========= List Buah =========");
        for (int i = 0; i < App.listBuah.size(); i++) {
            System.out.println((i + 1) + ". " + App.listBuah.get(i).getNama() + " || " + App.listBuah.get(i).getHarga()
                    + " || " + App.listBuah.get(i).getStock() + "pcs");

        }
    }

}
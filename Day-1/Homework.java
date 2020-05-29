import java.util.Scanner;

class Homework {
    public static void main(String[] args) {
        String name, ttl;
        int usia, tahunLahir;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama anda : ");
        name = scanner.nextLine();
        System.out.print("Usia : ");
        usia = scanner.nextByte();
        System.out.print("Tempat lahir : ");
        // Ini biar dia gangambil line bawahnya gitu
        ttl = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Tahun Lahir: ");
        tahunLahir = scanner.nextInt();

        // String template = "Nama anda adalah %s, berumur %s tahun, tinggal di %s,
        // lahir tahun %s";
        // String result = ;

        System.out.print("Nama anda " + name + " berumur " + usia + " tinggal di " + ttl + " tahun lahir " + tahunLahir);
    }
}
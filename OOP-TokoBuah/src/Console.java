public class Console {
    // Karena dia mereturn sesuatu jadi jangan pake void
    public static String readInputString(String message) {
        System.out.print(message);
        return App.scanner.next();
    }

    // Trs kita pake method overloading untuk int
    public static double readInputNumber(String message) {
        System.out.print(message);
        return App.scanner.nextDouble();
    }
}
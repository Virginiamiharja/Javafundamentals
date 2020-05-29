import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        // Ini namanya instance
        Employee orang = new Employee(50_000, 100);
        Employee person = new Employee(50_000, 100);

        // System.out.println(orang.calculateWage(7));
        
        // Kalo static biar bisa dipanggil langsung begini
        System.out.println(Employee.employeeCount);
    }

    public static int calculateWage(int salary, int overtime, int payPerHour) {
        return salary + (overtime * payPerHour);
    }

    public static void testing() {
        System.out.println("Testing 123");
    }
    
}

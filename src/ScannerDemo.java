import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        // Format CTRL + ALT + L
        // Create a Scanner
        Scanner scanner = new Scanner(System.in);
        String name;
        // How do we receive input from user?
        System.out.println("What is your name?");
        name = scanner.nextLine(); // String
        System.out.println("Welcome, " + name);

        // input Age
        System.out.print("Enter your age: ");
        int old = scanner.nextInt();
        System.out.println("age: " + old);
    }
}

import java.util.Scanner;

public class DataTypeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value: ");
        if (scanner.hasNextInt()) {
            int value = scanner.nextInt();
            if (value % 10 == 0) {
                System.out.println("Value is divisible by 10");
            } else {
                System.out.println("Value is not divisible by 10");
            }
        } else if (scanner.hasNext()) {
            String value = scanner.next();
            if (value.matches("[a-zA-Z]+")) {
                String reversedValue = new StringBuilder(value).reverse().toString();
                System.out.println("Reversed value: " + reversedValue);
            } else {
                System.out.println("Value is not an alphabet");
            }
        } else {
            System.out.println("Invalid input");
        }
        scanner.close();
    }
}

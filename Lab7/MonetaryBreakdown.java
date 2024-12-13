import java.util.Scanner;

public class MonetaryBreakdown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MoneyCalc calculator = new MoneyCalc();

        while (true) {
            System.out.print("Enter a monetary amount (or 'quit' to exit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("quit")) {
                System.out.println("quitting...");
                break;
            }

            try {
                double amount = Double.parseDouble(input);
                if (amount < 0) {
                    System.out.println("Amount cannot be negative. Please try again.");
                } else {
                    calculator.calculateChange(amount);
                }
            } catch (NumberFormatException e) {
                System.out.println("EXCEPTION: Invalid input");
            }
        }

        scanner.close();
    }
}

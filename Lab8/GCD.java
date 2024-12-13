import java.util.Scanner;

public class GCD{

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter positive integer as numerator: ");
        int numerator = scanner.nextInt();
        System.out.print("Enter positive integer as denominator: ");
        int denominator = scanner.nextInt();
        int gcd = gcd(numerator, denominator);
        System.out.println("Greatest common denominator of " + numerator + "/" + denominator + " is " + gcd);
        
        scanner.close();
    }
}

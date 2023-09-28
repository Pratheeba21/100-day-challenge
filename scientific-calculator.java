import java.util.Scanner;
public class scientificcalculator 
{
    public static void main(String[] args) 
   {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Scientific Calculator!");
        while (true) {
            System.out.println("\nSelect operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square Root");
            System.out.println("6. Exponentiation");
            System.out.println("7. Quit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    double addend1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double addend2 = scanner.nextDouble();
                    System.out.println("Result: " + (addend1 + addend2));
                    break;
                case 2:
                    System.out.print("Enter minuend: ");
                    double minuend = scanner.nextDouble();
                    System.out.print("Enter subtrahend: ");
                    double subtrahend = scanner.nextDouble();
                    System.out.println("Result: " + (minuend - subtrahend));
                    break;
                case 3:
                    System.out.print("Enter first factor: ");
                    double factor1 = scanner.nextDouble();
                    System.out.print("Enter second factor: ");
                    double factor2 = scanner.nextDouble();
                    System.out.println("Result: " + (factor1 * factor2));
                    break;
                case 4:
                    System.out.print("Enter dividend: ");
                    double dividend = scanner.nextDouble();
                    System.out.print("Enter divisor: ");
                    double divisor = scanner.nextDouble();
                    System.out.println("Result: " + (dividend / divisor));
                    break;
                case 5:
                    System.out.print("Enter number to find square root: ");
                    double number = scanner.nextDouble();
                    System.out.println("Result: " + Math.sqrt(number));
                    break;
                case 6:
                    System.out.print("Enter base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter exponent: ");
                    double exponent = scanner.nextDouble();
                    System.out.println("Result: " + Math.pow(base, exponent));
                    break;
                case 7:
                    System.out.println("Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

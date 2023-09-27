import java.util.Scanner;
public class permutations-combinations
{
    public static int factorial(int n)
    {
        if (n == 0 || n == 1) 
       {
            return 1;
        }
       else 
       {
            return n * factorial(n - 1);
        }
    }
    public static int combinations(int n, int r) 
   {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }
    public static int permutations(int n, int r) 
   {
        return factorial(n) / factorial(n - r);
    }
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n (total number of items): ");
        int n = scanner.nextInt();
        System.out.print("Enter r (number of items to choose): ");
        int r = scanner.nextInt();
        if (n < 0 || r < 0 || r > n) 
       {
            System.out.println("Invalid input. Please make sure n >= 0 and 0 <= r <= n.");
        } 
        else 
        {
            int nPr = permutations(n, r);
            int nCr = combinations(n, r);
            System.out.println("Permutations (nPr): " + nPr);
            System.out.println("Combinations (nCr): " + nCr);
        }
    }
}

import java.util.Scanner;
public class mean
{
     public static void main(String[] args)
    {
      int n, i, sum=0;
      float armean;
      Scanner scan = new Scanner(System.in);
      System.out.print("How many numbers to enter ? ");
      n = scan.nextInt();
      int[] arr = new int[n];
      System.out.print("Enter " +n+ " Numbers: ");
      for(i=0; i<n; i++)
      {
         arr[i] = scan.nextInt();
         sum = sum + arr[i];
      }
      armean = sum/n;
      System.out.println("\nArithmetic Mean = " +armean);
   }
}
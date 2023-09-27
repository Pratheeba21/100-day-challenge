import java.util.Scanner;
public class SpeedDistanceTimeCalculator 
{
    public static void main(String[] args) 
   {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose what you want to calculate:");
        System.out.println("1. Speed");
        System.out.println("2. Distance");
        System.out.println("3. Time");
        int choice = scanner.nextInt();
        switch (choice) 
        {
            case 1:
                calculateSpeed();
                break;
            case 2:
                calculateDistance();
                break;
            case 3:
                calculateTime();
                break;
            default:
                System.out.println("Invalid choice. Please choose 1, 2, or 3.");
                break;
        }
    }
    public static void calculateSpeed() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter distance (in kilometers): ");
        double distance = scanner.nextDouble();
        System.out.print("Enter time (in hours): ");
        double time = scanner.nextDouble();
        double speed = distance / time;
        System.out.println("Speed: " + speed + " km/h");
    }
    public static void calculateDistance()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter speed (in km/h): ");
        double speed = scanner.nextDouble();
        System.out.print("Enter time (in hours): ");
        double time = scanner.nextDouble();
        double distance = speed * time;
        System.out.println("Distance: " + distance + " kilometers");
    }
    public static void calculateTime() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter distance (in kilometers): ");
        double distance = scanner.nextDouble();
        System.out.print("Enter speed (in km/h): ");
        double speed = scanner.nextDouble();
        double time = distance / speed;
        System.out.println("Time: " + time + " hours");
    }
}

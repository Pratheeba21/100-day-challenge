import java.text.SimpleDateFormat;
import java.util.Date;
public class dateandtime 
{
    public static void main(String[] args) 
    {
        // Get the current date and time
        Date currentDate = new Date();

        // Define a format for the date and time
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        // Format the date and time using the defined format
        String formattedDateTime = dateFormat.format(currentDate);

        // Print the formatted date and time
        System.out.println("Current Date and Time: " + formattedDateTime);
    }
}

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class duplicate
{
    public static void main(String[] args) 
   {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(3);
        numbers.add(5);
        System.out.println("Original List: " + numbers);
        Set<Integer> uniqueNumbers = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        for (Integer number : numbers) 
        {
            if (uniqueNumbers.add(number)) 
            {
                result.add(number);
            }
        }
        System.out.println("List with duplicates removed: " + result);
    }
}

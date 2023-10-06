import java.util.Arrays;
import java.util.LinkedList; 
public class linked 
{ 
	public static <T> Object[] convertLinkedListToArray(LinkedList<T> linkedList) 
	{ 
		Object[] array = linkedList.toArray(); 

		return array; 
	} 

	public static void main(String args[]) 
	{ 
		LinkedList<String> 
			linkedList = new LinkedList<String>(); 
		linkedList.add("g"); 
		linkedList.add("r"); 
		linkedList.add("e"); 
		linkedList.add("e"); 
		linkedList.add("n"); 
		System.out.println("Linked list: "
						+ linkedList); 
		Object[] objArray = convertLinkedListToArray(linkedList); 
		String[] array = Arrays.copyOf(objArray, 
									objArray.length, 
									String[].class); 
		System.out.println("Array: "
						+ Arrays.toString(array)); 
	} 
} 


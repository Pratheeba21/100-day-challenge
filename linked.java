// Java program to convert 
// LinkedList to Array 

import java.util.Arrays;
import java.util.LinkedList; 

public class linked { 

	// Function to convert LinkedList to Array 
	public static <T> Object[] convertLinkedListToArray(LinkedList<T> linkedList) 
	{ 

		// Converting LinkedList to Array 
		Object[] array = linkedList.toArray(); 

		return array; 
	} 

	public static void main(String args[]) 
	{ 
		// Creating linked list 
		LinkedList<String> 
			linkedList = new LinkedList<String>(); 

		// Adding elements to the linked list 
		linkedList.add("g"); 
		linkedList.add("r"); 
		linkedList.add("e"); 
		linkedList.add("e"); 
		linkedList.add("n"); 

		// Print the LinkedList 
		System.out.println("Linked list: "
						+ linkedList); 

		// Converting LinkedList to Object Array 
		Object[] objArray = convertLinkedListToArray(linkedList); 

		// Convert Object[] to String[] 
		String[] array = Arrays.copyOf(objArray, 
									objArray.length, 
									String[].class); 
		// Print the String Array 
		System.out.println("Array: "
						+ Arrays.toString(array)); 
	} 
} 


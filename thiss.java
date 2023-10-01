// Java Program to implement
// Java this reference

// Driver Class
public class thiss {

	// Fields Declared
	String name;
	int age;

	// Constructor
	thiss(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	// Getter for name
	public String get_name() { return name; }

	// Setter for name
	public void change_name(String name)
	{
		this.name = name;
	}

	// Method to Print the Details of
	// the person
	public void printDetails()
	{
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println();
	}

	// main function
	public static void main(String[] args)
	{
		// Objects Declared
		thiss first = new thiss("ABC", 18);
		thiss second = new thiss("XYZ", 22);

		first.printDetails();
		second.printDetails();

		first.change_name("PQR");
		System.out.println("Name has been changed to: "
						+ first.get_name());
	}
}

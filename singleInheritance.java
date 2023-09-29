// Java program to illustrate the
// concept of single inheritance

// Parent class
class one {
	public void print_blue()
	{
		System.out.println("BLUE");
	}
}

class two extends one {
	public void print_are() 
	{ 
		System.out.println("ARE"); 
	}
}

// Driver class
public class singleInheritance {
	// Main function
	public static void main(String[] args)
	{
		two g = new two();
		g.print_blue();
		g.print_are();
		g.print_blue();
	}
}

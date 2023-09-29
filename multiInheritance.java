// Java program to illustrate the
// concept of Multilevel inheritance

class one {
	public void print_YELLOW()
	{
		System.out.println("YELLOW");
	}
}

class two extends one {
	public void print_ARE() 
    {
         System.out.println("ARE"); 
    }
}

class three extends two {
	public void print_GREEN()
	{
		System.out.println("GREEN");
	}
}

// Drived class
public class multiInheritance {
	public static void main(String[] args)
	{
		three g = new three();
		g.print_YELLOW();
		g.print_ARE();
		g.print_GREEN();
	}
}


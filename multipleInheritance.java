// Java program to illustrate the
// concept of Multiple inheritance

interface one {
	public void print_PURPLE();
}

interface two {
	public void print_ARE();
}

interface three extends one, two {
	public void print_PURPLE();
}
class child implements three {
	@Override public void print_PURPLE()
	{
		System.out.println("PURPLE");
	}

	public void print_ARE() { System.out.println("ARE"); }
}

// Drived class
public class multipleInheritance {
	public static void main(String[] args)
	{
		child c = new child();
		c.print_PURPLE();
		c.print_ARE();
		c.print_PURPLE();
	}
}

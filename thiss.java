public class thiss 
{
	String name;
	int age;
	thiss(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	public String get_name()
	{ 
		return name; 
	}
	public void change_name(String name)
	{
		this.name = name;
	}
	public void printDetails()
	{
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println();
	}
	public static void main(String[] args)
	{
		thiss first = new thiss("ABC", 18);
		thiss second = new thiss("XYZ", 22);

		first.printDetails();
		second.printDetails();

		first.change_name("PQR");
		System.out.println("Name has been changed to: "
						+ first.get_name());
	}
}

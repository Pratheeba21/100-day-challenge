class methodOverride 
{
	void Print()
	{
		System.out.println("parent class");
	}
}
class subclass1 extends methodOverride
{
	void Print() { System.out.println("subclass1"); }
}
class subclass2 extends methodOverride 
{
	void Print()
	{
		System.out.println("subclass2");
	}
}
class main 
{ 
	public static void main(String[] args)
	{
		methodOverride a;
		a = new subclass1();
		a.Print();

		a = new subclass2();
		a.Print();
	}
}


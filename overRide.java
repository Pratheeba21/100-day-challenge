import java.io.*;
class multiplication
{
	int a=8,b=5;
	int mul;
	void  mul() 
	{
		mul=a*b;
	}
	void display()
	{
		System.out.println("Multiplication of two integers="+mul);
	}
}
class addition extends multiplication
{
	int add;
	void add()
	{
		add=a+b;
	}
	void display()
	{
		System.out.println("Addition of two integers="+add);
	}
}
class overide
{
	public static void main(String s[]) throws Exception
	{
		multiplication m;
		addition d=new addition();
		multiplication n=new multiplication();
		m=n;
		m.mul();
		m.display();
		d.add();
		d.display();
	}
}

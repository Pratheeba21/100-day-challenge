import java.io.*;
class stack
{
	int a[]=new int[5];
	int top;
	stack()
	{
		int top=-1;
	}
	void push() throws Exception
	{
		if(top==5)
		{
			System.out.println("full");
		}
		else
		{
			DataInputStream d=new DataInputStream(System.in);
			System.out.println("Enter the element to be inserted:");
			int i=Integer.parseInt(d.readLine());
			top++;
			a[i]=top;
				System.out.println("You value is pushed in stack");
		}
	}
	void pop()
	{
		if(top==1)
		{
			System.out.println("Empty");
		}
		else
		{
			System.out.println("Your value is poped in stack"+a[top]);
			top++;
		}
	}
	void display()
	{
		if(top==-1)
		{
			System.out.println("Empty");
		}
		else
		{
			System.out.println("The elements are"+a[top]);
		}
	}
}
class m
{
	public static void main(String a[]) throws Exception
	{
		int cs;
		stack ob=new stack();
		DataInputStream d=new DataInputStream(System.in);
		do
		{
			System.out.println("11.PUSH\n21.POP\n31.DISPLAY\nENTER YOUR CHOICE");
			int ch=Integer.parseInt(d.readLine());
			if(ch==11)
			{
				ob.push();
			}
			else if(ch==21)
			{
				ob.pop();
			}
			else if(ch==31)
			{
				ob.display();
			}
			else
			{
				System.out.println("Choice is not valid");
			}
		  System.out.println("If you want to continue press 1");
		  cs=Integer.parseInt(d.readLine());
		}while(cs==1);
	}
}
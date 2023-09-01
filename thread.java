import java.util.*;
class math extends Thread
{
	int n;
	public synchronized void input()
	{
	   while(true)
	   {
		Random r=new Random();
		r.nextInt();
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	   }
	}
	public synchronized void even()
	{
		if(n%2==0)
		{
			System.out.println("Square of n"+n*n);
		}
		else
		{
			System.out.println("The given number is not an even");
		}
	}
	public synchronized void odd()
	{
		if(n%2!=0)
		{
			System.out.println("Cube of n"+n*n*n);
		}
		else
		{
			System.out.println("The given number is not an odd");
		}
	}
}
class result
{
	public static void main(String s[]) 
	{
		new Thread()
		{
		public void run()
		{
			while(true)
			{
			math p=new math();
			p.input();
			p.even();
			p.odd();
			}
		}
		}.start();
	}
}

import java.io.*;
import java.lang.*;
class prime
{
	int n,flag=0;
	void check() throws Exception
	{
		DataInputStream d=new DataInputStream(System.in);
		System.out.print("Enter the number:");
		n=Integer.parseInt(d.readLine());
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag=1;
				System.out.println(n+""+"is not a prime number");
			}
		}
		if(flag==0)
		{
			System.out.println(n+""+"is a prime number");
		}
	}
}
class m
{
	public static void main(String c[]) throws Exception
	{
		prime p=new prime();
		p.check();
	}
}

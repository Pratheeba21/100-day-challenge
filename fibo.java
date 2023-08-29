import java.io.*;
import java.lang.*;
class fibo
{
	int n1=0,n2=1,n3,limit;
	void read() throws Exception
	{
		DataInputStream d=new DataInputStream(System.in);
		System.out.print("Enter the limit:");
		limit=Integer.parseInt(d.readLine());
	}
	void cal()
	{
		System.out.print(n1+" "+n2);
		for(int i=2;i<limit;i++)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}
}
class main
{
	public static void main(String c[]) throws Exception
	{
		fibo f=new fibo();
		f.read();
		f.cal();
	}
} 

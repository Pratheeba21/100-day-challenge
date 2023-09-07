import java.io.*;
class insertionSort
{
	int n,b;
	int a[]=new int[5];
	void input() throws Exception
	{
		DataInputStream d=new DataInputStream(System.in);
		System.out.print("Enter the number of elements:");
		n=Integer.parseInt(d.readLine());
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(d.readLine());
		}
		System.out.print("Enter the number to be searched:");
		b=Integer.parseInt(d.readLine());
	}
	void sort()
	{
		int i,j;
		for(i=1;i<n;i++)
		{
			b=a[i];
			for(j=i-1;j>=0&&a[j]>b;j--)
			{
				a[j+1]=a[j];
			}
			a[j+1]=b;
		}
	}
	void display()
	{
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
}
class result
{
	public static void main(String a[]) throws Exception
	{
		insertion p=new insertion();
		p.input();
		p.sort();
		p.display();
	}
}

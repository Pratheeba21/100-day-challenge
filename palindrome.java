import java.io.*;
import java.lang.*;
class palindrome
{  
	public static void main(String args[])  throws Exception
	{  
		DataInputStream d=new DataInputStream(System.in);
		int r,sum=0,temp;   
		System.out.print("Enter a number:"); 
		int n=Integer.parseInt(d.readLine());
		temp=n;    
		while(n>0)
		{    
			int i=1;
			r=n%10;  
			sum=(sum*10)+r;   
			n=n/10;    
		}    
		if(temp==sum)    
			System.out.println("palindrome number ");    
		else    
			System.out.println("not palindrome");    
	}  
}  

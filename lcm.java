// Java program to find LCM of two numbers.
class gfg 
{
	static int GCD(int a, int b)
	{
		if (a == 0)
			return b;
		return GCD(b % a, a);
	}
	static int LCM(int a, int b)
	{
		return (u / GCD(a, b)) * b;
	}
	public static void main(String[] args)
	{
		int a =30, b = 45;
		System.out.println("LCM of " + a + " and " + b + " is " + LCM(a, b));
	}
}

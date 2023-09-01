class Employee
{
	String emp_name,address,mail_id;
	int emp_id;
	long mob_no;
	void details() throws Exception
	{
		DataInputStream d=new DataInputStream(System.in);
		System.out.print("Enter the name:");
		emp_name=(d.readLine());
		System.out.print("Enter the address:");
		address=(d.readLine());
		System.out.print("Enter the mail address:");
		mail_id=(d.readLine());
		System.out.print("Enter the employee id:");
		emp_id=Integer.parseInt(d.readLine());
		System.out.print("Enter the mobile number:");
		mob_id=Long.parseLong(d.readLine());
	}
	void display()
	{
		System.out.println(emp_name);
		System.out.println(address);
		System.out.println(mail_id);
		System.out.println(emp_id);
		System.out.println(mobile_no);
		System.out.println("End of Employee class");
	}
}
class Programmer extends Employee
{
	int BP;
	float DA,HRA,PF,SCF,net_salary,gross_salary
	void input() throws Exception
	{
		details();
		DataInputStream d=new DataInputStream(System.in);
		System.out.print("Enter the Basic Pay:");
		BP=Integer.parseInt(d.readLine());
	}
	void calculation()
	{
		DA=0.97f*BP;
		HRA=0.10f*BP;
		PF=0.12f*BP;
		SCF=0.001f*BP;
		gross_salary=BP+DA;
		net_salary=gross_salary-PF_SCF;
	}
	void output()
	{
		System.out.println("DA:"+DA);
		System.out.println("HRA:"+HRA);
		System.out.println("PF:"+PF);
		System.out.println("SCF:"+SCF);
		System.out.println("GROSS SALARY:"+gross_salary);
		System.out.println("NET SALARY:"+net_salary);
		System.out.println("End of Programmer class");
	}
}
class Assistant_professor extends Employee
{
	int BP;
	float DA,HRA,PF,SCF,net_salary,gross_salary
	void inp() throws Exception
	{
		details();
		DataInputStream d=new DataInputStream(System.in);
		System.out.print("Enter the Basic Pay:");
		BP=Integer.parseInt(d.readLine());
	}
	void cal()
	{
		DA=0.97f*BP;
		HRA=0.10f*BP;
		PF=0.12f*BP;
		SCF=0.001f*BP;
		gross_salary=BP+DA;
		net_salary=gross_salary-PF_SCF;
	}
	void disp()
	{
		System.out.println("DA:"+DA);
		System.out.println("HRA:"+HRA);
		System.out.println("PF:"+PF);
		System.out.println("SCF:"+SCF);
		System.out.println("GROSS SALARY:"+gross_salary);
		System.out.println("NET SALARY:"+net_salary);
		System.out.println("End of Assistant professor class");
	}
}
class Associate_professor extends Employee
{
	int BP;
	float DA,HRA,PF,SCF,net_salary,gross_salary
	void get() throws Exception
	{
		details();
		DataInputStream d=new DataInputStream(System.in);
		System.out.print("Enter the Basic Pay:");
		BP=Integer.parseInt(d.readLine());
	}
	void logic()
	{
		DA=0.97f*BP;
		HRA=0.10f*BP;
		PF=0.12f*BP;
		SCF=0.001f*BP;
		gross_salary=BP+DA;
		net_salary=gross_salary-PF_SCF;
	}
	void show()
	{
		System.out.println("DA:"+DA);
		System.out.println("HRA:"+HRA);
		System.out.println("PF:"+PF);
		System.out.println("SCF:"+SCF);
		System.out.println("GROSS SALARY:"+gross_salary);
		System.out.println("NET SALARY:"+net_salary);
		System.out.println("End of Associate professor class");
	}
	
}
class Professor extends Employee
{
	int BP;
	float DA,HRA,PF,SCF,net_salary,gross_salary
	void read() throws Exception
	{
		details();
		DataInputStream d=new DataInputStream(System.in);
		System.out.print("Enter the Basic Pay:");
		BP=Integer.parseInt(d.readLine());
	}
	void find()
	{
		DA=0.97f*BP;
		HRA=0.10f*BP;
		PF=0.12f*BP;
		SCF=0.001f*BP;
		gross_salary=BP+DA;
		net_salary=gross_salary-PF_SCF;
	}
	void print()
	{
		System.out.println("DA:"+DA);
		System.out.println("HRA:"+HRA);
		System.out.println("PF:"+PF);
		System.out.println("SCF:"+SCF);
		System.out.println("GROSS SALARY:"+gross_salary);
		System.out.println("NET SALARY:"+net_salary);
		System.out.println("End of Professor class");
	}
}
class result
{
	public static void main(String a[]) throws Exception
	{
		Employee p=new Employee();
		p.details();
		p.display();
		Programmer q=new Programmer();
		q.input();
		q.calculation();
		q.output();
		Assistant_professor r=new Assistant_professor();
		r.inp();
		r.cal();
		r.disp();
		Associate_professor s=new Associate_professor();
		s.get();
		s.logic();
		s.show();
		Professor t=new Professor();
		t.read();
		t.find();
		t.print();
	}
}

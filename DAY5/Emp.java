/*Q.create an emp class consists of empid, ename, Sal
	1)Create No-Argument Constructor
	2)Create 1 parameterized constructor to initialized empid
	3)Create 2 Formal Argument constructor to initialized empid, ename 
	4)Create 3 Formal Argument constructor to initialized empid, ename, sal
	5)Create object for each constructor 
	6)Print Details of every emp.
Sample output:- id: 0
				name: Null
				sal: 0.0
				===========
				id: 0
				name: Null
				sal: 0.0
				===========
				id: 20
				name: Sheela
				sal: 0.0
				===========
				id: 30
				name: Shakila
				sal: 29999.9
				===========
*/
class Emp 
{
	int empid;
	String ename;
	double sal;
	//No-Argument Constructor
	Emp()
	{
		
	}
	//1-Parameterized Constructor
	Emp(int empid)
	{
		this.empid =empid;
	}
	//2-Parameterized Constructor
	Emp(int empid, String ename)
	{
		this.empid =empid;
		this.ename= ename;
	}
	//3-parameterized Constructor
	Emp(int empid, String ename, double sal)
	{
		this.empid =empid;
		this.ename= ename;
		this.sal= sal;
	}
	public static void main(String[] args) 
	{
		Emp ref1= new Emp();
		Emp ref2= new Emp(1);
		Emp ref3= new Emp(20,"Ram");
		Emp ref4= new Emp(30,"Geeta",29999.9);
		
		System.out.println("Id: " +ref1.empid);
		System.out.println("Name: " +ref1.ename);
		System.out.println("Sal: " +ref1.sal);
		System.out.println("=======================");
		System.out.println("Id: " +ref2.empid);
		System.out.println("Name: " +ref2.ename);
		System.out.println("Sal: " +ref2.sal);
		System.out.println("=======================");
		System.out.println("Id: " +ref3.empid);
		System.out.println("Name: " +ref3.ename);
		System.out.println("Sal: " +ref3.sal);
		System.out.println("=======================");
		System.out.println("Id: " +ref4.empid);
		System.out.println("Name: " +ref4.ename);
		System.out.println("Sal: " +ref4.sal);
	}
}

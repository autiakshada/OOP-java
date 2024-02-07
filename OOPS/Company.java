//Driver Class
import java.util.Scanner;
class Company
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the emp id: ");
		int empid=sc.nextInt();

		System.out.println("Enter the emp name: ");
		String ename=sc.next();

		System.out.println("Enter the emp sal");
		double sal=sc.nextDouble();
		
		Emp ref= new Emp(empid, ename, sal);
		
		
		System.out.println("Id: " +ref.empId);
		System.out.println("Name: " +ref.ename);
		System.out.println("Sal: " +ref.getSal());
		System.out.println("===================");
		
		
	}
}
class Emp 
{
	int empId;
	String ename;
    private double sal;
	// get the permission to access private data we use getter method
	public double getSal()
	{
		return sal;
	}
	//setter method to set/modify the data
	public void setSal()
	{
		this.sal=sal;
	}

	Emp(int empId, String ename, double sal)
	{
		this.empId =empId;
		this.ename= ename;
		this.sal= sal;
	}
}


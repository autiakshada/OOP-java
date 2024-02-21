/*Write a java program to implement hashcode method for emp class.
1]Create driver class in which create at least 2 emp object. 
2]Generate unique hashcode for both the object based on emp id.
3]Print emp details such as emp id,name and salary by initializing through constructor. 
4]Print hashcode for both object and also predict address of both object .
*/
class emp
{
	int empId;
	String ename;
	double sal;
	//constructor 
	emp(int empId,String ename,double sal)
	{
		this.empId=empId;
		this.ename=ename;
		this.sal=sal;
	}
	@Override 
		public int hashCode()
	{
		return empId;
	}

}
//Driver class
class Driver1 
{
	public static void main(String[] args) 
	{
		emp ref1=new emp(1001,"Jack",600000.32);
		emp ref2=new emp(2001,"King",120000.0);

		System.out.println("first Employee Details: ");
		System.out.println("Id : "+ref1.empId);
		System.out.println("Name : "+ref1.ename);
		System.out.println("Salary: "+ref1.sal);
		System.out.println("Address: "+ref1);
		System.out.println("Hash Code: " + ref1.hashCode());
		System.out.println("========================");
		System.out.println("Second Employee Details: ");
		System.out.println("Id : "+ref2.empId);
		System.out.println("Name : "+ref2.ename);
		System.out.println("Salary: "+ref2.sal);
		System.out.println("Address: "+ref2);
		System.out.println("Hash Code: " + ref2.hashCode());

	}
}

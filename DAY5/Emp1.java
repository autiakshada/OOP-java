class Emp1 
{
	int id;
	String name;
	double sal;
	//1
	Emp1()
	{
		System.out.println("No-Argument Constructor");
	}
	//2
	Emp1(int id)
	{
		this();//this Calling statment
		this.id=id;//this ref var
		System.out.println("1-Formal Argument constructor");
	}
	Emp1(int id,String name)
	{
		this(id);
		this.name=name;
		System.out.println("2-Formal Argumnet Constructor");
	}
	Emp1(int id, String name, double sal)
	{
		this(id,name);
		this.sal=sal;
		System.out.println("3-Formal Argumnet Constructor");
	}
	public static void main(String [] args)
	{
		Emp1 ref= new Emp1(001,"sam",2900000);
		System.out.println("Id: "+ref.id);
		System.out.println("name: "+ref.name);
		System.out.println("sal: "+ref.sal);
		//System.out.println(
	}
}
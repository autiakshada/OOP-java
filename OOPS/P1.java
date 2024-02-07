/*Constructor chaining using Super();*/
//SUPER class
class SubClass
{
	int i;//non static var(Global var)
	SubClass(int i)
	{
		this.i=i;
	}
	{
		System.out.println("SIB SUPER CLASS" );
	}
}
//Super class
class SuperClass extends SubClass
{
	SuperClass(int i)
	{
		super(i);
	}
	{
		System.out.println("IIB SUB CLASS");
	}
}
//Driver Class
class P1 
{
	public static void main(String[] args) 
	{	
		SuperClass ref= new SuperClass(75);
		System.out.println("i :  "+ref.i);
	}
}

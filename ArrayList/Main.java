class Main 
{
	public static void main(String[] args) 
	{

		Java ref=new Manual();
		ref.nageshSir();
		ref.puneethSir();
		System.out.println("=====================");
		Manual ref1=new Manual();
		ref1.nageshSir();
		ref1.puneethSir();
		System.out.println("=====================");
		Java ref2=new Java();
		ref2.nageshSir();
		ref2.puneethSir();

	}
}
class Java
{
	public static void nageshSir()
	{
		System.out.println("Macchi first attend java then manual!!");
	}
	public static void puneethSir()
	{
		System.out.println("Guys!! first attend manual then java");
	}
}
class Manual extends Java
{
	public static void nageshSir()
	{
		System.out.println("ALL Right!!!!");
	}
	public static void puneethSir()
	{
		System.out.println("Where are other's?????");
	}
}

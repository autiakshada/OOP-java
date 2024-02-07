class P6
{
	static int a=10;
	static long b=20;
	String c="sheela";
	boolean d= true;
	//Static block
	static
	{
		int a=10;
		int b=20;
		P6 ref= new P6();
		System.out.println("a: "+a);
		System.out.println("a: "+P6.a);
		System.out.println("b: "+b);
		System.out.println("b: "+P6.b);
		System.out.println("c: "+ref.c);
		System.out.println("d: "+ref.d);
	}
	public void test()
	{
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("c: "+c);
		System.out.println("d: "+d);
	}
	public static void main(String[] args) 
	{
		P6 ref= new P6();
		ref.test();
	}
}

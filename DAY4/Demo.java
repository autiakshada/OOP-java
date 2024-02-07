class Demo 
{
	//Non-static var
	int a=23;					
	int b=12;

	//static var
	static double x=2.4;		
	static char y='a';	
	
	//(SIB)Static Initialization Block
	static				        
		{
			String name="Akshada";
			String surname="Auti";
			Demo ref=new Demo();
			System.out.println(ref.a);    //reference name 
			System.out.println(ref.b);
			System.out.println(x);		// Direct
			System.out.println(y);
			System.out.println(name);		//local var direct
			System.out.println(surname);

		}
	public void demo1()
	{
		String name="Ashwini";
		String surname="Rane";
		Demo ref=new Demo();
		System.out.println(ref1.a);
		System.out.println(ref1.b);
		System.out.println(Demo.x);
		System.out.println(Demo.y);
		System.out.println(name);
		System.out.println(surname);
	}
		
	
	public static void main(String[] args) 
	{
		System.out.println("main method begins");
		Demo ref= new Demo();
		ref.demo1();		
		System.out.println("main method ends");
	}
}

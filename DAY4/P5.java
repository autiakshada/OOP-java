class P5
{
	//Constructor
	P5()
	{
		System.out.println("I am constructor");
	}
	public static void main(String[] args) 
	{
		P5 ref= new P5();
	}
	//Non-static block
	{
		System.out.println("IIB");
	}
}


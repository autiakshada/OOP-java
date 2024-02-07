class Demo1 
{
	//Static block
	static
	{
		System.out.println("Hello!! Akshada...");
		ref.Demo();
	}
	//Non-static block
	{
		System.out.println("Good Afternoon");
		ref.Demo();
	}
	//non-static method 
	public void Demo1()
	{
		System.out.println("Welcome to my program...");
		ref.Demo();

	}

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Demo ref= new Demo();
		ref.Demo();
	}
}

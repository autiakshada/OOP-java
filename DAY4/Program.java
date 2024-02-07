//Q.Create Static block and Non-Static block call Non-Static method from both SIB & IIB
class Program
{
	//static Block

	static
	{
		System.out.println("Hello!!!,EveryOne");
		Program ref= new Program();
		ref.Test();
	}

	//Non-static Block
	{
		System.out.println("Good Afternoon...");
		Test();
	}

	//Non-Static Method
	public void Test()
	{
		System.out.println("Welcome to java program");
	}

	//Main Method
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Program ref=new Program();
		ref.Test();
	}
}

import java.util.*;
class D6
{
	public static void main(String[] args) 
	{
		System.out.println("Main method begins");
		try{

			methodRecursion(3);
		}
		catch(Throwable ref)
		{
		
			System.out.println("StackOverFlowError occured: ");
		}
		finally
		{
			System.out.println("Exception handled Successfully");
		}

		System.out.println("Main method ends");
	}
	public static void methodRecursion(int i)
	{
		if(i>0)
		{
			methodRecursion(i+1);
		}
		
	}

}

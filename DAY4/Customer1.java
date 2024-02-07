import java.util.Scanner

class Customer1
{
}
{
	int Cid;
	int CAge;
	String CName;
	Customer(int Cid,int CAge,String CName)
	{
		this.Cid= Cid;
		this.CAge= CAge;
		this.CName= CName;
	}
	public static void main(String[] args) 
	{
		Scanner ref  = new Scanner (System.in);

	  System.out.println("enter customer id:");
	  ref.nextInt();
	
	  	  System.out.println("enter customer age:" );
		  ref.nextInt();
	  
		  	  System.out.println("enter customer name:");
			  ref.nextInt();
			Customer1 ref = new Customer(ref.nextInt(),ref.nextInt(),ref.next());
	 

			  System.out.println("========================");

			  	  System.out.println("enter customer id:"+ref.Cid);
				  int Cid =ref2.nextInt();
	  	  System.out.println("enter customer age:"+ref.CAge);
				  int CAge =ref2.nextInt();
		  	  System.out.println("enter customer name:"+ref.CName);
				  String CName =ref2.next();

			  System.out.println("========================");


	}
}

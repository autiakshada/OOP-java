//parent class
class SBIBank 
{
	String accountHolderName;
	long accountNumber;
	private double accountBalance;
	
	public void setaccountBalance(double accountBalance)
	{
		this.accountBalance=accountBalance;
	}
	//method
	public void AccountDetails()
	{
		System.out.println("AccountHolderName:"+accountHolderName);
		System.out.println("AccountNumber: "+accountNumber);
		System.out.println("AccountBalance: "+accountBalance);
	}
}
	
//child class 
class SavingAccount extends SBIBank 
{
	SavingAccount(String accountHolderName, long accountNumber, double accountBalance) 
	    {
			 this.accountHolderName= accountHolderName;
			 this.accountNumber = accountNumber;
			 setaccountBalance(accountBalance);
        }
}
//driver class
class Customer
{
	public static void main(String[] args) 
	{
		SavingAccount ref1=new SavingAccount("Smith s.",1234567898,100000.56);
		System.out.println("Customer Details");
		System.out.println("================");
		ref1.AccountDetails();
	}
}

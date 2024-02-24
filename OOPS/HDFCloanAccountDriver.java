/*write a java program for HDFC loanAccount consists of accountNo, loanAmount,tenure
1]Create at least 3 loanAccount
2]Initilaize loan details using constructor 
3]Implements hashCode,toString and equals method
4]Loan account inheriting bank class
*/
class Bank
{

}
class HDFCloanAccount extends Bank
{
	long accountNo;
	double loanAmount;
	int tenure;
	HDFCloanAccount(long accountNo,double loanAmount,int tenure)
	{
		this.accountNo=accountNo;
		this.loanAmount=loanAmount;
		this.tenure=tenure;
	}
	@Override
		public String toString()
	{
		System.out.println("Loan Account Number: "+accountNo);
		System.out.println("Loan Amount: "+loanAmount);
		System.out.println("Tenure: "+tenure);
		return "";
	}
	@Override
		public int hashCode()
	{
		return (int)accountNo;
	}
	@Override
		public boolean equals(Object obj)	//Upcasting 
	{
		HDFCloanAccount ref=(HDFCloanAccount)obj; //downcasting 
		return this.accountNo==ref.accountNo &&
			   this.loanAmount==ref.loanAmount;
	}

}
class HDFCloanAccountDriver
{
	public static void main (String[] args)
	{
		HDFCloanAccount c1=new HDFCloanAccount(87642304123L,876543,80);
		System.out.println(c1);
		System.out.println(c1.hashCode());
		HDFCloanAccount c2=new HDFCloanAccount(97895434355L,876543,40);
		System.out.println(c2);
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
	}
}
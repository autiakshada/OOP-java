class ATM 
{
	double money=1000000;//states
	public void withdraw()//behaviour
	{
		System.out.println("Withdraw money");
	}

}
//Driver class
class BOB
{
	public static void main(String[] args) 
	{
		ATM ref= new ATM();
		System.out.println("MONEY: "+ref.money);
		ref.withdraw();
	}
}

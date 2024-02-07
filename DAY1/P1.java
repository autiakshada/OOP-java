class P1 
{
	public static void num(char a)
	{
		if (a<='z')
		{
			System.out.println(a);
			a++;
			num(++a);
		}
	}
	public static void main(String[] args) 
	{
		num('b');
	}
}

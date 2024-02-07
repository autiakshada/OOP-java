class Calculator
{
	public static void Add(int a, int b, int c, int d)
	{
		int sum=a+b+c+d;
		System.out.println(sum);
	}
    public static void Substract(int a, int b, int c, int d, int e)
	{
		int result=a-b-c-d-e;
		System.out.println(result);
	}
	public static void Multiply(int a, int b, int c, int d, int e, int f)
	{
		int result=a*b*c*d*e*f;
		System.out.println(result);
	}
	public static void Division(int a, int b)
	{
		int result=a/b;
		System.out.println(result);
	}
	public static void main(String[] args) 
	{
		System.out.println("CALCULATOR");
		Add(2,4,4,5);
		Substract(1,3,6,7,23);
		Multiply(2,5,4,3,7,8);
		Division(10,2);
	}
}

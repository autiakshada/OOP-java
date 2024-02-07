//write a java program to print even numbers from 1 to 100 without using loop

class P4 
{
	public static void EvenNum(int a)
	{
		if(a<=100){
			if(a % 2==0){
				System.out.println(a);
			}
			EvenNum(++a);
		}
	}
	public static void main(String[] args) 
	{
		EvenNum(1);
	}
}

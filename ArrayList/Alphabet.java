import java.util.ArrayList;
class Alphabets 
{
	public static void main(String[] args) 
	{
		ArrayList a =new ArrayList();
		for(char ch='A'; ch<='Z'; ch++)
		{
			a.add(ch);
		}
		for (Object obj: a )
		{
			System.out.println(obj);
		}
		a.remove(0);
		int index=a.size()-1;
		a.remove(index);
		boolean isEvenSize=a.size()%2==0;
		if(isEvenSize)
		{
			int mid=a.size()/2-1;
			a.remove(mid);
		}
		else 
		{
			int mid=a.size();
			a.remove(mid);
		}
		System.out.println("ArrayList after modify: ====");
		for (Object obj: a)
		{
			System.out.println(obj);
		}
	}
}

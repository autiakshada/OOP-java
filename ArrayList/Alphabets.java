
/*Write a java program to add uppercase charachters from A to Z into ArrayList.
1]Print all the charachters one by one.
2]Rmove first charachter and last charachter and Middle charachter.
3]Print all the charachters after removing reverse direction.
*/
import java.util.ArrayList;
class Alphabets
{
	public static void main(String[] args) 
	{
		ArrayList a=new ArrayList();
		for(char ch='A'; ch<='Z'; ch++)
		{
			a.add(ch);
		}
		System.out.println("Print all charachters one by one");
		for (Object Obj : a) 
		{
            System.out.print(Obj + " ");
        }
		System.out.println();
		System.out.println("Remove first charachter");
		a.remove(0);
		System.out.println(a);
		System.out.println("Remove last charachter");
		a.remove(a.size()-1);
		System.out.println(a);
		System.out.println("Remove middle charachter");
		a.remove(a.size()/2);
		System.out.println(a);
		System.out.println("Charachters in reverse order");
		for (int i = a.size() - 1; i >= 0; i--) 
		{
            System.out.print(a.get(i) + " ");
        }

	}
}

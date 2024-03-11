/*Write a java program to add 8 String objects into LinkedHashSet and promt user to pass input then print each Objects one by one in both 
forward and backward direction using List Iterator method.

Enter 8 String Objects:
sheela
10.5
c
null
bye
hi
25
true
Objects in forward direction:
sheela
10.5
c
null
bye
hi
25
true
Objects in backward direction:
true
25
hi
bye
null
c
10.5
sheela
*/
import java.util.*;
class ForwardBackward 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);

		//Create a object for LinkedHashSet
		LinkedHashSet<String> linkedHashSet =new LinkedHashSet<String>();
		System.out.println("Enter 8 String objects: ");

		for(int i=1; i<=8; i++)
		{
			String s=sc.nextLine();
			//System.out.println(s);
			linkedHashSet.add(s);
		}

		//Convert the LinkedHashSet into LinkedList
		LinkedList<String> linkedList= new LinkedList<>(linkedHashSet);

		//Print the objects in forward direction using ListIterator
		System.out.println("Objects in forward direction: ");
		ListIterator<String>listIterator=linkedList.listIterator();
		while(listIterator.hasNext())
		{
			System.out.println(listIterator.next());
		}

		//Print The objects in backward direction using ListIterator
		System.out.println("Objects in backward direction:");
		while(listIterator.hasPrevious())
		{
			System.out.println(listIterator.previous());
		}
	}
}

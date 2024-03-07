/*Write a java program to add 7 objects into HashSet,LinkedHashSet,TreeSet
1]Print all objects added in HashSet using Iterator.
2]Print all the object added in LinkedHashSet using for each loop
3]Remove 2 objects from TreeSet then print rest of object
*/
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Iterator;
class Hashset 
{
	public static void main(String[] args) 
	{
		HashSet a=new HashSet();
		a.add("Jack");
		a.add(10);
		a.add(null);
		a.add(true);
		a.add('c');
		a.add(3);
		a.add("King");
		System.out.println("List: "+a);
		System.out.println("Print all objects in Hashset using Iterator: ");
		Iterator i=a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}

//Add 3 objects into arrayList and remove second object
import java.util.*;
class D5 
{
	public static void main(String[] args) 
	{
		System.out.println("program Starts");
		ArrayList al =new ArrayList();
		al.add("sam");
		al.add("jack");
		al.add("King");
		al.remove(3); //IndexOutOfBoundsException
		System.out.println(al);
		System.out.println("program ended");
		
	}
}

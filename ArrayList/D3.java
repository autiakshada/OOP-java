import java.util.*;
class D3 
{
	public static void main(String[] args) 
	{
		System.out.println("Program Started");
		TreeSet treeset= new TreeSet();
		treeset.add(10);
		treeset.add(-3);
		treeset.add(0);
		treeset.add(25);
		treeset.add(-8);
		//treeset.add(null); Null pointer exception
		//treeset.add("hello"); Classcast exception
		System.out.println("TreeSet: "+treeset);
		System.out.println("Program Ended");
	}
}

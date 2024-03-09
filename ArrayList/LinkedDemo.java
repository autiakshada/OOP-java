//Write a java program to add objects into LinkedHashMap then convert into LinkedHashSet.
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Map;
class LinkedDemo
{
	public static void main(String[] args) 
	{
		LinkedHashMap lm = new LinkedHashMap();
		lm.put(1, "Jack");
		lm.put(2, "Smith");
		lm.put(3, "Sam");
		lm.put(4, "King");
		lm.put(5, "John");
		lm.put(6, "Om");
		lm.put(7, "PK");
		Set s = lm.entrySet();
		LinkedHashSet ls = new LinkedHashSet();
		for (Object obj : ls)
		{
			 System.out.println(obj.getKey() + ": " + obj.getValue());
        }

	}
}

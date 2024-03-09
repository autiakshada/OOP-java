/*Write a java program to add 14 objects into TreeMap
a)Convert into TreeSet
b)Print all the entries one by one
c)Covert TreeSet into List.
d)Print all the objects in reversed order using List iterator
*/
import java.util.*;

class A1 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();
        
        // Adding objects into TreeMap
        for (int i = 0; i < 4; i++)
		{
            System.out.println("Enter Key: ");
            int key = sc.nextInt();
            System.out.println("Enter Value: ");
            String value = sc.next();
            treemap.put(key, value);
        }
        
        // a) Convert TreeMap into TreeSet
        TreeSet<Integer> treeset = new TreeSet<Integer>(treemap.keySet());
        
        // b) Print all the entries one by one
        System.out.println("Entries in TreeMap:");
        for (Map.Entry<Integer, String> entry : treemap.entrySet()) 
		{
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        // c) Convert TreeSet into List
        ArrayList<Integer> list = new ArrayList<Integer>(treeset);
        
        // d) Print all the objects in reversed order using List iterator
        ListIterator<Integer> iterator = list.listIterator(list.size());
        System.out.println("Entries in reverse order:");
        while (iterator.hasPrevious()) 
		{
            int key = iterator.previous();
            System.out.println(key + ": " + treemap.get(key));
        }
    }
}

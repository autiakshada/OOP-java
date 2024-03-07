/*Q. WATP to add to Heterogeneous object into LinkedHashMap

1. Remove 2nd Object

2. Check whether "Sheela" if present as key if present then remove 
 if not present then add "Shakila". 

3. Check "Shakila" if present as value if yes then print "shakila exists".

4. print all the key's.

5. print all the values.

6. take input from user;
*/
//package Collections;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Iterator;
public class DemoMap
{
    public static void main(String[] args)
	{
        // Create a LinkedHashMap
        LinkedHashMap l = new LinkedHashMap();

        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Add 10 heterogeneous objects by user input
        for (int i = 1; i <= 5; i++) 
		{
            System.out.print("Enter key " + i + ": ");
            String key = sc.nextLine();
            System.out.print("Enter value " + i + ": ");
            String value = sc.nextLine();
            l.put(key, value);
        }

        // 1. Remove 2nd Object
        Iterator iterator = l.entrySet().iterator();
		int count=0;
		while (iterator.hasNext())
		{
			iterator.next();
			count++;
		if (count == 2) 
		{
			iterator.remove(); // Remove the second object
			break;
		}
		}

        // 2. Check whether "Sheela" is present as a key, if present then remove,
        //    if not present then add "Shakila".
        if (l.containsKey("Sheela")) 
		{
            l.remove("Sheela");
        } 
		else 
		{
            l.put("Shakila", "Doctor");
        }

        // 3. Check "Shakila" if present as a value, if yes then print "Shakila exists".
        if (l.containsValue("Shakila")) 
		{
            System.out.println("Shakila exists");
        }

        // 4. Print all the keys
        System.out.println("Keys:");
        for (Object obj : l.keySet()) //keySet to access 
		{
            System.out.println(obj);
        }

        // 5. Print all the values
        System.out.println("Values:");
        for (Object obj : l.values()) 
		{
            System.out.println(obj);
        }
		System.out.println("LinkedHashMap: "+l);
        
    }
}

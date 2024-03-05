/*Consider the employee management system in which add at least 15 employees name into Arraylist.
1)Print all the employees name in forward as well as backward directions using 
a)get (index)
b) list Iterator()
2) remove 3,5, 10, 14 th employee names respectively
 3)check "mr smith" is working in it if yes then print "Mr.smith is working" and remove him
at the earlist.
If smith is not working then add smith and
print "Mr. Smith welcome"
4)print all the emps as per their joining date and also print them in descending order as per their name.
5) Print all the names one by one and iterator() for each
6)Take input from user.
*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Collections;
import java.util.Iterator;
class EmpManagement  
{
	public static void main(String[] args) 
	{
		ArrayList emp=new ArrayList();
		Scanner sc= new Scanner(System.in);
		for (int i = 1; i <= 15; i++)
		{
			System.out.println("Enter "+i+" employee name: "); 
			String name=sc.nextLine();
			emp.add(name);
		}
		System.out.println("Employee name in forword direction by using get(index): ");
		for(int i = 0; i < emp.size(); i++)
		{
			System.out.println(emp.get(i));
		}
		System.out.println("Employee name in backword direction by using get(index): ");
		for(int i = emp.size() - 1; i>=0; i--)
		{
			System.out.println(emp.get(i));
		}
		System.out.println("Employee name in forword direction by using listIterator(): ");
		ListIterator forwardIterator = emp.listIterator();
        while (forwardIterator.hasNext()) 
		{
            System.out.println(forwardIterator.next());
        }
		System.out.println("Employee name in backword direction by using listIterator(): ");
		ListIterator backwardIterator = emp.listIterator(emp.size());
        while (backwardIterator.hasPrevious()) 
		{
            System.out.println(backwardIterator.previous());
        }
		emp.remove(2);
		emp.remove(3);
		emp.remove(8);
		emp.remove(11);
		if(emp.contains("Mr Smith"))
		{
			System.out.println("Mr. Smith is working.");
            emp.remove("Mr Smith");
		}
		else
		{
			System.out.println("Mr. Smith is not working.");
            emp.add("Mr Smith");
            System.out.println("Mr. Smith welcome.");
        }
		//Print all the emp as per their joining
		System.out.println("List of emp as per joining: "+emp);
		System.out.println("All the employee names in descending order: ");
        Collections.reverse(emp);
        for (Object obj : emp) 
		{
            System.out.println(obj);
        }
	}
}

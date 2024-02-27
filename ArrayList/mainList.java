/*
write a Java program to add 25 objects into an array list (heterogeneous) 
1] Take input from the user 
2] Print all the objects after adding along with the size.
*/
import java.util.Scanner;
import java.util.ArrayList;
class mainList 
{
	public static void main(String[] args) 
	{	
		int obj;
		Scanner sc= new Scanner(System.in);-
		ArrayList ref=new ArrayList();
		for(obj=1; obj<26; obj++)
		{
			System.out.println("Enter "+obj+" object: ");
			String data = sc.nextLine();
			ref.add(data);
		}
		System.out.println("Objects in the ArrayList:");
        System.out.println(ref); 
		System.out.println("Size of the ArrayList : "+ref.size());
	}
}

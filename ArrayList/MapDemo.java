/*Implement a simple user registration system in java.
The program should take input from the user for the number of user they want to register.
For each user, the program should promot the user to enter an ID(integer)
and Name(String)
The program should store this information in a
Map<Integer,String> and the print the entries using two different approaches.

First, print the entries to display the entries entry set.
Next,iterator over the map and print each entry separately.
Input:-
1 Rajesh
2 Abhishek
3 Tiger
2 Rahul
4 Bikash
3 Sukumar
output:-
[1=Rajesh, 2=Rahul, 3=Sukumar, 4=Bikash]
1=Rajesh
2=Rahul
3=Sukumar
4=Bikash
*/
import java.util.*;
class MapDemo
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Map<Integer, String>userMap= new HashMap<>();
		int input=sc.nextInt();
		for(int i=0; i<input; i++)
		{
			int id=sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			userMap.put(id,name);
		}
		System.out.println(userMap.entrySet());
		Set s=userMap.entrySet();
		for(Object obj: s)
		{
			System.out.println(obj);
		}
	}
}

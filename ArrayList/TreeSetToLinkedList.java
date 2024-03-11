/*Write a java program that takes input as a sequence of lowercase letters(a-z)
and outputs the sequence in reverse order.The program should perform the following steps:

Create a TreeSet to store the unique lowercase letters in sorted orde
Populate the TreeSet with the letters from the sequence of lowercase letters.
Convert the TreeSet to a LinkedList.
Print the elements in reverse order using a ListIterator.
Sample Input - a b c d e f g h i j k l m n o p q r s t u v w x y z
Sample Output -z y x w v u t s r q p o n m l k j i h g f e d c b a
*/
import java.util.*;
class TreeSetToLinkedList 
{
	public static void main(String[] args) 
	{
		//Create a treeset to store alphabets
		TreeSet<Character> alphabetSet = new TreeSet<>();

		//Add the charachter from a to z
		for(char c='a'; c<='z'; c++)
		{
			alphabetSet.add(c);
		}

		//Convert the TreeSet into LinkedList
		LinkedList<Character> linkedList =new LinkedList<>(alphabetSet);

		//Printing all the elements in reverse order using ListIterator
		ListIterator<Character> iterator= linkedList.listIterator(linkedList.size());

		while(iterator.hasPrevious())
		{
			System.out.print(iterator.previous()+" ");
		}

	}
}

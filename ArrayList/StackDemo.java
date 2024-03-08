//Write a java program to remove second last object from stack then print all the objects in reverse Object.
import java.util.Stack;
class StackDemo
{
	public static void main(String[] args) 
	{
		Stack s = new Stack();
		s.push(10);
		s.push('A');
		s.push("Hii");
		s.push(true);
		s.push(20);
		s.push("Fifth");
		s.push(null);
		s.push(55);
		s.push(10.2);
		//remove second last object
		int a = s.size();
		if(a >= 2)
		{
			s.remove(a - 2);
		}
		System.out.println("Printing all the objects in reverse order: ");
		System.out.println("Objects in reverse order:");
        for (int i = s.size() - 1; i >= 0; i--) 
		{
            System.out.println(s.get(i));
        }

	}
}

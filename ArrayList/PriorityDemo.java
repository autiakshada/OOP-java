//Write a java program to add objects into PriorityQueue and print all the objects one by one. 
import java.util.PriorityQueue;
class PriorityDemo
{
	public static void main(String[] args) 
	{
		PriorityQueue pq = new PriorityQueue();
		pq.offer(5);
        pq.offer(2);
        pq.offer(8);
        pq.offer(1);
        pq.offer(9);
        pq.offer(3);
        pq.offer(6);
        pq.offer(4);
        pq.offer(7);
		for (Object obj : pq )
		{
			System.out.println(obj);
		}	
	}
}

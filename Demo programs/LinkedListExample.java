//write a java pogram to accept 'n' numbers from user to store them into linked list collection. Display  only odd numbers.
import java.util.LinkedList;
import java.util.Scanner; 
public class LinkedListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        LinkedList<Integer> ll = new LinkedList<>();
        int i = 1;
        System.out.println("Enter the "+ n +" elements");
        while (i < n) {
            System.out.println("Enter the "+i+ " elements");
            int x = sc.nextInt();
            if (x % 2 == 0) {
                ll.add(x);
            }
            i++;
        }
        System.out.println("The Even numbers are :");
        ll.forEach((x) ->{
            System.out.println(x);
        }
        );

    }
}


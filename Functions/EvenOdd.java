//Define a program to find out whether a given number is even or odd.
import java.util.Scanner;
public class EvenOdd {
    public static int evenOdd(int num) {
        if(num % 2 == 0){
            System.out.println("The number "+ num + " is a even number." );
        }
        else{
            System.out.println("The number "+ num + " is a odd number." );
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number to check whether a number is even or odd: ");
        int num=sc.nextInt();
        evenOdd(num);
    }
}

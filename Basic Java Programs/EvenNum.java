//write a java program to print the even numbers between two numbers.
import java.util.*;
public class EvenNum {
    public static void main(String[] args) {
        int num1,num2;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number");
        num1=sc.nextInt();
        System.out.println("Enter the second number");
        num2=sc.nextInt();
        System.out.println("List of even numbers from "+num1+" to "+num2+" is:"); 
        for(int i=num1; i<=num2; i++)
        {
            if(i%2==0)
            {
                System.out.println(i+" ");
            }
        }       
    }
}

//write a java program to check whether the number is positive, negative or zero.
import java.util.*;
public class PosNegZero {
    public static void main(String[] args) {
        int num;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        num=sc.nextInt();
        if(num>0)
        {
            System.out.println("The number is positive");
        }
        else if(num<0)
        {
            System.out.println("The number is negative");
        }
        else
        {
            System.out.println("It is zero");
        }
    }
}

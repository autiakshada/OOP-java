//Write a java program to print the table of given number
import java.util.*;
public class Table {
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n ");
        n=sc.nextInt();
        for(int i=1; i<=10; i++)
        {
            int ans=n*i;
            System.out.println(n + " * " + i + " = " + ans);
        }

    }
}

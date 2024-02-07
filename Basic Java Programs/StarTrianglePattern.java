//Write a java program to display triangle of star using nested for loop.
import java.util.*;
public class StarTrianglePattern {
    public static void main(String []args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        n=sc.nextInt();
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

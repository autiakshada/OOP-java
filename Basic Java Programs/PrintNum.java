//write a java program to print the number upto n.
import java.io.*;
import java.util.Scanner;
public class PrintNum {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        n=sc.nextInt();
        for(int i=0; i<=n; i++)
        {
            System.out.println(i);
        }
    }    
}

//write a java program to print the 'Hello World' n times.
import java.io.*;
import java.util.Scanner;
public class NTimes {
    public static void main(String[] args) {
        int num;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the  value of num:");
        num=in.nextInt();
        for(int i=0; i<=num; i++)
        {
            System.out.println("Hello World");
        }

    }
}

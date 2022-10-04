//write a java program to print the numbers from 1 to n using While loop.
import java.io.*;
import java.util.Scanner;
public class WhileLoop
{
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of num");
        num=sc.nextInt();
        int n=1;
        /* Syntax for the while loop
           while(condition){
            //body
           }
         */
        while(n<=num){
            System.out.println(n);
            n++;
        }
    }
}

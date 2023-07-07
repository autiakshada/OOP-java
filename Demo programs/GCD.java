/*Write a java program to calculate the GCD */
import java.io.*;
import java.util.Scanner;
public class GCD{
    public static int FindGCD(int n1,int n2){
        while(n2!=0){
            int temp=n2;
            n2=n1 % n2;
            n1=temp;
        }
        return n1;
    }
    public static void main(String[] args) {
        int n1,n2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        n1=sc.nextInt();
        System.out.println("Enter the second number: ");
        n2=sc.nextInt();
        System.out.println("The GCD of " + n1 + " and " + n2 + " is " +FindGCD(n1,n2));
    }
}

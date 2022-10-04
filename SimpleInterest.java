//Write a  java program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.io.*;
import java.util.Scanner;
public class SimpleInterest
{
    public static void main(String[] args) {
        float p,r,t,si;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principal amount: ");
        p=sc.nextFloat();
        System.out.println("Enter the rate :");
        r=sc.nextFloat();
        System.out.println("Enter the time required :");
        t=sc.nextFloat();
        si=(p*r*t)/100;
        System.out.println("The simple interest = "+si);
    }
}
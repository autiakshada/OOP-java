//Input a year and find whether it is a leap year or not.
import java.io.*;
import java.util.Scanner;
public class LeapYear
{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year");
        n=sc.nextInt();
        if(n%4==0){
            System.out.println("It is a Leap Year");
        }
        else{
            System.out.println("It is not a Leap Year");
        }
    }
}
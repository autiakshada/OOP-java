//Write a menu Driven program to perform the following operation.
import java.io.*;
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        int n,c;
        float r,h;
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.println("1.Volume of Cylinder");
            System.out.println("2.Factorial");
            System.out.println("3.Armstrong");
            System.out.println("4.Exit");
            System.out.println("Enter your Choice: ");
            c=sc.nextInt();
            switch(c)
            {
                case 1:      // To calculate the volume of Cylinder.
                        System.out.println("Enter the radius of Cylinder:");
                        r=sc.nextFloat();
                        System.out.println("Enter the height of cylinder:");
                        h=sc.nextFloat();
                        Float volume=3.14f*r*r*h;
                        System.out.println("The volume of a Cylinder is: " +volume);
                        break;

                case 2:     //To find the factorial of given number.
                        int fact=1;
                        System.out.println("Enter the value of n: ");
                        n=sc.nextInt();
                        int temp=n;
                        while(n>0)
                        {
                            fact=fact*n;
                            n-=1;
                        }
                        System.out.println("Factorial of "+temp+" is "+fact);
                        break;
                case 3:         //To check the number is Armstrong or not.
                        int rem;
                        System.out.println("Enter the value of n: ");
                        n=sc.nextInt();
                        int ans=0;
                        temp=n;
                        while(n>0)
                        {
                            rem=n%10;
                            ans=ans+(rem*rem*rem);
                            n=n/10;
                            if(temp==ans)
                            {
                                System.out.println("The number is Armstrong ");
                            }
                            else{
                                System.out.println("The number is not Armstrong");
                            }
                        }
                        break;

            }
             
        }while(c!=4);
    }
}
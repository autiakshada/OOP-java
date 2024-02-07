//Write a program to print the sum of two numbers entered by user by defining your own method.abstract
import java.util.Scanner;
public class Sum {
    public static int Num( int num1, int num2) {
        int sum;
        sum=num1+num2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("The sum of two numbers is : "+Num(num1,num2));
    }
}

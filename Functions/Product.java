//Define a method that returns the product of two numbers enter by user.
import java.util.Scanner;
public class Product {
    public static int product( int num1, int num2) {
        int mul;
        mul=num1*num2;
        return mul;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("The product of two numbers is : "+product(num1,num2));
    }
}

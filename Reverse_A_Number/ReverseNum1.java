//Write a java program for reverse a number.
/********using algorithm*********/
package Reverse_A_Number;
import java.util.Scanner;
public class ReverseNum1 {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.print("Enter the Number:");
       int num =sc.nextInt();  //1234 = 4321
       int rev=0;
       while(num!=0){
        rev= rev*10 + num % 10;
        num= num / 10;
       }
       System.out.println("\nThe Reversed Num is: "+rev);
    }
}

//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
import java.util.Scanner;
public class PrintSum
{
    public static void main(String[] args) {
        int sum=0, x;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter a number: ");
            x=sc.nextInt();
            sum=sum+x;
        }while(x!=0);
        System.out.println("The sum of the Enter number is: "+sum);
    }
}

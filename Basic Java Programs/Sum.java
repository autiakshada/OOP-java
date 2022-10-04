//Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
import java.io.*;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        int sum=0,x=1;
        Scanner sc=new Scanner(System.in);
        while(x!=0){
            System.out.println("Enter the number");
            x=sc.nextInt();
            sum=sum+x;
        }
        System.out.println("The sum of enter number is :"+sum);
    }
}

//Write a java progarm to dislpay the following pattern.
/* 
            * * * * *
            * * * *
            * * *
            * *
            *
 */
import java.io.*;
import java.util.Scanner;
public class Pattern4 {
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        n=sc.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                if(j<=(n+1)-i)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

                
            }
            System.out.println();
        }
    }
}

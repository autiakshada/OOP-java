//write a  java program to display the following pattern.
/*  
       * * * * *
         * * * *
           * * *
             * *
               *
 */
import java.io.*;
import java.util.Scanner;
public class Pattern3 {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        n=sc.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                if(j>=i){
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




                
            
            
        

        
    
    


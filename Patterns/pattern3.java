/*print the following pattern
    *****
    ****
    ***
    **
    *
*/
import java.util.Scanner;
public class pattern3 {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the number of rows: ");
       int rows=sc.nextInt();
       System.out.println("Enter the number of columns: ");
       int cols = sc.nextInt();
       for (int i = rows ;i>=1;i--){
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println( );
       }
    }
}

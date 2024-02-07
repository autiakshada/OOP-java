/* print the following pattern
           *       *
         *   *  *   *
       *      *      *

 */
import java.util.Scanner;
public class Pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows= sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            System.out.print("*");
            for (int j = 1; j <= 2 * i - 3; j++) {
                System.out.print("   ");
            }
            if (i > 1) {
                System.out.print("*");
            }
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
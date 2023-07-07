//Factorial program using conditions and loops
import java.util.Scanner;
public class factorial {
    public static long printFac(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        long f = printFac(n);
        System.out.println("Factorial of " + n + " is " + f);
    }
}

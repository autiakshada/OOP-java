/*import java .io.*;
public class MultiplesOfThreeAndSeven {
    public static void main(String[] args) {
        int n = 20;
        int a = 3;
        int b = 7;

        int lcm = findLCM(a, b);

        int[] multiples = new int[n];
        for (int i = 0; i < n; i++) {
            multiples[i] = a * (i+1) * b * (i+1);
        }

        System.out.println("Multiples of 3 and 7 in reverse order:");
        for (int i = n-1; i >= 0; i--) {
            System.out.println(multiples[i]);
        }

        int firstMultipleDivisibleByLCM = 0;
        for (int i = 0; i < n; i++) {
            if (multiples[i] % lcm == 0) {
                firstMultipleDivisibleByLCM = multiples[i];
                break;
            }
        }

        System.out.println("The first multiple divisible by LCM of 3 and 7 is " + firstMultipleDivisibleByLCM);
    }

    private static int findLCM(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        int lcm = max;
        while (lcm % min != 0) {
            lcm += max;
        }
        return lcm;
    }
}
 */
 /*Find the n=20 number of multiple of number a=3 and number b=7 and print in reverse order 
 and find the number which is perfectly devided by LCM of a and b .write a program in java*/
import java.io.*;
import java.util.Scanner;
public class MultiplesOfThreeAndSeven{
    public static void main(String[] args) {
       /*Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
         int a = in.nextInt();
        int b = in.nextInt();*/
        int a=3;
        int b=7;
        int num=20;
        int max = Math.max(a, b);
        int lcm = 0;
        int[] multiples = new int[num];
        for (int i = 0; i < num; i++) {
            multiples[i] = a * (i+1) * b * (i+1);
        }
        System.out.println("Multiples of 3 and 7:");
        for (int i = num-1; i >= 0; i--) {
            System.out.println(multiples[i]);
        }

     /*    while(true) {
            if(max%a == 0 && max % b == 0){
                System.out.println(max);
                break;
                }
            max++;
        }
    }
}
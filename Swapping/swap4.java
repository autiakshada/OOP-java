package Swapping;
//write a java program for swapping the two numbers.
/***************using multiplication and division*********/
import java.io.*;
public class swap4 {
    public static void main(String[] args) {
        int a = 5, b=10;

        //Before swapping
        System.out.println("Before swapping:");
        System.out.println("a ="+ a);
        System.out.println("b ="+ b);

        //Swapping logic
        a = a * b;
        b = a / b;
        a = a / b;        

        //After swapping
        System.out.println("After swapping:");
        System.out.println("a ="+ a);
        System.out.println("b ="+ b);
    }
}

package Swapping;
//write a java program for Swapping two numbers.
/************Swapping using arithmetic operations:*************/
import java.io.*;
public class swap2 {
   public static void main(String[] args) {
    int a=5, b=10;

    //Before Swapping
    System.out.println("Before swapping :");
    System.out.println("A= "+a);
    System.out.println("B= "+b);

    //Swapping logic
    a=a+b;
    b=a-b;
    a=a-b;

    //After swapping
    System.out.println("After swapping: ");
    System.out.println("A= "+a);
    System.out.println("B= "+b);


} 
}

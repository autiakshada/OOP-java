package Swapping;
//Write a java program for the swapping of two numbers.
import java.io.*;
public class swap1{
    public static void main(String[] args) {
        int a=5, b=6;
        //Before Swapping
        System.out.println("Before Swapping:");
        System.out.println("A= "+a);
        System.out.println("B= "+b);
        
        //Swapping
        int temp;
        temp= a;
        a = b;
        b= temp;
        
        //After Swapping
        System.out.println("After Swapping");
        System.out.println("A= "+a);
        System.out.println("B= "+b);
    }
}
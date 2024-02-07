package Swapping;
//Write a java program for the swapping of the two numbers.
/***********using single statement***********/
import java.io.*;
public class swap5 {
    public static void main(String[] args) {
        int a = 10, b=5;
        System.out.println("Before Swapping: A="+a+" and B="+b);
        b=a+b-(a=b);
        System.out.println("After Swapping: A="+a+" and B="+b);
    }
}

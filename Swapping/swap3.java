package Swapping;
//write a java program for swapping of the two numbers.
/***********Swapping using bitwise XOR:**********/
import java.io.*;
public class swap3 {
    public static void main(String[] args) {
        int x = 10, y=5;
        System.out.println("Before swapping");
        System.out.println("X= "+x);
        System.out.println("Y= "+y);

        // swapping logic
        x ^= y;   //XOR operation between X and Y to get their original values back in  
        y ^= x;
        x ^= y;
        
        //After swapping
        System.out.println("After swapping");
        System.out.println("X= "+x);
        System.out.println("Y= "+y);


    }
}

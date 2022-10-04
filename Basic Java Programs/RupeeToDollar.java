//Input currency in rupees and output in USD.
import java.io.*;
import java.util.Scanner;
public class RupeeToDollar {
    public static void main(String[] args) {
        float rupees, dollar;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rupee: ");
        rupees=sc.nextFloat();
        dollar=rupees/64;
        System.out.println("Dollar:$ "+dollar);
    }
}

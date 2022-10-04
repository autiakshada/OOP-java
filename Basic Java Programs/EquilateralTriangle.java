//Write a java progarm to calculate the area of equilateral triangle.
import java.util.Scanner;
import java.lang.Math.*;
public class EquilateralTriangle {
    public static void main(String[] args) {
        double a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of equilateral triangle: ");
        a=sc.nextDouble();
        System.out.println((Math.sqrt(3))/4 * a * a);
    }   
}
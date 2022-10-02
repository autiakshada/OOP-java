//write a python program to calculate the volume of cylinder.
import java.io.*;
import java.util.Scanner;
public class VolumeCylinder {
    public static void main(String[] args) {
        float r,h;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the height of Cylinder: ");
        r=sc.nextFloat();
        System.out.println("Enter the radius of cylinder: ");
        h=sc.nextFloat();
        Float volume=3.14f*r*r*h;
        System.out.println("The volume of a cylinder is : "+volume);
    }
}

//Write a program to print the circumference and area of cirle
//of radius entered by user by defining your own method.
import java.util.Scanner;
public class CircumferenceAreaOfCircle {
    public static float circumference(float r) {
        float pi =3.14f;
        float s =2 * pi * r;
        return s;
    }
    public static float area(float r) {
        float pi=3.14f;
        float area=pi * r * r;
        return area;

        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        float r=sc.nextFloat();
        System.out.println("The circumferrence of a circle is : "+circumference(r));
        System.out.println("The area of a circle is: "+area(r));
    }
    
}

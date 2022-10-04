//Write a java program to calculate the area of Rhombus.
import java.util.Scanner;
public class AreaRhombus {
    public static void main(String[] args) {
        float p, q, area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two Diagonal of Rhombus: ");
        p=sc.nextFloat();
        q=sc.nextFloat();
        area=p*q/2;
        System.out.println("The area of a rhombus is : "+area);
    }
    
}

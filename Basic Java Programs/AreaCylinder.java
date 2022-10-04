//write a java program to calculate the area of cylinder.
import java.util.*;
public class AreaCylinder {
    public static void main(String[] args) {
        Double r, h, area;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of cylinder");
        r=sc.nextDouble();
        System.out.println("Enter the height of cylinder");
        h=sc.nextDouble();
        area=2 * 3.14 * r * h + (2 * 3.14 * r *r);
        System.out.println("The area of the cylinder is : "+area);
    }
}

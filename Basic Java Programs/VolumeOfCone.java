//Write a java program to calculate the volume of a cone.
import java.util.Scanner;
public class VolumeOfCone {
    public static void main(String[] args) {
        float volume, r, h, pi=3.14f;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of cone : ");
        r=sc.nextFloat();
        System.out.println("Enter the height of the cone: ");
        h=sc.nextFloat();
        volume=(pi*r*r)*h/3;
        System.out.println("The Volume of the cone is: "+volume);
        
    }
}

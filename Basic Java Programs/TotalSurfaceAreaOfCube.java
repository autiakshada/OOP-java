//Write a java progarm to caculate the total surface area of cube.
//Formula for the Total surface area of cube is 6*a*a*
import java.util.Scanner;
public class TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
        float s, area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the cube:");
        s=sc.nextFloat();
        area=6*s*s;
        System.out.println("The total surface area of the cube is : "+area);
    }    
}

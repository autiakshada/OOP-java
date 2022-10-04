// Write a java program to calculate the : Area Of Parallelogram
import java.util.Scanner;
public class AreaParallelogram {
    public static void main(String[] args) {
        float base, height, area;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the base of a parallelogram: ");
        base=sc.nextFloat();
        System.out.println("Enter the height of a parallelogram : ");
        height=sc.nextFloat();
        area=base*height;
        System.out.println("The area of a parallelogram is: "+area);
    }
    
}

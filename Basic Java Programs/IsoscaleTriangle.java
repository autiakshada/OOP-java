//write a java program to calculate the : Area Of Isosceles Triangle
import java.util.Scanner;
public class IsoscaleTriangle
{
    public static void main(String[] args) {
        float base, height, area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of isoscale triangle: ");
        base=sc.nextFloat();
        System.out.println("Enter the height of isoscale triangle: ");
        height=sc.nextFloat();
        area=base*height/2;
        System.out.println("The Area of a Isoscale Triangle is: " +area);
    }
}

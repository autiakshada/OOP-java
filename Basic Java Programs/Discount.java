//Wrte a java program to calculate the discount of product.
import java.util.Scanner;
public class Discount {
    public static void main(String[] args) {
        double dis, amount, mrp, s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the MRP of the product: ");
        mrp=sc.nextDouble();
        System.out.println("Enter the discount in percentage: ");
        dis=sc.nextDouble();
        s=100-dis;
        amount=(s*mrp)/100;
        System.out.println("The amount after the discount is : "+amount);

    }
}

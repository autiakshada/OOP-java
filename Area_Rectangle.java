// // // //If the length =100000 and width=10000 of rectangle the calculate the area of rectangle.
// // // import java.io.*;
// // // public class Area_Rectangle{
// // //     public static void main(String[] args) {
// // //         int l=100000, w=10000;
// // //         float area=l*w;
// // //         System.out.println("Area of reactangle= "+area);
// // //     }
// // // } 
// import java.io.*;
//  import java.util.Scanner;
//   public class Area_Rectangle{
//      public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//          System.out.println("Enter the length of rectangle: ");
//          System.out.println("Enter the width of the reactangle: ");
//          float l=sc.nextFloat();
//          float w=sc.nextFloat();
//          float area=l*w;
//         System.out.println(area);

//      }
//  }
import java.util.Scanner;

public class Area_Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        double area = length * width;

        System.out.println("The area of the rectangle is " + area);
    }
}

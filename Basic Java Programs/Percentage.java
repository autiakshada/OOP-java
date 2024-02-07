//Write a java program to caculate the percentage of marks.
import java.util.Scanner;
public class Percentage {
    public static void main(String[] args) {
        float percentage, obtmarks, Total;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the obtain marks: ");
        obtmarks=sc.nextFloat();
        System.out.println("Enter the total marks: ");
        Total=sc.nextFloat();
        percentage=(obtmarks/Total)*100;
        System.out.println("The percentage= "+percentage+"%");
        
    }
}

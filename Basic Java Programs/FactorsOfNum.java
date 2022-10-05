//write a java program to print all the factors of the input number.
import java.util.Scanner;
public class FactorsOfNum {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a any number to find the factors of that number");
        num=sc.nextInt();
        System.out.println("All factor of the " +num+ " is :" );
        for(int i=1; i<=num; i++){
            if(num % i==0){
                System.out.println(i);
            }
        }
    }
    
}

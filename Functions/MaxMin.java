//Define two methods to print the maximum and minimum number respectively among three numbers entered by user.
import java.util.Scanner;
public class MaxMin
{
    public static int max(int a, int b, int c) {
        int max = a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        return max;
    }
    public static int min(int a, int b, int c){
        int min=a;
        if(b<min){
            min=b;
        }
        if(c<min){
            min=c;
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("maximum number: "+max(a, b, c));
        System.out.println("minimum number: "+min(a, b, c));
    }
}
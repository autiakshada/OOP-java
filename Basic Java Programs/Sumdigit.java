import java.util.Scanner;
public class Sumdigit
{
    public static void main(String[] args) {
    int num, digit, sum=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    num = sc.nextInt();
    while(num>0)
    {
        digit=num%10;//To find out the last digit
        sum=sum+digit;
        num=num/10;
    }
    System.out.println("Sum of the digits: "+sum);
}
}

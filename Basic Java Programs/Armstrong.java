//To find Armstrong Number between two given number.
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        int n, temp,rem;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check it is Armstrong or not:  ");
        n=sc.nextInt();
        int ans=0;
        temp=n;
        while(n>0)
        {
            rem=n%10;
            ans=ans+(rem*rem*rem);
            n=n/10;
            if(temp==ans)
            {
                System.out.println("The number is " +ans+" Armstrong ");
            }
            else{
                System.out.println("The number is " +n+ " not Armstrong");
            }
        }



    }
}

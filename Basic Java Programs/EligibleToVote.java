//A person is eligible to vote if his/her age is greater than or equal to 18.
import java.util.Scanner;
public class EligibleToVote
{
    public static void main(String[] args) {
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age : ");
        age=sc.nextInt();
        if(age>=18)
        {
            System.out.println("He/She is eligible for vote.");
        }
        else{
            System.out.println("He/She is not eligible for vote.");
        }

    }
}
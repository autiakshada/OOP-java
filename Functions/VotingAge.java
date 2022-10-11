//A person is eligible to vote if his/her age is greater than or equal to 18.
import java.util.Scanner;
public class VotingAge {
    public static void Eligibility(int age) {
        if(age>=18){
            System.out.println("Candidate is eligible for vote: ");
        }
        else{
            System.out.println("Candidate is not eligible for vote: ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of candidate: ");
        int age=sc.nextInt();
        Eligibility(age);
    }
    
}

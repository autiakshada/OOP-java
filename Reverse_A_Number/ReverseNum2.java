import java.util.Scanner;

public class ReverseNum2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        String numberString = String.valueOf(number);
        StringBuffer stringBuffer = new StringBuffer(numberString);
        StringBuffer reversedBuffer = stringBuffer.reverse();
        String reversedString = reversedBuffer.toString();
        int reversedNumber = Integer.parseInt(reversedString);
        
        System.out.println("Reversed number: " + reversedNumber);
    }
}

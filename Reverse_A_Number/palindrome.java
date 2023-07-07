//Write a java program to check whether the string is palindrome or not
import java.io.*;
public class palindrome {
    public static void main(String[] args) {
        String str = "racecar";
        int len=str.length();
        for (int i = 0;i<len/2 ; ++i){
            if (str.charAt(i)!= str.charAt(len-1-i)){
                System.out.println("Not Palindromic");
            }
        }
    }    
}

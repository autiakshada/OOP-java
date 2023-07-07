import java.io.*;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello World";
        StringBuilder sb = new StringBuilder(str);
        System.out.println("Original String: " + sb);
        
        // Reverse the given string
        int lengthOfStr = str.length();
        for (int i = 0; i < lengthOfStr / 2; i++) {
            char temp = str.charAt(i);
            sb.setCharAt(i, str.charAt(lengthOfStr - 1 - i));
            sb.setCharAt(lengthOfStr - 1 - i, temp);
        }
        
        System.out.println("Reversed String: " + sb);
    }
}

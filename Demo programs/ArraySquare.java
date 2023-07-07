/*write a java program to Create an n=20 number of array , array contain squares of first n numbers 
And print numbers which are divisible by 9. don't use inbuilt math functions.
 */
import java.io.*;
public class ArraySquare{
    public static void main(String[] args) {
        int n=20,i;
        int[] a=new int[n];
        for(i=0;i<n;i++){
            a[i]=(i+1)*(i+1);
            if(a[i] % 9 == 0){
                System.out.println(a[i]);
            }
        }
    }
}

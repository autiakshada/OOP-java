/*Find the n=14 number of multiple of a=3 or b=7 or both a and b and 
 print step by LCM of a and b in java program*/
public class LCMStepByStep{
    public static void main(String[] args) {
        int a=3;
        int b=7;
        int num=0;
        int i=1;
        while(num<14) {
            if(i % a == 0 || i % b == 0){
                System.out.println(i);
                num++;
                }
             i++;   
        
        }
    }
}
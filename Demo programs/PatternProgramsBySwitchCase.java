import java.io.*;
import java.util.Scanner;
public class PatternProgramsBySwitchCase{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int row, Type;
        System.out.println("Enter the number of rows: ");
        row=sc.nextInt();
        System.out.println("Enter your choice:\n "+" 1: Triangle Pattern\n " + " 2:Inverse Triangle\n " +
                            "3: Hollow Triangle\n " + "4: Diamond Pattern\n" + "5: Hollow Diamond Pattern\n" +
                            " 6: CharTriangle Pattern\n" + " 7: DigitTriangle Pattern \n" + " 8: Digit Sequence Pattern\n");
        Type=sc.nextInt();
        switch (Type) {
            case 1:
                TrianglePattern(row);
                break;
            case 2:
                InverseTriangle(row);
                break;
            
            case 3:
                HollowTriangle(row);
                break;
            
            case 4:
                DiamondPattern(row);
                break;
            
            case 5:
                HollowDiamond(row);
                break;
            
            case 6:
                CharTriangle(row);
                break;
            
            case 7:
                DigitTriangle(row);      
                break;
            case 8:
                DigitSequence(row);
                break;
         }
    }
         public static void TrianglePattern(int row) {
            System.out.println("Triangle Pattern");
                for (int i = 1; i <= row; i++) {
                     for (int j = 1; j <= row-i; j++) {
                        System.out.print(" ");
                     }
                     for (int j = 1; j <= 2*i-1; j++) {
                        System.out.print("*");
                    }
                     System.out.println();
                 }
                
            }
        public static void InverseTriangle(int row) {
                System.out.println("Inverse Triangle");
                 for (int i = row; i >= 1; i--) {
                    for (int j = 1; j <= row-i; j++) {
                        System.out.print(" ");
                         }
                 for (int j = 1; j <= 2*i-1; j++) {
                          System.out.print("*");
                        }
                     System.out.println();
                    }
            
                }
        public static void HollowTriangle(int row) {
            System.out.println("Hollow Triangle");
                for (int i = 1; i <= row; i++) {
                    for (int j = 1; j <= row-i; j++) {
                        System.out.print(" ");
                        }
                    for (int j = 1; j <= 2*i-1; j++) {
                        if (j == 1 || j == 2*i-1 || i == row) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                         }
                     }
                 System.out.println();
                }  
            }
        public static void DiamondPattern(int row) {
            System.out.println("Diamond Pattern");
            for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = row-1; i >= 1; i--) {
            for (int j = 1; j <= row-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void HollowDiamond(int row) {
            //upper triangle pattern logic
            for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row- i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 1; j < 2 * i - 2; j++) {
                System.out.print(" ");
            }
            if (i == 1) {
                System.out.println();
            } else {
                System.out.print("*");
                System.out.println();
            }
        }
        //Lower Triangle pattern logic
        for (int i = row - 1; i >= 1; i--) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 1; j < 2 * i - 2; j++) {
                System.out.print(" ");
            }
            if (i == 1) {
                System.out.println();
            } else {
                System.out.print("*");
                System.out.println();
            }
        }

    }
    /**************Char Triangle Pattern *************/
        public static void CharTriangle(int row) {
            Scanner sc= new Scanner(System.in);
            System.out.println("CharTriangle Pattern");
                System.out.println("Enter the charachter: ");
                char ch = sc.next().charAt(0);
                for (int i = 1; i <= row; i++) {
                     for (int j = 1; j <= row-i; j++) {
                        System.out.print(" ");
                     }
                     for (int j = 1; j <= 2*i-1; j++) {
                        System.out.print(ch);
                    }
                     System.out.println();
                 }
            }
        /**********Digit Triangle Pattern********/
        public static void DigitTriangle(int row) {
            System.out.println("Digit Triangle Pattern");
                for (int i = 1; i <= row; i++){ 
                    for (int j = 1; j <= i; j++){
                        System.out.print(i+" ");  
                    }  
                System.out.println();  
                }     
            }
        //******Digit Sequence Pattern*******/
        public static void DigitSequence(int row) {
            System.out.println("Digit Sequence Pattern");
            for (int i = 1; i <= row; i++) {
            int num = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
            }
        }
    }



                 
//Write a java program to print number 25 to 2500 without using loops.

class P1{

    public static void Num(int a, int b) {
        if (a <= b) {
            System.out.println(a);
            Num (a+1, b);
        }
    }
    public static void main(String[] args) {
		System.out.println("The Numbers from 25 to 2500");
        Num(25, 2500);
    }
}


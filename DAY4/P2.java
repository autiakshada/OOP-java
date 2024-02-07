//Write a java program to print charachter from Z to A without using loops.

class P2{
	public static void charachter(char a) {
        if (a >= 'A') {
            System.out.println(a);
            charachter(--a);
        }
    }
    public static void main(String[] args) {
		System.out.println("The charachter from Z to A");
        charachter('Z');
    }
}



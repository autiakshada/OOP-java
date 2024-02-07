//write a java program to print tne numbers from 85 to 850.
class P3{
	public static void numbers(int a) {
        if (a <= 850) {
            System.out.println(a);
            numbers(++a);
        }
    }
    public static void main(String[] args) {
		System.out.println("The numbers from 85 to 850");
        numbers(85);
    }
}

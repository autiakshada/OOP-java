import java.util.Scanner;

class Customer {
    int cid;
    int cAge;
    String name;

    // Constructor
    Customer(int cid, int cAge, String name) {
        this.cid = cid;
        this.cAge = cAge;
        this.name = name;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        System.out.println("Enter the 1st Customer Id: ");
        int cid=sc.nextInt();
        System.out.println("Enter the 1st Customer age: ");
        int cAge=sc.nextInt();
        System.out.println("Enter the 1st Customer name: ");
        String name = sc.next();

        
		Customer ref1 = new Customer(cid,cAge,name);
        System.out.println("1st Customer Details");
        System.out.println("Customer Id: " + ref1.cid);
        System.out.println("Customer age: " + ref1.cAge);
        System.out.println("Customer name: " + ref1.name);
        System.out.println("=============================");

		
        System.out.println("Enter the 2nd Customer Id: ");
        int cid1 = sc.nextInt();
        System.out.println("Enter the 2nd Customer age: ");
        int cAge1 = sc.nextInt();
        System.out.println("Enter the 2nd Customer name: ");
        String name1 = sc.nextLine();

        Customer ref2 = new Customer(cid1,cAge1,name1);
        System.out.println("2nd Customer Details");
        System.out.println("Customer Id: " + ref2.cid);
        System.out.println("Customer age: " + ref2.cAge);
        System.out.println("Customer name: " + ref2.name);
		System.out.println("=============================");
		
    }
}

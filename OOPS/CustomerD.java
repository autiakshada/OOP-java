class Product
{
	int pid;
	String name;
	String brand;
	double price;
	Product(int pid,String name,String brand,double price)
	{
		this.pid=pid;
		this.name=name;
		this.brand=brand;
		this.price=price;
	}
	@Override
	public String toString()
	{
		System.out.println("ID: "+pid);
		System.out.println("NAME: "+name);
		System.out.println("BRAND: "+brand);
		System.out.println("PRICE: "+price);
		return " ";
	}
}
//Driver class 
class CustomerD 
{
	public static void main(String[] args) 
	{
		Product ref1=new Product(10,"Notebook","Classmate",160);
		System.out.println(productDetails);
		System.out.println("===================");
		Product ref2=new Product(20,"Pen","Lexii", 20);
		System.out.println(productDetails);
		System.out.println("===================");
		Product ref3=new Product(30,"Laptop","Dell",900000);
		System.out.println(productDetails);
		System.out.println("===================");
		Product ref4=new Product(40,"Moblie","OPPO",15000);
		System.out.println(productDetails);
		System.out.println("===================");
		Product ref5=new Product(50,"Headphone","Boat",12000);
		
	}
}

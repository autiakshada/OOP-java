//parent class
class Vehicle
{
	String brand;
	String color;
	String number;
	
	//Method
	public void drive()
	{
		System.out.println("Brand: "+brand);
		System.out.println("color: "+color);
		System.out.println("number: "+number);
	}
}
//child class
class Car extends Vehicle
{
    Car(String brand, String color, String number) {
        this.brand = brand;
        this.color = color;
        this.number = number;
    }

}
//Driver class
class CarDriver
{

	public static void main(String[] args) 
	{
		Car ref1=new Car("BMW","BLACK","XY9699");
		Car ref2=new Car("Toyota", "Red", "ABC123");
		Car ref3=new Car("Honda", "Blue", "XYZ456");

		System.out.println("Car 1 Details: ");
		ref1.drive();
		System.out.println("====================");
		System.out.println("Car 2 Details: ");
		ref2.drive();
		System.out.println("====================");
		System.out.println("Car 3 Details: ");
		ref3.drive();
	}
}

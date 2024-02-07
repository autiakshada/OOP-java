/*Q.Write a java program for the class as "product" consists of product identity number
and product cost and product brand initialize alll the product details using parameterized constructor 
and also achieve inheritance between product class and the amazon class .Amazon must 
aquire the all the states and the behaviour of the product class.
1]All user to order the product from the amazon by creating the amazon object.
2]Take the input from the user for all the product details.
3]Achieve data hiding for all the product details. 
4]print product details from main method.
*/
import java.util.Scanner;
//parent class
class Product
{
	private String pId;
	private double pCost;
	private String pBrand;
	//getter method to get all private data
	public String getpId()
	{
		return pId;
	}
	public double getpCost()
	{
		return pCost;
	}
	public String getpBrand()
	{
		return pBrand;
	}
	//setter method to set/modify private data
	 public void setpId(String pId) 
	{
         this.pId=pId;
    }
	public void setpCost(double pCost) 
	{
        this.pCost=pCost;
    }
	public void setpBrand(String pBrand)
	{
        this.pBrand=pBrand;
    }
}
//child class 
class Amazon extends Product 
{
	 Amazon(String pId, double pCost, String pBrand) 
	{
        setpId(pId);
        setpCost(pCost);
        setpBrand(pBrand);
	}

}
//Driver class
class ProductDetails 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product ID:");
        String pId = sc.next();
		System.out.println("Enter Product Cost:");
        double pCost = sc.nextDouble();
		System.out.println("Enter Product Brand:");
        String pBrand = sc.next();
		//  Amazon object
        Amazon obj= new Amazon(pId, pCost, pBrand);
		System.out.println("==========================");
        System.out.println("Ordered Product Details:");
        System.out.println("Product ID: " +obj.getpId());
        System.out.println("Product Cost: " +obj.getpCost());
        System.out.println("Product Brand: " +obj.getpBrand());
	}
}

import java.util.Scanner;
//Login functionality
//Super class
class user
{
	private String uName;
	private String pwd;
	//Constructor
	User(String uName,String pwd)
	{
		this.uName=uName;
		this.pwd=pwd;
	}
	//getter is used to get private data
	public String getuName()
	{
		return uName;
	}

	public String getpwd()
	{
		return pwd;
	}
}

class HealthHub 
{
	public static void main(String[] args) 
	{
		System.out.println("Discover Your Wellness: Welcome to HealthHub");
		System.out.println("Please Login or Create an account to get started...");
	}
}

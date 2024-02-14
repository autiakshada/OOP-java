
import java.util.Random;
import java.util.Scanner;

class Marvels
{
	private String name;
	private long contact = 6366569607L;
	private String email;
	private String address;
	private String password;

public String getName() 
        {
		return name;
        }

public void setName(String name) 
       {
		this.name = name;
	    }

public String getCaptch() 
       {
		return captch;
	   }

public long getContact() 
       {
		return contact;
	   }

public void setContact() 
       {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your contact number");
		contact = sc.nextLong();
if (contact > 999999999 && contact < 10000000000L)
        {
			System.out.println("Contact number is valid");
		}
else {
			System.err.println("Please enter 10 digit!! Try Again");
			setContact();
		}
	   }

public String getEmail() 
       {
		return email;
	   }

public void setCaptch(String captch)
       {
		this.captch = captch;
	   }

public void setEmail(String email)
       {
		this.email = email;
	   }

public String getAddress() 
       {
		return address;
	   }

public void setAddress(String address) 
       {
		this.address = address;
	   }

public void setPassword(String password) 
       {
		this.password = password;
	   }

public void signup() 
       {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		name = sc.nextLine();
		setContact();
		System.out.println("Enter your email");
		email = sc.nextLine();
		System.out.println("Enter your address");
		address = sc.nextLine();
		System.out.println("Enter strong password");
		password = sc.nextLine();
	    }

String captch = "";

public void captch()
       {
		captch = "";
		Random r = new Random();
while (captch.length() < 5)
       {
			int x = r.nextInt(121);
if ((x >= 65 && x <= 90) || (x >= 97 && x <= 120) || (x >= 48 && x <= 58))
        {
				captch = captch + (char) x;
		}
		}
}

public void verifyCaptch() 
        {
		Scanner sc = new Scanner(System.in);
		captch();
		System.out.println(captch);
		System.out.println("Enter captcha as above");
		String captcha = sc.nextLine();
if (captcha.equals(this.captch))
        {
			System.out.println("Captcha Verified");
		}
else    {
			System.err.println("Not valid Try Again");
			verifyCaptch();
		}
	}

public void login()
       {
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 to use contact for login");
		System.out.println("Press 2 to use email for login");
		int n = sc.nextInt();
if (n == 1) 
       {
			System.out.println("Enter the contact");
			long contact = sc.nextLong();
			sc.nextLine();
			System.out.println("Enter the password");
			String pass = sc.nextLine();
			verifyCaptch();
if (this.contact == contact && this.password.equals(pass) && this.captch.equals(captch))
       {
			System.out.println("Login Successful");
			}
else {
				System.err.println("User Credentials Incorrect");
				login();
			}
		} 
else if (n == 2)
      {
			System.out.println("Enter the Email");
			sc.nextLine();
			String email = sc.nextLine();
			System.out.println("Enter the password");
			String pass = sc.nextLine();
			verifyCaptch();
if (this.email.equals(email) && this.password.equals(pass) && this.captch.equals(captch))
           {
				System.out.println("Login Successful");
			}  
else {
				System.err.println("User Credentials Incorrect");
				login();
			}
     		}
else {
			System.err.println("Wrong Choice!!! Please t ry again");
			login();
		}
	    }


}
public class TheTonightShow {
	public static void main(String[] args) {
		Marvels m = new Marvels();
		m.signup();
		System.out.println(m.getName());
		System.out.println(m.getContact());
		System.out.println(m.getEmail());
		System.out.println(m.getAddress());
		m.login();
	}
}
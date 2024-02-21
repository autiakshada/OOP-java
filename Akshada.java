
import java.lang.String;
import java.util.Scanner;
import java.lang.Float;
import java.lang.System;



class HealthHub {

	protected  String activity ;
	protected float duration ;
	protected  String mealType ;
	protected String foodItem ;
	protected float quantity ;
	protected String bedTime;
	protected String wakeUpTime ;
	protected float  waterQuantity ;
	protected String mood   ;

	protected void trackActivity(String activity, float duration) {

		this.activity = activity ;
		this.duration = duration ;

	}

	/*
	Enter meal type: Breakfast
	Enter food item: Oatmeal
	Enter quantity (grams): 200
	*/
	protected void logNutrition(String mealType, String foodItem, float quantity) {

		this.mealType = mealType ;
		this.foodItem = foodItem ;
		this.quantity = quantity ;

	}

	/*
	Enter bedtime: 11:00 PM
	Enter wake-up time: 7:00 AM
	Sleep duration: 8 hours
	*/

	protected void monitorSleep(String bedTime, String wakeUpTime) {

		this.bedTime = bedTime ;
		this.wakeUpTime = wakeUpTime ;

	}

	/*
	Enter amount of water consumed (ounces): 16
	*/
	protected void hydrationLevel(float waterQuantity) {

		this.waterQuantity = waterQuantity ;


	}

	/*
	Enter mood: Happy
	*/

	protected void  moodTracker(String mood) {

		this.mood = mood ;


	}

	/*
	Progress Overview:
	- Activity: 30 minutes
	- Nutrition: Oatmeal (200g)
	- Sleep: 8 hours
	- Hydration: 16 ounces
	- Mood: Happy

	*/
	
	protected void progress() {
	   
	   
    if (activity != null) {
        
        System.out.println("Your Activity: " + activity);
        
    }
    
    
    if (duration != 0.0f) {
        
        System.out.println("Your Activity Duration: " + duration);
        
    }
    
    
    if (mealType != null) {
        
        System.out.println("Your Meal Type: " + mealType);
    }
    
    
    if (foodItem != null) {
        
        System.out.println("Your Food Items: " + foodItem);
   
     }
    
    
      if (quantity!= 0.0f) {
        
        System.out.println("Your Food Quantity : " + quantity);
        
    }
    
    
    if (waterQuantity != 0.0f) {
        
        System.out.println("Your Hydration Level: " + waterQuantity);
        
    }
    
    
    if (bedTime != null) {
        
        
        System.out.println("Your Bed Time: " + bedTime);
 
       }
       
       
    if (wakeUpTime != null) {
        
        System.out.println("Your Wake Up Time: " + wakeUpTime);
        
    }
    
    
    if (mood != null) {
        
        System.out.println("Your Mood: " + mood);
        
    }
}





}

class User extends HealthHub {
	private String userName;
	private String userPassword;
	private static final int MAX_USERS = 10;
	private static int userCount = 0;
	protected static User[] userList = new User[MAX_USERS];

	// Scanner sc = new Scanner(System.in); // Move this to main or pass it as a parameter

	public User() {
	}

	public User(String userName, String userPassword) {
		this.userName = userName;
		this.userPassword = userPassword;

		// Add the created user to the userList array
		if (userCount < MAX_USERS) {
			userList[userCount] = this;
			userCount++;
		//	System.out.println("User added to the userList array.");
		} else {
			System.out.println("Cannot add more users. User limit reached.");
		}
	}

	public static int verifyUser(String name, String password) {
		for (int i = 0; i < userCount; i++) {
			if (userList[i].userName.equals(name) && userList[i].userPassword.equals(password)) {
				return i;
			}
		}
		return -1; // Return -1 if user not found
	}

	public void details() {
		System.out.println("User Name: " + userName);
		System.out.println("Password: " + userPassword);
		System.out.println("Activity: " + activity);
		System.out.println("Duration: " + duration);
	}

	// Other methods and class definition...
}

public class Akshada {




	public static void main(String[] args) {






		Scanner sc = new Scanner(System.in);
		int choice1, choice2;


		User u1 = new User("shantanu", "Akshada14");

		u1 = null;

		do {
			System.out.println("*******Welcome In Health Hub********");
			System.out.println("\n1. Login ");
			System.out.println("\n2. Sign Up ");
			System.out.println("\n0. Exit App\n ");
			choice1 = sc.nextInt();

			switch (choice1) {


			case 1:
				System.out.println("\n Enter UserName : \t");
				String name = sc.next();
				System.out.println("\n Enter Password : \t");
				String pass = sc.next();
				int u = User.verifyUser(name, pass);

				if (u != -1) {


					User user = new User() ;
					user = user.userList[u];
					System.out.println("\n\nNice to meet you " + name + "\n\n");



					do {

						System.out.println("\nMain Menu:\n");

						System.out.println("\n1. Track Activity :");
						System.out.println("\n2. Log Nutrition :");
						System.out.println("\n3. Monitor Sleep :");
						System.out.println("\n4. Hydration Tracker :");
						System.out.println("\n5. Mood Tracker :");
						System.out.println("\n6. View Progress :");
						System.out.println("\n0. Log Out :");

						choice2 = sc.nextInt();

						switch (choice2) {

						case 1 :

							// Activity Tracker
							System.out.println("Activity Tracker:\n");
							System.out.print("Enter activity type:\n");
							String activityType = sc.next();
							System.out.print("Enter duration (minutes): ");
							float duration = sc.nextFloat();

							user.trackActivity(activityType ,  duration);
							System.out.println("Activity logged successfully!\n");



							break ;

						case 2 :

							// Nutrition Diary
							System.out.println("Nutrition Diary:\n");
							System.out.print("Enter meal type: ");
							String mealType = sc.next();
							System.out.print("Enter food item: ");
							String foodItem = sc.next();
							System.out.print("Enter quantity (grams): ");
							float quantity = sc.nextFloat();

							user.logNutrition( mealType,  foodItem,  quantity);
							System.out.println("Nutrition logged successfully!\n");

							break ;

						case 3 :



							// Sleep Monitoring
							System.out.println("Sleep Monitoring:\n");
							System.out.print("Enter bedtime: ");
							String bedTime = sc.next();
							System.out.print("Enter wake-up time: ");
							String wakeUpTime = sc.next();
						
							user.monitorSleep( bedTime ,  wakeUpTime) ;
							System.out.println("Sleep logged successfully!\n");


							break ;

						case 4 :


							// Hydration Tracker
							System.out.println("Hydration Tracker:\n");
							System.out.print("Enter amount of water consumed (ounces): ");
							float waterConsumed = sc.nextFloat();

							user.hydrationLevel( waterConsumed );
							System.out.println("Hydration logged successfully!\n");

							break ;

						case 5 :


							// Mood Tracker
							System.out.println("Mood Tracker:\n");
							System.out.print("Enter mood: ");
							String mood = sc.next();

							user.moodTracker( mood) ;
							System.out.println("Mood logged successfully!\n");


							break ;

						case 6 :
                            user.progress();

							break ;

						default :


							break ;



						}

					} while (choice2 == 0) ;




				} else {


					System.out.println("\nPlease first Register or Sign up -> \n");
					break;


				}


				break;

			case 2:
				System.out.println("\n Enter UserName : \t");
				String newUserName = sc.next();
				System.out.println("\n Enter Password : \t");
				String newUserPassword = sc.next();
				User newUser = new User(newUserName, newUserPassword);
				newUser = null ; // Display user details
				//	newUser.progress();


				break;


			default :

				break ;
			}


		} while (choice1 != 0);
	}
}










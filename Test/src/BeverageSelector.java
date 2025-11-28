import java.util.Scanner;

// Call the script BeverageSelector
public class BeverageSelector {

	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		//declare variables		
		String order = null;
		int bevvy;
	
		//The customer (user) will enter a number to choose one of three beverages. The choices are: (1) Water, (2) Coke, (3) Coffee
		System.out.print("What'll ya have? Select 1 for water, 2 for coke, or 3 for coffee\n");
		//get order
		bevvy = in.nextInt();
			
		//get appropriate drink for number selected
			if(bevvy == 1) {
				order = "Water";
			} else if(bevvy == 2) {
				order = "Coke";
			} else if(bevvy == 3) {
				order = "Coffee";
			} else {
				System.out.println("Sorry, we only have three drinks and you have to choose the right button to order them. Please try again!");
			}
			//Have the user enter the number and then output the name of the corresponding beverage 
			System.out.print("Order up! " + order + " for ya, enjoy!");
	
		}	
}


import java.util.Scanner;

//Call the script Accumulator
public class Accumulator {

	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Pick a starting number");
		int i = in.nextInt();
		int sum = i;
		//The program will keep prompting the user for numbers, and when the user inputs a 0, it will print out the sum of all the numbers and stop
		
		//Use a while loop. 
		while(i!=0) {
			System.out.println("Pick another number");
			i = in.nextInt();
			sum+=i;
			
			System.out.println("Your total is now " + sum);
		}
		
		System.out.println("Your grand total is " + sum);
	}
}

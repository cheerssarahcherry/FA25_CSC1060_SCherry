import java.util.Scanner;

public class Divider {

	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		
		double num;
		double denom; 
		double answer;
		
		//Have the user enter two values (one at a time)
		//All the numbers input1, input2, and answer should have only two decimal places when printed in the message
		System.out.println("Input numerator\n");
			num = in.nextDouble();
		System.out.println("Input denominator\n");
			denom = in.nextDouble();
			
			answer = num/denom;
									
			//The input numbers will be floats. The answer will be a float. You should refuse to do the operation if the second number is 0. 
			if(denom == 0) {
				System.out.println("Please try again, and double check that you entered whole, non-zero numbers");
			}else{
				//Print the output “The answer is answer when you divide input1 by input2”.
				System.out.printf("The answer is %.2f when you divide %.2f by %.2f", answer, num, denom);
			}
		}
}

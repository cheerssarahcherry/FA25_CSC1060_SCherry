import java.util.Scanner;

public class calculate {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String result = null;
		
		System.out.println("Please enter your grade as a number:");
		double grade = in.nextDouble();
		if(grade>=92) {
			result = "A";
		}else if(89 <= grade && grade < 92) {
			result = "A-";		
		}else if(87 <= grade && grade < 89) {
			result = "B+";			
		}else if(82 <= grade && grade <87) {
			result = "B";
		}else if(79<=grade && grade <82) {
			result = "B-";		
		}else if(77<=grade && grade <79) {
			result = "C+";			
		}else if(72<=grade && grade <77) {
			result = "C";			
		}else if(69<=grade && grade <72) {
			result = "C-";			
		}else if(67<=grade && grade <69) {
			result = "D+";
		}else if(60<=grade && grade <67) {
			result = "D";
		}else if(0<=grade && grade <60) {
			result = "F";
		}else {
			result = "error. It is impossible to have a negative grade in this course. Please ensure the number entered is at least zero";
		}
		System.out.println("A grade of " +grade+ " is a(n) " +result+ ".");
	}

}

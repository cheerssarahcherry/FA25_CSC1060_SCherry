import java.util.Scanner;

public class calculator {		
	public static double calculateDiameter(double radius) {
	    return (2d*radius);
	}
	
	public static double calculateCircumference(double diameter) {
	    return (Math.PI*diameter);
	}
	
	public static double calculateArea(double radius) {
	    return (Math.PI*radius*radius);
	}		
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Input radius.");
		double radius = in.nextDouble();
		
		double diameter = calculateDiameter(radius);
		double circumference = calculateCircumference(diameter);
		double area = calculateArea(radius);

		System.out.println("Diameter:        "+diameter);
		System.out.println("Circumference:   "+circumference);
		System.out.println("Area:            "+area);
	}
}

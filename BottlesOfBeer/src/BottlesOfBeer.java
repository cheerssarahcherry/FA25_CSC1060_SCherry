import java.util.Scanner;

public class BottlesOfBeer {
	private static int initialBottles;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int bottlesToDrink = 0;
		
		System.out.println("How many bottles of beer are on your wall?");
		
		if(in.hasNextInt()) {
			bottlesToDrink = in.nextInt();
			if(bottlesToDrink<0) {
				System.out.println("Hard to drink negative beers! Try again");
				return;
			}
			
			initialBottles = bottlesToDrink;
			drinkBeerAndSing(bottlesToDrink);
		}else{
			System.out.println("Our beer drinking wall can only stock beers in whole beer integers.");
			return;
		}
	}
		

	public static void singVersePlural(int n) {
		System.out.println(n+ " bottles of beer on the wall, "+n+" bottles of beer");
		System.out.println("Take one down, pass it around, "+(n-1)+" bottles of beer on the wall!");
	}
	
	public static void singVerseTwo(int n) {
		System.out.println(n+ " bottles of beer on the wall, "+n+" bottles of beer");
		System.out.println("Take one down, pass it around, only "+(n-1)+" more bottle of beer on the wall!");
	}
	
	public static void singVerseSingle(int n) {
		System.out.println("One bottle of beer left, one bottle of beer");
		System.out.println("Take it down, pass it around, no more bottles of beer on the wall!");
	}
	
	public static void singVerseZero(int n) {
		System.out.println("No bottles of beer on the wall, no bottles of beer. Go to the store to buy some more, " +initialBottles+ " bottles of beer on the wall!");
	}
	
	public static void drinkBeerAndSing(int n) {
		if (n==0) {
			singVerseZero(n);
			return;
		}else if(n==1) {
			singVerseSingle(n);
			drinkBeerAndSing(n-1);
		}else if(n==2){
			singVerseTwo(n);
			drinkBeerAndSing(n-1);
		}else {
			singVersePlural(n);
			drinkBeerAndSing(n-1);
		}
	}
}

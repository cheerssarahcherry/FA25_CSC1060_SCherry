import java.util.Scanner;

public class Dubloon {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// A word is a dubloon if every letter appears twice
		System.out.println("Enter the word:");
		String word = input.next();
		
		isDubloon(word);
	}
	
	private static boolean isDubloon(String word) {
		int count;
		for(int i=0; i<word.length();i++) {
			count=0;
			for(int j=0;j<word.length();j++) {
				char one = word.charAt(i);
				char two = word.charAt(j);
				if(one == two)
				{
					count++;
				}
			}
			if(count != 2)return false;
		}
		return true;
	}
}
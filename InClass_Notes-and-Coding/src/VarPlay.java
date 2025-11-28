
public class VarPlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a;
			int b;
			//declaring ints
			//we have not initialized yet
			
			//lets initialize!
			a = 1;
			b = a + 1;
			
			//we can do that when we declare
			int c = 5 + a - b;
			
			System.out.println(a);
			
			a = a + 874;
			System.out.println(a);
			
			//ints are 32 bits long!
			//00000000  00000000  00000000  00000000
			
			float f = 1.1f;
			//64 bits
			
			double d = 2.2;
			//128 bits
			
			System.out.println(f*10);
			System.out.println(f+f+f+f+f+f+f+f+f+f);
			//curious...I wonder why this happens?
			//summary: numbers are int, float, double.
			
			System.out.println(d + a);
			
			//Moving on...
			char ch = 'a';
			//char is a primitive type - it's 
			
			String word = "toooooooooooooooooooooooo";
			String word2 = "much";
			//String is capitalized!!!! it's a class!!!
			//you can use different functionality by typing word. and it will pull up options
			//a string in quotes is called string literal
			
			System.out.println(word + 2);
			//prints 22 because it's the character 2 not int
			//System.out.println(Integer.parseInt(word)+2+ " Now it's math! Isn't this cool?!");
			//now it's using the same info from the same place but reparsing as an int instead of string
			
			
			//let's do some concatenating...
			System.out.println(word + " " + word2);
			
			//now some logic!
			boolean bool = true;
			bool = !bool;
			System.out.println("" + bool + " " + !bool);
			if(bool) System.out.println("all good!");
				else System.out.println("oh yikes");
			
			System.out.println(word + " has " + word.length() + " letters");
			
			if(word.equals(word2)) System.out.println("all good!");
				else System.out.println("not equal, so sad");
			
			
			
			
			
			
			
			//Moving on to operators
			if(c % 2 == 0) System.out.println("C is so getting even");
				else System.out.println("c is odd...like, really odd");
			
			if(a % 2 != 0) System.out.println("soooo odd");
			
			
	}

}

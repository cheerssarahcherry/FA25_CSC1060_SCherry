import java.util.Scanner;

public class Bookwork 
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		String fruit = "banana ";
		
		for(int i=0; i < fruit.length(); i++) 
		{
			System.out.println(fruit.charAt(i));
		}
		
			char first = fruit.charAt(0);
			char last = fruit.charAt(fruit.length()-2);
		
		
		String firstHalf = fruit.substring(0, fruit.length()/2);
		String lastHalf = fruit.substring(fruit.length()/2);

			System.out.printf("%s, %s, %s, %s", first, last, lastHalf, firstHalf);
		
		int index = fruit.indexOf("a");
			System.out.println(index);
		int index2 = fruit.indexOf("ana ");
			System.out.println(index2);
		
		String course = "java";
		
			char letter = course.charAt(0);
		
			if(letter=='A');
		{
			System.out.println("the best grade");
		}
		
		//System.out.println("Enter a word");
		//String word = input.next();
		
		//if(word == "hello")
		//{
			//System.out.println("You got it!");
		//}else{
		//System.out.println("womp womp");
		//}
		
		String lady = "Ada Lovelace";
		String man = "Alan Turing";
		if(lady.compareTo(man)<0)
		{
			System.out.println(lady);
		}else {
			System.out.println(man);
		}
		System.out.println(lady.compareTo(man));
		System.out.println(man.compareTo(lady));
			
		String newWord = String.format("%s %s %s", man, lady);
			System.out.println(newWord);

	}
		
}
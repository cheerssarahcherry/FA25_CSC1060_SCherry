import java.util.Scanner;

public class Loops {
	
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		//initialize first
		int num = 10;
		//give condition
		while(num > 0) {
			System.out.println(num);
			//change condition
			num = num - 1;
			// or num--;
			
		}
		System.out.println("Blast off!");
		
		//another way to do it
		for(int i=10; i>0; i--) {
			System.out.println(i);
			//try {
				//Thread.sleep(500);
			//}
			//catch{
				
			//}
		}
		System.out.println("Blast off again!!!");
		
		System.out.println("Enter rows");
		int rows = input.nextInt();
		System.out.println("Enter columns");
		int cols = input.nextInt();
		
		for(int i = 1; i<= rows; i++)
		{
			
			for(int j = 1; j <= cols; j++) 
			{
				System.out.printf("%4d", i * j);
			}
			System.out.println("\n");
		}
		for(char c='A';c<='Z';c++) {
			System.out.print(c);
		}
		
		System.out.println("\n\nGreek Alphabet");
		for(int i = 913; i <=937; i++) {
			System.out.print((char)i);
		}
	}

}

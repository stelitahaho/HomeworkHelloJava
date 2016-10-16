import java.util.Scanner;

public class NtiSymbol {

	public static void main(String[] args) {
			Scanner test = new Scanner(System.in);
			
			System.out.println("Please enter a string: ");
			String word = test.nextLine();
			
			System.out.println("Which symbol are you looking for");
			int n = test.nextInt();
					
			System.out.print("The N symbol of the string is: ");
			System.out.print(word.charAt(n));

	}

}

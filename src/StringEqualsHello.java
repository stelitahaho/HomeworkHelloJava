import java.util.Scanner;

public class StringEqualsHello {

	public static void main(String[] args) {
		Scanner test = new Scanner (System.in);
		
		System.out.println("Please enter a string: ");
		String word1 = test.nextLine();
		System.out.println();
		String word2 = "Hello";
						
				boolean oneEqualsTwo = word1.equals(word2);
				System.out.print("String equals Hello ? : ");
				System.out.println(oneEqualsTwo);
         

	}

}

import java.util.Scanner;

public class OneContainsTwo {

	public static void main(String[] args) {
		Scanner test = new Scanner (System.in);
		
		System.out.println("Please enter a string:");
		String word1 = test.nextLine();
		
		System.out.println("Please enter another string:");
		String word2 = test.nextLine();
						
				boolean oneContTwo = word1.contains(word2);
				System.out.print("one contains two? : ");
				System.out.println(oneContTwo);
         
       
	}

}

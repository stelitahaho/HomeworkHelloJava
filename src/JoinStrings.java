import java.util.Scanner;

public class JoinStrings {

	public static void main(String[] args) {
		Scanner test = new Scanner(System.in);

        System.out.println("Please enter a word: ");
        String word1 = test.nextLine();

        System.out.println("Please enter a word: ");
        String word2 = test.nextLine();

        System.out.println(word1 + "_" + word2);
        
	}

}

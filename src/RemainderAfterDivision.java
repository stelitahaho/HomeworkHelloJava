import java.util.Scanner;

public class RemainderAfterDivision {

	public static void main(String[] args) {
		Scanner test = new Scanner(System.in);

        System.out.print("Please enter an integer:");
        int a = test.nextInt();
        
        test.nextLine();
        System.out.print("Please enter an integer:");
        int b = test.nextInt();
        int remainder = a % b;

        System.out.println("The Remainder after division is: " + remainder);
              
        test.close();

	}

}

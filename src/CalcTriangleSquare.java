import java.util.Scanner;

public class CalcTriangleSquare {

	public static void main(String[] args) {
		Scanner test = new Scanner(System.in);

        System.out.print("Please enter an integer:");
        int a = test.nextInt();
        
        test.nextLine();
        System.out.print("Please enter an integer:");
        int ha = test.nextInt();
        int square = (a * ha)/2;

        System.out.println("The TriangleSquare is: " + square);
              
        test.close();
	}

}

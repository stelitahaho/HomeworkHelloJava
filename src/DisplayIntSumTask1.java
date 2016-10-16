import java.util.Scanner;

public class DisplayIntSumTask1 {

	public static void main(String[] args) {
		Scanner test = new Scanner(System.in);

        System.out.print("Please enter an integer:");
        int numInt1 = test.nextInt();
        
        test.nextLine();
        System.out.print("Please enter another integer:");
        int numInt2 = test.nextInt();
        int sum = numInt1 + numInt2;

        System.out.println("The sum is: " + sum);
              
        test.close();

	}

}

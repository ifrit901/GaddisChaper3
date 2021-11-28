package ch3java6thedition;
import java.util.Scanner;
/**
 * Write nested if statements that perform the following tests:
 * If 'amount1' is greater than 10, and 'amount2' is less than
 * 100, display the greater of the two.
 * @author craig
 */
public class Ch3_Prog_Chal_5 {
	public static void main (String [] args) {	
		// Create some variables 
		int 	amount1,
			amount2;

		// Create an object of the Scanner class
		Scanner input = new Scanner(System.in);

		// Ask user for input
		System.out.println("Gimme a number between 0 - 100. \n" );
		amount1 = input.nextInt();

		System.out.println("And now one more number between 0 - 100");
		amount2 = input.nextInt();

		// Manipulate variables with nested if statements
		if (amount1 > 10) 
		{
			if (amount2 < 100)
			{
				if (amount1 > amount2)
					System.out.println(amount1);
				else 
					System.out.println(amount2);
			}
		}
	}	
}

package ch3java6thedition;
import java.util.Scanner;
/**
 * 
 * This is from algorithm workbench, not programming challenges.
 * Convert the following if-else-if statement into a switch statement.
 * if (choice == 1)
 * {
 * 	System.out.println("You selected 1.")
 * }
 * else if (choice == 2 || choice == 3)
 * {
 * 	System.out.println("You selected 2 or 3.")
 * }
 * else if (choice == 4)
 * {
 * 	System.out.println("You selected 4.")
 * }
 * else
 * {
 * 	System.out.println("Please select again.")
 * }
 * 
 * @author craig
 */
public class Ch_3_Prog_Chal_10 {
	public static void main (String [] args) {
		// Reserve memory for variable choice
		int choice;

		// Create an object of the Scanner class
		Scanner input = new Scanner(System.in);

		// Prompt user for 'choice' variable
		System.out.println("Choose a number 1 - 4.");

		// Assign user input to 'choice' variable
		choice = input.nextInt();

		// Create switch statement based on user input for 'choice'
		switch (choice)
		{
			case 1:
				System.out.println("You selected 1.");
				break;
			case 2:
			case 3:
				System.out.println("You selected 2 or 3.");
				break;
			case 4:
				System.out.println("You selected 4.");
			default:
				System.out.println("Please make a valid choice.");
		}
	}	
}

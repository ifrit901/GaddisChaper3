package ch3java6thedition;
import java.util.Scanner;

/**
 * Write an if statement that prints the message "The number is not valid"
 * if the variable hours is outside the range 0 - 80. 
 * @author craig
 */
public class Ch3_Prog_Chal_8 {
	public static void main (String [] args) {
		// Create a variable for 'hours'
		int hours;

		// Create an object of the Scanner class
		Scanner input = new Scanner(System.in);

		// Prompt the user for 'hours'
		System.out.println("How many hours did you work this week?");

		hours = input.nextInt();

		if (hours <= 0 || hours >= 80)
		{
			System.out.println("The number is not valid.");
		}
	}	
}

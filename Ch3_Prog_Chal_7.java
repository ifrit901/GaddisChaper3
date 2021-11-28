package ch3java6thedition;
import java.util.Scanner;
/**
 * Write an if statement that prints the message "The number is valid"
 * if the variable 'temperature' is within the range -50 - 150.
 * @author craig
 */
public class Ch3_Prog_Chal_7 {
	public static void main (String [] args) {
		// Create variable
		int temperature;

		// Create an object of the Scanner class
		Scanner input = new Scanner(System.in);

		// Prompt user for input
		System.out.println("What is the temperature?");

		temperature = input.nextInt();

		// Create if statement to test user input
		if (temperature >= -50 && temperature <= 150)
		{
			System.out.println("The number is valid.");
		}
	} 
}

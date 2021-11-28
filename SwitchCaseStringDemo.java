package ch3java6thedition;
import java.util.Scanner;
/**
 * This program demonstrates the switch case using a String.
 * It will take the String and translate it from English to Spanish.
 * @author craig
 */
public class SwitchCaseStringDemo {
	public static void main (String [] args) {
		
		String input;     // Variable for string input

		// Create an object of the Scanner class 
		Scanner keyboard = new Scanner(System.in);

		// Get the name of a season from the user.
		System.out.println("Enter the name of a season in English.");
		
		// Assign user input to the keyboard Scanner object
		input = keyboard.nextLine();

		// Translate the input with a switch statement
		switch (input)
		{
			case "spring":
			case "Spring":
				System.out.println("la primevera");
				break;
			case "summer":
			case "Summer":
				System.out.println("el verano");
				break;
			case "fall":
			case "Fall":
				System.out.println("el otono");
				break;
			case "winter":
			case "Winter":
				System.out.println("el invierno");
				break;
			default:
				System.out.println("Please enter thte name of a valid season...");
		}


	}	
}

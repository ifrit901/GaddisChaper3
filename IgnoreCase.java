package ch3java6thedition;
import java.util.Scanner;

/**
 * This demonstrates the Ignore case methods so you can 
 * have a case insensitive String comparison.
 * @author craig
 */
public class IgnoreCase {
	public static void main (String [] args) {
		String input;    // To hold user input

		// Create and object of the Scanner class
		Scanner keyboard = new Scanner(System.in);

		// Prompt the user for the password
		System.out.println("What's the magic word?");
		
		input = keyboard.nextLine();

		// Determine whether the user has inputed the 
		// magic word
		if (input.equalsIgnoreCase("TIMEENOUGHFORLOVE"))
		{
			System.out.println("That's correct! You are granted" +
				" access.");
		}
		else 
		{
			System.out.println("That's not the magic word :(");
		}

		/*
		This portion is for some of the chapter checkpoints.
		Write and if statement that prints two String objects
		in alphabetical order.
		*/ 

		String name1 = "John", 
			name2 = "Brenda";

		if (name1.compareTo(name2) < 0) 
		{
			System.out.println(name1 + "\n" + name2);
		}
		else
		{
			System.out.println(name2 + "\n" + name1);
		}

		/*
		Write an if statement that performs a case insensitive 
		comparison of a string.
		*/

		String name3 = "Timothy";

		if (name3.equalsIgnoreCase("timothy"))
		{
			System.out.println("\nDo I know you?"); 
		} 
		else 
		{ 
			System.out.println("I definitely don't know you."); 
		}

		// Next checkpoint
		// a.	
		System.out.println("\nRewrite the following if-else statements as " +
			"statements \n that use the conditional operator.\n" + 
			"a. if (x > y)\n\tz = 1;\nelse\n\tz = 20;");
	
		System.out.println("\nz = (x > y) ? 1 : 20;");
		
		// b.
		System.out.println("\nb. if (temp > 45)\n\tpopulation = base * 10;" +
			"\nelse\n\tpopulation = base * 2;\n\n"+
			"population = (temp > 45) ? (base * 10) : (base * 2);\n");
	}	
}

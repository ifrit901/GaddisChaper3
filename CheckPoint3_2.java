package ch3java6thedition;
import java.util.Scanner;
/**
 * Complete a switch statement that prints one, two , or
 * three according to which digit the user enters. If something
 * other than these choices is made, it should display an
 * error message.
 * 
 * @author craig
 */
public class CheckPoint3_2 {
	public static void main (String [] args) {
		// 3.24
		int userNum;
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter 1, 2, or 3:");

		userNum = keyboard.nextInt();

		switch (userNum)
		{
			case 1:
				System.out.println("You entered one.");
				break;
			case 2:
				System.out.println("You entered two.");
				break;
			case 3:
				System.out.println("You entered three.");
				break;
			default:
				System.out.println("Please enter 1, 2, or 3.\n\n\n");
		}

		// 3.25
		Scanner letter = new Scanner(System.in);		
		String input;
		System.out.println("Enter A, B, or C.");

		char choice;

		input = letter.nextLine();
		choice = input.charAt(0);

		switch (choice)
		{
			case 'A':
			case 'a':
				System.out.println("You selected A.");
				break;
			case 'B':
			case 'b':
				System.out.println("You entered B.");
				break;
			case 'C':
			case 'c':
				System.out.println("You entered C.");
				break;
			default:
				System.out.println("You're not good with letters, are you?");
		}

		// 3.26
		/*

		if (temp == 100)
			x = 0;
		else if (population > 100)
			x = 1;
		else if (rate < .1)
			x = -1;

		I think there are three reasons this code cannot be converted to 
		a switch statement. First, it uses three different variables in 
		the condition statements. (temp, population, and rate).
		Second, it uses < and > comparisons
		rather than just equivilance == in the conditional statements. 
		Third,
		the values in the conditional statements are not all of the same
		data type. Some are integers and one is a double.
		*/
		
		// 3.27

		/* 
		switch (temp)
		{
		case temp < 0:
			System.out.println("The temperature is negative.");
			break;
		case temp = 0:
			System.out.println("The temperature is zero.");
			break;
		case temp > 0:
			System.out.println("The temperature is positive.");

		This code is wrong by stating the variable in the case line,
		and for using boolean expressions instead of value 
		statements.
		*/
	}	
}

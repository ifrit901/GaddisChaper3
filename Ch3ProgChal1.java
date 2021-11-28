package ch3java6thedition;
import javax.swing.JOptionPane;     // Ferda boxes. This chapter introduces 
				    // the use of JOptionPane boxes for input
				    // so I'm using them instead of the typical
				    // Scanner object input style.
/**
 * This is the beginning of the real programming challenges from chapter 3,
 * sorry about misnaming the one's from the algorithm workbench..
 *
 * Write a program that prompts the user to enter a number between one and 
 * ten. The program should display the Roman numeral version of that number.
 * If the number is outside the range of 1 - 10, the program should 
 * display an error message.
 * @author craig
 * 
 */
public class Ch3ProgChal1 {
	public static void main (String [] args) {
		// Engage the user with a box 
		JOptionPane.showMessageDialog(null, "Hello, User!");

		// Create a variable for String input and a number
		String input;
		int number;

		// Use a box to ask for and accept a number 1 - 10
		input = JOptionPane.showInputDialog(null, "Enter a number 1 - 10:");
		number = Integer.parseInt(input);

		// Create an if statement that displays an error if the user 
		// enters something besides 1 - 10
		if (number < 1 || number > 10)
		{
			JOptionPane.showMessageDialog(null, "You entered an invalid number");
		}
	System.exit(0);
	}
}

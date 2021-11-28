package ch3java6thedition;
import javax.swing.JOptionPane;
/**
 * A bank charges a base fee of $10 per month, plus the following charges for 
 * a commercial checking account:
 * 
 * $.10 each for less than 20 checks
 * $.08 each for 20-39 checks
 * $.06 each for 40-59 checks
 * $.04 each for 60 or more
 * 
 * Write a program that asks for the number of checks written for the month.
 * The program should then calculate and display the bank's service fees for 
 * the month.
 * 
 * @author craig
 */
public class BankCharges {
	public static void main (String [] args) {
		// Variables
		final double BASE_FEE = 10.00;
		int numberOfChecks;
		double checkPrice,
			totalCharge;
		String input;

		// Greet user with a box
		JOptionPane.showMessageDialog(null, 
			"Hello! I'm going to your bank's service charges for this month.");

		// Prompt user for number of checks written during the month
		input = JOptionPane.showInputDialog(null, 
			"How many checks did you write this month?");

		// Parse input to an int
		numberOfChecks = Integer.parseInt(input);

		// Create if-else if statements for different ranges of checks written
		if (numberOfChecks < 20)
		{
			checkPrice = .1;
			totalCharge = BASE_FEE + (checkPrice * numberOfChecks);
			JOptionPane.showMessageDialog(null, 
				"The total service charges for this month are $"
			+ String.format("%,.2f", totalCharge));
		}
		else if (numberOfChecks >= 20 && numberOfChecks < 40)
		{
			checkPrice = .08;
			totalCharge = BASE_FEE + (checkPrice * numberOfChecks);
			JOptionPane.showMessageDialog(null, 
				"The total service charges for this month are $"
			+ String.format("%,.2f", totalCharge));
		}
		else if (numberOfChecks >= 40 && numberOfChecks < 60)
		{
			checkPrice = .06;
			totalCharge = BASE_FEE + (checkPrice * numberOfChecks);
			JOptionPane.showMessageDialog(null, 
				"The total service charges for this month are $"
			+ String.format("%,.2f", totalCharge));
		}
		else if (numberOfChecks > 60)
		{
			checkPrice = .04;
			totalCharge = BASE_FEE + (checkPrice * numberOfChecks);
			JOptionPane.showMessageDialog(null, 
				"The total service charges for this month are $"
			+ String.format("%,.2f", totalCharge));
		}
		else
			JOptionPane.showMessageDialog(null, "Invalid input.");
	}
}

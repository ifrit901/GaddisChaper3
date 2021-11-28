package ch3java6thedition;
import javax.swing.JOptionPane;
/**
 * This is another instance of the loan qualifier program that 
 * previously demonstrated nested if statements. At least that
 * is the type of coding that this example purports to simplify.
 * This program will demonstrate the use of the logical && operator.
 * @author craig
 */
public class CodeListing3_7 {
	public static void main (String [] args) {
		// Create some variables
		double salary;       // Annual salary
		int yearsOnJob;      // Years on the job
		String input;         // To hold text(string) input

		// Prompt user for salary
		input = JOptionPane.showInputDialog(null, "What is your yearly salary?");
		salary = Double.parseDouble(input);

		// Prompt user for years on the job
		input = JOptionPane.showInputDialog(null, "How many years have you " +
			"been at your current job?");
		yearsOnJob = Integer.parseInt(input);

		// Use logical AND operator to determine user eligibility
		if (salary > 30000 && yearsOnJob > 2) 
		{
			JOptionPane.showMessageDialog(null, "You qualify for the loan!");	
		}
		else 
			JOptionPane.showMessageDialog(null, "You do not qualify for the loan.");

		System.exit(0);
	}	
}

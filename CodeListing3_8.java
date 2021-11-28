package ch3java6thedition;
import javax.swing.JOptionPane;     // Needed for JOptionPane class
/**
 * This program demonstrates the logical OR (||) 
 * operator.
 * @author craig
 */
public class CodeListing3_8 {
	public static void main (String [] args) {
		// Create variables 
		double salary;       // Yearly salary
		int yearsOnJob;      // Years on job
		String input;        // To hold string input

		// Prompt user for salary
		input = JOptionPane.showInputDialog(null, "What is your yearly salary?");
		salary = Double.parseDouble(input);

		// Prompt user for years on the job
		input = JOptionPane.showInputDialog(null, "How many years have you " +
			"been on the job?");
		yearsOnJob = Integer.parseInt(input);

		// Create decision tree based on exclusion criteria
		if (salary > 30000 || yearsOnJob > 2)
		{
			JOptionPane.showMessageDialog(null, "You qualify for the loan.");
		}
		else
			JOptionPane.showMessageDialog(null, "You do not qualify for " +
				"for the job.");
		
		System.exit(0);
	}	
}

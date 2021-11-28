package ch3java6thedition;
import javax.swing.JOptionPane;

/**
 * This is an example in the 3rd chapter exemplifying nested if 
 * statements.
 * @author craig
 */
public class Ch3Java6thEdition {
	public static void main(String[] args) {
		// Create variables
		int yearsOnJob;
		double salary;
		String input;

		// Greet user and ask for input
		JOptionPane.showMessageDialog(null, ("Hello! I'm the Loan Calculator. " +
		"Answer my questions \n" +
		"and I'll tell you if you qualify for a loan or not.\n")); 

		// Determine the user's salary
		input = JOptionPane.showInputDialog("Enter your annual salary:");
		salary = Double.parseDouble(input); 

		// Determine years on the job
		input = JOptionPane.showInputDialog("How many years have you been " +
			"on the job?\n");
		yearsOnJob = Integer.parseInt(input);

		if (salary >= 30000) {
			if (yearsOnJob >= 2) {
				JOptionPane.showMessageDialog(null, "You qualify " + 
					"for the loan.");
			}

			else {
				JOptionPane.showMessageDialog(null, "You must have" +
					" been at your job for 2 or more years.");
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "You must make at least " +
				"$30,000 a year to qualify.");	
		}

		System.exit(0);
	}
	
}

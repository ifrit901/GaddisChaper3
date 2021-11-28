package ch3java6thedition;
import javax.swing.JOptionPane;
/**
 * An Internet Service Provider has three different subscription packages 
 * for it's customers: 
 * 
 * Package A:	For $9.95 a month 10 hours of access are provided. Additional
 * 		hours are $2.00 per hour.
 * 
 * Package B:   For $13.95 a month 20 hours of access are provided. Additional
 * 		hours are $1.00 per hour.
 * 
 * Package C:   For $19.95 a month unlimited access is provided.
 * 
 * Write a program that calculates a customer's monthly bill. It should ask 
 * the user to enter the letter of the package the customer has purchased
 * (A, B, or C) and the number of hours that were used. It should then 
 * display the total charges.
 * 		
 * @author craig
 */
public class InternetServiceProvider {
	public static void main (String [] args) {
		// Variables
		char service;

		int hours;

		double totalCost;

		String input;

		// Greet the user and let them know what's going on
		JOptionPane.showMessageDialog(null, "Hello! I'm going to calculate the "+
			"cost of your internet\n"+
			"bill for this month depending on which plan you choose.");

		// Display the plans to the user and prompt them for a choice
		input = JOptionPane.showInputDialog(null, "The internet plans are as follows:\n"+
			  "Package A:   For $9.95 a month 10 hours of access are provided.\n"+
			  "                      Additional hours are $2.00 per hour.\n\n"+
			  "Package B:   For $13.95 a month 20 hours of access are provided.\n"+
			  "                      Additional hours are $1.00 per hour.\n\n" +
			  "Package C:   For $19.95 a month unlimited access is provided.\n\n"+
			  "Choose a plan by entering \"A\", \"B\", or \"C\".");
		service = input.charAt(0);  // Convert user input to char for switch case

		// Prompt user to enter the number of hours they used the service this month
		input = JOptionPane.showInputDialog(null, "How many hours of service did you use this month?");
		hours = Integer.parseInt(input);

		// Create switch case 
		switch (service)
		{
			case 'a':
			case 'A':
			{
				if (hours <= 10)
				{
					JOptionPane.showMessageDialog(null, 
						"Your internet bill for this month is $9.95.");
					break;
				}
				else
				{
					totalCost = 2.0 * (hours - 10);
					JOptionPane.showMessageDialog(null, 
						"Your internet bill for this month is $" + (totalCost + 9.95));
					break;
				}
			}
			case 'b':
			case 'B':
			{
				if (hours <= 20)
				{
					JOptionPane.showMessageDialog(null, 
						"Your internet bill for this month is $13.95.");
					break;
				}
				else
				{
					totalCost = 1.0 * (hours - 20);
					JOptionPane.showMessageDialog(null, 
						"Your internet bill for this month is $" + (totalCost + 13.95));
					break;
				}
			}
			case 'c':
			case 'C':
			{
				JOptionPane.showMessageDialog(null, 
					"Your internet bill for this month is $19.95");
				break;
			}
			default:
			{
				JOptionPane.showMessageDialog(null, "Invalid input!");
				break;
			}
			
		}
	}	
}

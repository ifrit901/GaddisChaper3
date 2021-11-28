package ch3java6thedition;
import javax.swing.JOptionPane;
/**
 * Modify the program you wrote for programming challenge 13 so that it also 
 * calculates and displays the amount of money Package A customers would save
 * if they purchased Package B or C, and the amount of money Package B
 * customers would save if they purchased Package C. If there would be no 
 * savings, the program should display no messages.
 * 
 * @author craig
 */
public class InternetServiceProviderPt2 {
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
					if ((totalCost + 9.95) > ((1.0 * (hours - 20) + 13.95)))
					{
						JOptionPane.showMessageDialog(null, 
							"If you had purchased Package B you would " +
						" have saved $"  + String.format("%.2f", 
							(totalCost + 9.95) - (1.0 * (hours - 20) + 13.95)) +
						" dollars.");
						JOptionPane.showMessageDialog(null, 
						"If you purchased Package C you would have saved $" 
							+ String.format("%.2f",(totalCost + 9.95) - 19.95 ) + " dollars.");
					}
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
						"Your internet bill for this month is $" 
							+ (totalCost + 13.95));
					if ((totalCost + 13.95) > 19.95)
					JOptionPane.showMessageDialog(null, "If you had chosen Package C " +
						" you would have saved $" 
						+ String.format("%.2f", (totalCost + 13.95) - 19.95));
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

	


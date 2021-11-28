package ch3java6thedition;
import javax.swing.JOptionPane;     // Ferda (for the) boxes
/**
 * The date June 10, 1960, is special when we write it in the following format,
 * the month times the day equals the year:
 * 6/10/60
 * Write a program that asks the user to enter a month (in numeric form) a day,
 * and a two digit year. The program should then determine whether the month 
 * times the day is equal to the year. If so, it should display a message 
 * saying the date is magic. Otherwise, it should display a message saying it 
 * is not magic.
 * @author craig
 */
public class Ch3MagicDates {
	public static void main (String [] args) {
		// Create int variables for the numbers and a String
		// variable for the box input
		String input;
		int     day,
			month,
			year;

		// Engage the user with a box that explains what's happening
		JOptionPane.showMessageDialog(null, "Hello, User!\n" +
			"Enter a numeric month, day, and two digit\n" +
			"year and I'll tell you if it's a magic date or not.");

		// More boxes for input
		input = JOptionPane.showInputDialog(null, "Enter a day:");
		day = Integer.parseInt(input);

		input = JOptionPane.showInputDialog(null, "Enter a month:");
		month = Integer.parseInt(input);

		input = JOptionPane.showInputDialog(null, "Enter a 2 digit year:");
		year = Integer.parseInt(input);

		// Create an if statement that states if the date is magic or not
		if (year == (day * month))
		{
			JOptionPane.showMessageDialog(null, "This date is magic!");
		}
		else
			JOptionPane.showMessageDialog(null, "This date isn't magic :(");

	System.exit(0);
	}	
}

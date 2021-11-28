package ch3java6thedition;
import javax.swing.JOptionPane;
/**
 * Write a program that asks the user to enter a number of seconds.
 * - There are 60 seconds in a minute. If the number of seconds entered
 *   by the user is greater than or equal to 60, the program should 
 *   display the number of minutes in that many seconds.
 * - There are 3600 seconds in an hour. If the number of seconds entered 
 *   by the user is greater or equal to 3600, the program should display 
 *   the number of hours in that many seconds.
 * - There are 86,400 seconds in a day. If the number of seconds entered 
 *   by the user is greater than or equal to 86,400, the program should 
 *   display the number of days in that many seconds.
 * 
 * @author craig
 */
public class TimeCalculator {
	public static void main (String [] args) {
		// Variables for user input
		int     seconds,
			minutes = 0,
			hours = 0,
			days = 0; 
		String input = "";

		// Display a box that asks the user for the number of seconds
		JOptionPane.showMessageDialog(null, "How's it goin'?\n" +
			"Enter a number of seconds and I'll tell you\n" +
			"a bunch of stuff about it.");
		input = JOptionPane.showInputDialog(null, "Enter the number of seconds:");
		seconds = Integer.parseInt(input);

		// Create if statement to display versions of output based 
		// on input
		if (seconds >= 60 && seconds <= 3600) 
		{
			minutes = seconds / 60;	
			seconds %= 60;
			JOptionPane.showMessageDialog(null, "That time is " +
				minutes + " minute(s) and " + seconds + " seconds.");
		}
		else if (seconds >= 3600 && seconds <= 86400) 
		{
			hours = seconds / 3600;
			minutes = seconds / 60;
			seconds %= 60;
			JOptionPane.showMessageDialog(null, "That time is " + 
				hours + " hour(s)\n" + minutes + " minute(s)\n" + 
				"and " + seconds + " seconds.");
		}
		else if (seconds >= 86400)
		{
			days = seconds / 86400;
			minutes = seconds / 3600;
			seconds %= 60;
			JOptionPane.showMessageDialog(null, "That time is " + 
				days + " day(s)\n" + hours + " hour(s)\n" + minutes +
				" minute(s), and\n" + seconds + " seconds.");
		}
		System.exit(0);
	}
}

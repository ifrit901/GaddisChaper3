package ch3java6thedition;
import javax.swing.JOptionPane;
/**
 * Write a program that asks for the names of three runners and the time, 
 * in minutes, it took each of them to finish a race.
 * The program should display the names of the runners in the order that they finished.
 * 
 * @author craig
 */
public class RunningTheRace {
	public static void main (String [] args) {
		// Variables 
		int     time1,
			time2,
			time3;

		String  name1,
			name2,
			name3,
			input;

		// Prompt user for names
		name1 = JOptionPane.showInputDialog(null, "What's the name of the first runner?");

		name2 = JOptionPane.showInputDialog(null, "What's the name of the second runner?");

		name3 = JOptionPane.showInputDialog(null, "What's the name of the third runner?");
		   	
		// Prompt user for times
		input = JOptionPane.showInputDialog(null, "What was the time in minutes for runner #1?"); 
		time1 = Integer.parseInt(input);	

		input = JOptionPane.showInputDialog(null, "What was the time in minutes for runner #2?"); 
		time2 = Integer.parseInt(input);

		input = JOptionPane.showInputDialog(null, "What was the time in minutes for runner #3?"); 
		time3 = Integer.parseInt(input);

		if (time1 < time2 && time2 < time3)
		{
			JOptionPane.showMessageDialog(null, name1 + " is the winner with a time of " 
							+ time1 + " minutes,\n"+
							name2 + " came in second at " + time2 + " minutes,\n" +
							"and " + name3 + " in third place with a time of " 
							+ time3 + " minutes.");
		}
		else if (time2 < time1 && time1 < time3)
		{
			JOptionPane.showMessageDialog(null, name2 + " is the winner with a time of " 
							+ time2+ " minutes,\n"+
							name1 + " came in second at " + time1 + " minutes,\n" +
							"and " + name3 + " in third place with a time of " 
							+ time3 + " minutes.");
		}
		else if (time3 < time1 && time1 < time2)
		{
			JOptionPane.showMessageDialog(null, name3 + " is the winner with a time of " 
							+ time3+ " minutes,\n"+
							name1 + " came in second at " + time1 + " minutes,\n" +
							"and " + name2 + " in third place with a time of " 
							+ time2 + " minutes.");
		}
		else if (time1 < time3 && time3 < time2)
		{
			JOptionPane.showMessageDialog(null, name1 + " is the winner with a time of " 
							+ time1+ " minutes,\n"+
							name3 + " came in second at " + time3 + " minutes,\n" +
							"and " + name2 + " in third place with a time of " 
							+ time2 + " minutes.");
		}
		else if (time2 < time3 && time3 < time1)
		{
			JOptionPane.showMessageDialog(null, name2 + " is the winner with a time of " 
							+ time2+ " minutes,\n"+
							name3 + " came in second at " + time3 + " minutes,\n" +
							"and " + name1 + " in third place with a time of " 
							+ time1 + " minutes.");
		}
		else if (time3 < time2 && time2 < time1)
		{
			JOptionPane.showMessageDialog(null, name3 + " is the winner with a time of " 
							+ time3 + " minutes,\n" + 
							name2 + " came in second at " + time2 + " minutes,\n" +
							"and " + name1 + " in third place with a time of " 
							+ time1 + " minutes.");
		}
		
	}	
}

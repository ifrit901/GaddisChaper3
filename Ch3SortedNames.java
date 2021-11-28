package ch3java6thedition;
import javax.swing.JOptionPane;
/**
 * Write a program that asks the user to enter three names, and then
 * displays the names sorted in ascending order. For example, if the 
 * user entered "Charlie", "Leslie", and "Andy", the program would display:
 * 
 * Andy
 * Charlie
 * Leslie
 * 
 * @author craig
 */
public class Ch3SortedNames {
	public static void main (String [] args) {
		// Create String variables
		String  name1,
			name2,
			name3;

		// Output a box that engages the user
		JOptionPane.showMessageDialog(null, "Hello! I'm here to rearrange your\n"+
			"list of three names in ascending alphabetical order.\n"+
			"I'll start by asking you for three names.");

		// Get input from user
		name1 = JOptionPane.showInputDialog(null, "What's the first name?");
		
		name2 = JOptionPane.showInputDialog(null, "What's the second name?");
		
		name3 = JOptionPane.showInputDialog(null, "What's the third name?");

		// Display the user input in ascending alpnabetical order
		if (name1.compareToIgnoreCase(name2) < 0)     
		{
			if(name1.compareToIgnoreCase(name3) < 0)
			{
				if (name2.compareToIgnoreCase(name3) < 0)
				{
					//Craig, Dylan, Sean
					JOptionPane.showMessageDialog(null, name1 + "\n" +
									    name2 + "\n" +
									    name3);
				}
				else
				{
					//Craig, Sean, Dylan
					JOptionPane.showMessageDialog(null, name1 + "\n" +
									    name3 + "\n" +
									    name2);
				}
			}
			else
			{
				// Dylan, Sean, Craig
				JOptionPane.showMessageDialog(null, name3 + "\n" +
								    name1 + "\n" +
								    name2);	
			}
		}
		else if (name2.compareToIgnoreCase(name1) < 0)    
		{
			if (name2.compareToIgnoreCase(name3) < 0) 	
			{
				if (name1.compareToIgnoreCase(name3) < 0)
				{
					// Dylan, Craig, Sean
					JOptionPane.showMessageDialog(null, name2 + "\n" +
								    	    name1 + "\n" +
								    	    name3);
				}
				else 
				{
					// Sean, Craig, Dylan
					JOptionPane.showMessageDialog(null, name2 + "\n" +
									    name3 + "\n" +
									    name1);
				}
			}
			else
			{
				// Sean, Dylan, Craig
				JOptionPane.showMessageDialog(null, name3 + "\n" +
								    name2 + "\n" +
								    name1);
					
			}
		}System.exit(0);	
	}	
}

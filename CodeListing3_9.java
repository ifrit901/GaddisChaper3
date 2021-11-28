package ch3java6thedition;
import javax.swing.JOptionPane;
/**
 * This demonstrates how to properly compare the contents
 * of two String objects using the equals method.
 * @author craig
 */
public class CodeListing3_9 {
	public static void main (String [] args) {
		// Create two String objects
		String name1 = "Mary",
			name2 = "Bob",
			name3 = "Bob";

		// Use if statements and the equals method to evaluate the 	
		// contents of the Strings. First, compare "Mary" and "Bob".
		if (name1.equals(name2))
		{
			JOptionPane.showMessageDialog(null, "The Strings \"Mary\"" +
				" and \"Bob\" are equal.");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "The Strings \"Mary\""+
				" and \"Bob\" are not equal.");
		}

		// Compare "Bob" and "Bob".
		if (name2.equals(name3))
		{
			JOptionPane.showMessageDialog(null, "The Strings \"Bob\" "+
				" and \"Bob\" are equal");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "The Strings \"Bob\"" +
				" and \"Bob\" are not equal.");
		}

		System.exit(0);
	}	
}

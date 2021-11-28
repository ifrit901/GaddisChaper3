package ch3java6thedition;
import javax.swing.JOptionPane;
/**
 * This program demonstrates applying the String.format to
 * arguments within a JOptionPane dialog box.
 * @author craig
 */
public class StringFormatArg {
	public static void main (String [] args) {
		// Create some double variables
		double monthlyPay = 5000.0,
			annualPay = monthlyPay * 12;

		// Dialog box for user output
		JOptionPane.showMessageDialog(null,
			String.format("Your annual pay is $%,.2f", annualPay));
		
		// Format the number 123456.789
		double num = 123456.789;
		JOptionPane.showMessageDialog(null, 
			String.format("The number with formatting is $%,.2f"
				,+ num));

		// Format this number to one decimal place, in a field that 
		// is ten spaces wide with no commas.
		double num2 = 123.456;
		JOptionPane.showMessageDialog(null, 
			String.format("The number with formatting is $%10.1f", num2));

		// Use the same number and format it with leading zeros in a 
		// field that is eight spaces wide.
		JOptionPane.showMessageDialog(null, 
			String.format("With leading zeros is $%08.1f", num2));

		// Format this new number in a 10 field space with commas.
		int number = 123456;
		JOptionPane.showMessageDialog(null, 
			String.format("Formatted, the number is $%,10d", number));

		// Format with left-justification, commas, 20 space field, 
		// rounded to two decimal places.
		double num3 = 123456.789;
		JOptionPane.showMessageDialog(null, 
			String.format("The number is $%-,20.2f\n" 
				+ "The other number is $%,10d", num3, number));

		// Format a String object in a 20 space field.
		String name = "James";
		JOptionPane.showMessageDialog(null, String.format("%20s", name));
	}
}

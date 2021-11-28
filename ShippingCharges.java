package ch3java6thedition;
import javax.swing.JOptionPane;
/**
 * The Fast Freight Shipping company charges the following rates:
 * 
 * Weight of Package                         Rate per 500 Miles Shipped
 * ____________________________________________________________________
 * 
 * 2 pounds or less                                           $1.10
 * Over 2 pounds but not more than 6 pounds                   $2.20
 * Over 6 pounds but not more than 10 pounds                  $3.70
 * Over 10 pounds                                             $3.80
 * 
 * The shipping charges per 500 miles are not prorated. For example, if 
 * a two pound package is shipped 550 miles, the charges would be $2.20.
 * Write a program that asks the user to enter the weight of a package 
 * and then displays the shipping charges.
 * (Don't you need to know how many miles it will be shipped also?)
 * 
 * @author craig
 */
public class ShippingCharges {
	public static void main (String [] args) {
		// Variables
		int 	pounds,
			miles;
		double  rate,
			total;
		String  input;

		// Engage the user and explain what's going on
		input = JOptionPane.showInputDialog(null, 
			"Hello user! I can calculate your shipping charges.\n"
				+ "Enter the number of pounds your package weighs:");
		pounds = Integer.parseInt(input);

		input = JOptionPane.showInputDialog(null, "Thank you!\n" + 
			"Now enter the number of miles the package will be shipped:");
		miles = Integer.parseInt(input);

		// Now we have the information needed to create a series of 
		// if statements to perform calculations on.
		if (pounds <= 2)
		{
			rate = 1.10;	
			if(miles <= 500)
			{
				total = rate;
				JOptionPane.showMessageDialog(null, "The shipping charges "
					+ "for your package is:\n$" + String.format("%,.2f", total));
			}
			else if (miles > 500)
			{
				total = rate * (miles / 500);
				JOptionPane.showMessageDialog(null, "The shipping charges "
					+ "for your package is:\n$" + String.format("%,.2f", total));
			}
			else
				JOptionPane.showMessageDialog(null, "Invalid input");
		}
		else if (pounds > 2 && pounds <= 6)
		{
			rate = 2.20;
			if(miles <= 500)
			{
				total = rate;
				JOptionPane.showMessageDialog(null, "The shipping charges "
					+ "for your package is:\n$" + String.format("%,.2f", total));
			}
			else if (miles > 500)
			{
				total = rate * (miles / 500);
				JOptionPane.showMessageDialog(null, "The shipping charges "
					+ "for your package is:\n$" + String.format("%,.2f", total));
			}
			else
				JOptionPane.showMessageDialog(null, "Invalid input");
		}
		else if (pounds > 6 && pounds <= 10)
		{
			rate = 3.70;
			if(miles <= 500)
			{
				total = rate;
				JOptionPane.showMessageDialog(null, "The shipping charges "
					+ "for your package is:\n$" + String.format("%,.2f", total));
			}
			else if (miles > 500)
			{
				total = rate * (miles / 500);
				JOptionPane.showMessageDialog(null, "The shipping charges "
					+ "for your package is:\n$" + String.format("%,.2f", total));
			}
			else
				JOptionPane.showMessageDialog(null, "Invalid input");
		}
		else
		{
			rate = 3.80;
			if(miles <= 500)
			{
				total = rate;
				JOptionPane.showMessageDialog(null, "The shipping charges "
					+ "for your package is:\n$" + String.format("%,.2f", total));
			}
			else if (miles > 500)
			{
				total = rate * (miles / 500);
				JOptionPane.showMessageDialog(null, "The shipping charges "
					+ "for your package is:\n$" + String.format("%,.2f", total));
			}
			else
				JOptionPane.showMessageDialog(null, "Invalid input");
		}
	}	
}

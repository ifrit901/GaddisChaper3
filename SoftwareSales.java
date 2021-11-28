package ch3java6thedition;
import javax.swing.JOptionPane;
/**
 * A software company sells a package that retails for $99. Quantity discounts
 * are given according to the following table:
 * 
 * Quantity                  Discount
 * __________________________________
 * 
 * 10 - 19                     20%
 * 20 - 49                     30%
 * 50 - 99                     40%
 * 100 or more                 50%
 * 
 * Write a program that asks the user to enter the number of packages purchased.
 * The program should then display the amount of the discount (if any) and the 
 * total amount of the purchase after the discount. 
 * 
 * @author craig
 */
public class SoftwareSales {
	public static void main (String [] args) {
		// Variables
		int packagesPurchased,
			 packagePrice = 99;
		double       discount,
			        total;
		String input;

		// Engage the user and promt them for information
		input = JOptionPane.showInputDialog(null, "Hello! How many packages did you purchase?");
		packagesPurchased = Integer.parseInt(input);

		// If statements are appropriate rather than a switch statement
		// due to the fact that the conditions for program branching
		// are dependent on a range of integers as opposed to a single
		// integer.
		if (packagesPurchased >= 10 && packagesPurchased <= 19)
		{
			discount = .2;
			total = packagesPurchased * packagePrice;
			JOptionPane.showMessageDialog(null, "The amount of your discount is:\n" +
							"$"+ (total * discount) + "\n" +
						        "and the total cost of your purchase is:\n"+
							"$" + ((total * discount) + total));
		}
		else if (packagesPurchased >= 20 && packagesPurchased <= 49)
		{
			discount = .3;
			total = packagesPurchased * packagePrice;
			JOptionPane.showMessageDialog(null, "The amount of your discount is:\n" +
							"$"+ (total * discount) + "\n" +
						        "and the total cost of your purchase is:\n"+
							"$" + ((total * discount) + total));
		}
		else if (packagesPurchased >= 50 && packagesPurchased <= 99)
		{
			discount = .4;
			total = packagesPurchased * packagePrice;
			JOptionPane.showMessageDialog(null, "The amount of your discount is:\n" +
							"$"+ (total * discount) + "\n" +
						        "and the total cost of your purchase is:\n"+
							"$" + ((total * discount) + total));
		}
		else if (packagesPurchased > 100)
		{
			discount = .5;
			total = packagesPurchased * packagePrice;
			JOptionPane.showMessageDialog(null, "The amount of your discount is:\n" +
							"$"+ (total * discount) + "\n" +
						        "and the total cost of your purchase is:\n"+
							"$" + ((total * discount) + total));
		}
	}	
}

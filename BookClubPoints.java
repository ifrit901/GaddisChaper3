package ch3java6thedition;
import javax.swing.JOptionPane;
/**
 * Serendipity Booksellers has a book club that awards points to customers 
 * based on the number of books they purchase each month. The points are 
 * awarded as follows:
 * 
 * -If a customer purchases 0 books, he or she earns 0 points.
 * -If a customer purchases 1 book, he or she earns 5 points.
 * -If a customer purchases 2 books, he or she earns 15 points.
 * -If a customer purchases 3 books, he or she earns 30 points.
 * -If a customer purchases 4 books, he or she earns 60 points.
 * 
 * Write a program that asks the user to enter the number of books he or she 
 * has purchased this month and then displays the number of points they earned.
 * 
 * @author craig
 */
public class BookClubPoints {
	public static void main (String [] args) {
		// Variables
		int     points,
			books;
		String input;
		
		// Prompt user for the number of books purchased 
		input = JOptionPane.showInputDialog(null, 
			"How many books did you purchase this month?");

		// Parse String input to an int
		books = Integer.parseInt(input);

		// Create switch case to handle the number of points awarded
		switch (books)
		{
			case 0:
			{
				points = 0;
				JOptionPane.showMessageDialog(null, 
					"With " + books + " books purchased this month, "
					+ " you earned " + points + " points this month!");
			}
			case 1:
			{
				points = 5;
				JOptionPane.showMessageDialog(null, 
					"With " + books + " book purchased this month, "
					+ " you earned " + points + " points this month!");
				break;
			}
			case 2:
			{
				points = 15;
				JOptionPane.showMessageDialog(null, 
					"With " + books + " books purchased this month, "
					+ " you earned " + points + " points this month!");
				break;
			}
			case 3:
			{
				points = 30;
				JOptionPane.showMessageDialog(null, 
					"With " + books + " books purchased this month, "
					+ " you earned " + points + " points this month!");
				break;
			}
			case 4:
			{
				points = 60;
				JOptionPane.showMessageDialog(null, 
					"With " + books + " books purchased this month, "
					+ " you earned " + points + " points this month!");
				break;
			}
			default:
				points = 60;
				JOptionPane.showMessageDialog(null, 
					"With " + books + " books purchased this month, "
					+ " you earned " + points + " points this month!");
				break;		
			}
	}	
}

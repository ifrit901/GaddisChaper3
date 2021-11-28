package ch3java6thedition;
import java.util.Scanner;
/**
 * This is actually number 3 in the program challenges, my bad!
 * Use an if-else-if statement that assigns different commission rates
 * to different sales levels.
 * @author craig
 */
public class StringFormatMethod {
	public static void main (String [] args) {
		// Variables for sales and commission
		double  sales,
			commission = 0;

		// Get some user input
		System.out.println("What were your sales for the month?");
		
		// Create an object of the Scanner class
		Scanner input = new Scanner(System.in);

		sales = input.nextDouble();

		if (sales >= 0 && sales <= 10000)
		{
			commission = .10;
		}
		else if (sales > 10000 && sales <= 15000)
		{
			commission = .15;
		}
		else if (sales > 15000)
		{
			commission = .20;
		}
		else
			System.out.println("You entered an invalid response.");

		System.out.println("So you made " + (String.format("$%,.2f", sales)) 
			+ " last year?\n" +
			" That means your commission rate is " + commission + ".\n");

		commission *= sales;

		// Tell user how much they made
		System.out.println("\nYou made " + (String.format("$%,.2f", sales + commission))
			+ " with your commission");
	}	
}

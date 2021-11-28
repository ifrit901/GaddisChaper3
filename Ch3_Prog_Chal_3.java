package ch3java6thedition;
import java.util.Scanner;
/**
 * Using the following chart, write an if-else-if statement that assigns
 * .10, .15, or .20 to 'commission', depending on the value in sales.
 * 
 * Sales                   Commission Rate
 * ---------------------------------------
 * Up to $10,000            .10%
 * $10,000 - $15,000        .15%
 * Over $15,000             .20%
 * 
 * @author craig
 */
public class Ch3_Prog_Chal_3 {
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

package ch3java6thedition;

/**
 * Demonstrate currency formatting.
 * @author craig
 */
public class CurrencyFormat {
	public static void main (String [] args) {
		// Create some double variables
		double monthlyPay = 5000.0;
		double salary = monthlyPay * 12;

		// Display the yearly salary
		System.out.printf("Your yearly salary is $%,.2f\n", salary);
	}	
}

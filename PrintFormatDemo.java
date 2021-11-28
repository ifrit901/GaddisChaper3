package ch3java6thedition;

/**
 * This program demonstrates the formatting possibilities
 * with printf.
 * @author craig
 */
public class PrintFormatDemo {
	public static void main (String [] args) {
		double sales = 12345.67;
		System.out.printf("Our sales are %.2f for the day.\n", sales);

		int hours = 40;
		System.out.printf("I worked %d hours this week.\n", hours);

		double number = 12345.6789;
		System.out.printf("The number is %20f\n", number);
	}	
}
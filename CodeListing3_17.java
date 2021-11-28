package ch3java6thedition;

/**
 * This program demonstrates a series of floating point numbers 
 * formatted in a column using format specifiers.
 * @author craig
 */
public class CodeListing3_17 {
	public static void main (String [] args) {
		// Create a variety of double variables
		double num1 = 12.345,
			num2 = 345.543,
			num3 = 85443.345,
			num4 = 23.534,
			num5 = 87775.345,
			num6 = 234.543;

	// Display the variables in a field of 8 spaces with
	// two decimal places.
	System.out.printf("%8.2f\n", num1);
	System.out.printf("%8.2f\n", num2);
	System.out.printf("%8.2f\n", num3);
	System.out.printf("%8.2f\n", num4);
	System.out.printf("%8.2f\n", num5);
	System.out.printf("%8.2f\n", num6);
	}
	
		
}

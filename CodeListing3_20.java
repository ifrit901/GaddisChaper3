package ch3java6thedition;

/**
 * Demonstrate left justification with format specifiers
 * @author craig
 */
public class CodeListing3_20 {
	public static void main (String [] args) {
		int num1 = 123,
			num2 = 1234,
			num3 = 12345,
			num4 = 123456,
			num5 = 68,
			num6 = 3445;

		// Display the integers with two columns that are 
		// left justified.
		System.out.printf("%-8d%-8d\n", num1, num2);
		System.out.printf("%-8d%-8d\n", num3, num4);
		System.out.printf("%-8d%-8d\n", num5, num6);
		
	}
	
}

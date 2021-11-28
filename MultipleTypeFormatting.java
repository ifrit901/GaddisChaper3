package ch3java6thedition;

/**
 * Multiple data type formatting demonstration.
 * @author craig
 */
public class MultipleTypeFormatting {
	public static void main (String [] args) {
		// Multiple data type variables
		int hours = 40;
		double pay = hours * 25.0;
		String name = "Enrico";

		// Display with formatting
		System.out.printf("Hours: %8d\n", hours);
		System.out.printf("Pay: $%9.2f\n", pay);
		System.out.printf("Name: %9s\n", name);

	}	
}

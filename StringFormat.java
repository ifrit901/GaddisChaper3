package ch3java6thedition;

/**
 * Demonstrate String formatting.
 * @author craig
 */
public class StringFormat {
	public static void main (String [] args) {
		// Create some String variables.
		String name1 = "Creg",
			name2 = "Amanda",
			name3 = "Jonas",
			name4 = "Ferdinand",
			name5 = "Sean",
			name6 = "Dylan";

		// Display the Strings in two columns with right 
		// justification format specifiers.
		System.out.printf("%10s%10s\n", name1, name2);
		System.out.printf("%10s%10s\n", name3, name4);
		System.out.printf("%10s%10s\n", name5, name6);

		// Now in two columns with left justification.
		System.out.println("\n---------------------------\n");
		System.out.printf("%-10s%-10s\n", name1, name2);
		System.out.printf("%-10s%-10s\n", name3, name4);
		System.out.printf("%-10s%-10s\n", name5, name6);


	}	
}

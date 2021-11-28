package ch3java6thedition;

/**
 * This demonstrates the not operator with the equals method 
 * as well as passing a String literal as an argument to the 
 * equals method. Also the compareTo method etc.
 * @author craig
 */
public class CodeListing3_9b {
	public static void main (String [] args) {
		// Create the Strings
		String name1 = "Bob",
			name2 = "Bob",
			name3 = "Mary";

		// Use operators on the equals method to return
		// boolean expression results.
		if (name1.equals(name2))
			System.out.println("Bob and Bob are the same.");

		if (!name1.equals(name3))
			System.out.println("Bob and Mary are not the same.");

		if (name1.equals("Bob"))
			System.out.println("name1 equals Bob.");

		// The compareTo method returns greater than (positive), 
		// less than (negative), and equal to (zero) values.
		System.out.println(name1.compareTo(name2));  // This ouputs zero(false)

		System.out.println(name1.compareTo(name3) > 0); // This outputs true

		System.out.println(name1.compareTo(name3) != 0); // This outputs false

		System.out.println(name1.compareTo(name3));

		System.out.println(name3.compareTo(name1));

		System.out.println(!name3.equals("Bob"));
	}	
}

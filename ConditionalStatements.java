package ch3java6thedition;

/**
 * This is a continuation of Chapter 3 checkpoint 3.23
 * @author craig
 */
public class ConditionalStatements {
	public static void main (String [] args) {
		System.out.println("Write the following if-else statements as "+
			"conditional statements:\nc.\nif (hours > 40)\n\t"+
			"wages *= 1.5;\nelse\n\twages *= 1;\n" +
			"wages *= (hours > 40) ? 1.5 : 1;");

		// Let's see if that one actually works
		double wages = 20.0;
		int hours = 41;

		if (hours > 40)
		{
			wages *= 1.5;
		}
		else 
		{
			wages *= 1;
		}

		System.out.println("\nAfter 40 hours your payrate is $" + wages);
	
		// Now the conditional statement
		System.out.println("\nNow for the conditional statement:\n" +
			"wages *= (hours > 40) 1.5 : 1;\n");

		// First we have to reset the value of 'wages'. At this point
		// in the program it has been changed to 30.0;
		wages = 20.0;
		
		wages *= (hours > 40) ? 1.5 : 1;

		System.out.println("After 40 hours your payrate is $" + wages);

		// d.
		System.out.println("\nd.\nif (result >= 0)\n\tSystem.out.println"+
			"(\"The result is positive.\"\nelse\n\tSystem.out.println"+
			"(\"The result is negative.\"");

		int result = 5;
		System.out.println((result >= 0) ? "\nThe result is positive." :
				"The result is negative");
	}

}

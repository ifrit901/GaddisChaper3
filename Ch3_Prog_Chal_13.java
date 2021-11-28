package ch3java6thedition;

/**
 * Assume that the double variable 'number' contains the value 12345.6789. 
 * Write a statement that uses System.out.printf to display the number 
 * as 12,345.68.
 * This is from algorithm workbench, not programming challenges.
 * @author craig
 */
public class Ch3_Prog_Chal_13 {
	public static void main (String [] args) {
		double number = 12345.6789;

		System.out.printf("The number is " + "%,.2f\n", number);
	}	
}

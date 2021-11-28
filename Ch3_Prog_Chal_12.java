package ch3java6thedition; 
/** 
 * Assume the variable 'number' contains the value 12345.6789.  
 * Write a statement that uses printf to display 12345.7.  
 *  
 * This is from algorithm workbench, not programming challenges.
 * @author craig */
public class Ch3_Prog_Chal_12 {
	public static void main (String [] args) {
		// Create variable 
		double variable = 12345.6789;

		// Use print formatting to display the number differently
		System.out.printf("The number is " + String.format("%.1f", variable) + "\n");


	}	
} 
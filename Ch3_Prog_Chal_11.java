package ch3java6thedition;

/**
 * Match the conditional statement with the if-else statement that performs
 * the same operation.
 *  
 * This is from algorithm workbench, not programming challenges.
 * a. q = x < y ? a + b : x * 2;
 * b. q = x < y ? x * 2 : a + b;
 * c. q = x < y ? 0 : 1;
 * ???	if (x < y)
 * 		q = 0;
 * 	else
 * 		q = 1;
 * ??? if (x <  y)
 * 		q = a + b;
 * 	else
 * 		q = x * 2;
 * ???	if (x < y)
 * 		q = x * 2;
 * 	else 
 * 		q = a + b;
 * 			
 * @author craig
 */
public class Ch3_Prog_Chal_11 {
	public static void main (String [] args) {
		System.out.println("Choice \"C\" is the first example.");
		System.out.println("Choice \"B\" is the last option.");
		System.out.println("Choice \"A\" is the second choice");
	}	
}

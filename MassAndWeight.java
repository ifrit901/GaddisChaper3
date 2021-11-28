package ch3java6thedition;
import javax.swing.JOptionPane;
/**
 * Scientists measure an object's mass in kilograms and its weight in Newtons.
 * If you know the amount of mass that an object has, you can calculate its 
 * weight, in Newtons, with the following formula:
 * 
 * Weight = mass * 9.8
 * 
 * Write a program that asks the user to enter an object's mass, then calculate
 * its weight. If the object weighs more than 1000 Newtons, display a message 
 * indicating that it is too heavy. If the object weighs less than 10 Newtons,
 * display a message indicating that the object is too light.
 * 
 * @author craig
 */
public class MassAndWeight {
	public static void main (String [] args) {
		// Variables 
		double  mass,
			weight;
		String  input;

		// Greet the user and prompt them for input
		input = JOptionPane.showInputDialog(null, "I'm gonna calculate the weight\n" +
			"of an object using its mass. First, tell me\n" +
			"what the object's mass is in kilograms:");
		mass = Double.parseDouble(input);

		weight = mass * 9.8;	
	
		// Display the results to the user 
		JOptionPane.showMessageDialog(null, "The weight of the object is " +
			String.format("%.2f", weight) + " Newtons.");

	System.exit(0);
	}	
}

package ch3java6thedition;
import javax.swing.JOptionPane;
/**
 * Write a program that calculates a person's body mass index (BMI). The BMI
 * is often used to determine whether a person with a sedentary lifestyle 
 * is overweight or underweight for his or her height. A person's BMI is 
 * calculated with the following formula:
 * BMI = Weight x 703/Height^2
 * where weight is measured in pounds and height is measured in inches.
 * The program should display a message indicating whether the person has
 * optimal weight, is underweight, or is overweight. A sedentary person
 * is considered optimal if his or her BMI is between 18.5 and 25. If the 
 * BMI is less than 18.5, the person is considered underweight. If it is 
 * over 25, they are considered overweight.
 * 
 * @author craig
 */
public class Ch3BodyMassIndex {
	public static void main (String [] args) {
		// Create double variables and a String variable for input
		double  BMI,
			weight,
			height;
		String  input;

		// Talk to the user with boxes. Make the boxes nice :)
		JOptionPane.showMessageDialog(null, "Hello! I'm gonna calculate " +
			" you're body mass index.");

		input = JOptionPane.showInputDialog(null, "What is your weight?");
		weight = Double.parseDouble(input);

		input = JOptionPane.showInputDialog(null, "What is your height in inches?");
		height = Double.parseDouble(input);

		// Perform calculations
		BMI = weight * (703 / (height * height));

		// Display results to user
		JOptionPane.showMessageDialog(null, "Your BMI is:\n" +
			String.format("%.2f",BMI ));    // Formatted to two decimals

	System.exit(0);
	}	
}

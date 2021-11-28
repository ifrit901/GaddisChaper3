package ch3java6thedition;
import javax.swing.JOptionPane;
/**
 * Write a program that asks the user to enter the number of calories and 
 * fat grams that are in a food item. The program should display the 
 * percentage of calories that come from fat. One gram of fat has 9
 * calories; therefore:
 * 
 * Calories from fat = Fat grams * 9
 * 
 * The percentage of calories from fat can be calculated as follows:
 * 
 * Calories from fat / Total calories
 * 
 * If the calories from fat are less than 30% of the total calories of
 * the food, it should also display a message that the food is low in fat.
 * 
 * @author craig
 */
public class FatGramCalculator {
	public static void main (String [] args) {
		// Variables
		double 	calories, 
			fatGrams,
			percentageFat,
			caloriesFromFat;

		String  input;    // For user input

		// Engage the user and explain what's going on
		JOptionPane.showMessageDialog(null, "Hello user! \nl" +
			"I'm goin to calculate the percentage of fat calories\n"+
			"in the food you're eating.");

		// Promt user for input
		input = JOptionPane.showInputDialog(null, "How many calories are in the food?");
		calories = Double.parseDouble(input);

		input = JOptionPane.showInputDialog(null, "How many fat grams are in the food?");
		fatGrams = Double.parseDouble(input);

		caloriesFromFat = fatGrams * 9;

		percentageFat = (caloriesFromFat / calories) * 100;

		if (caloriesFromFat > calories)
		{
			JOptionPane.showMessageDialog(null, "Invalid input. \n" +
				"Calories from fat exceed total calorie content.");
			System.exit(0);
		}
		
		if (percentageFat <= 30)
		{
			JOptionPane.showMessageDialog(null, "The percentage of " +
				"fat in the food you're eating is " + percentageFat + "%.\n" +
				"This is some low fat food!");
		}
		else if (percentageFat > 30)
		{
			JOptionPane.showMessageDialog(null, "The percentage of " +
				"fat in your food is " + percentageFat + "%.");
		}
		else
			JOptionPane.showMessageDialog(null, "Invalid input");
	}	
}

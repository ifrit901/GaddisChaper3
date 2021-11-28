package ch3java6thedition;
import javax.swing.JOptionPane;
/**
 * The following table shows the approximate speed of sound in air, water and steel:
 * 
 * Medium                            Speed
 * ______________________________________________
 * 
 * Air                      1,100 feet per second
 * Water                    4,900 feet per second
 * Steel                   16,480 feet per second
 * 
 * Write a program that asks the user to enter "air", "water", or "steel", and 
 * the distance that a sound wave will travel in that medium. The program 
 * should then display the amount of time it will take. You can calculate
 * the amount of time it takes sound to travel through these mediums by 
 * dividing the distance the sound travels by the values in the table. For
 * instance, the equation for air would be: 
 * 
 * Time = Distance / 1,100
 * 
 * @author craig
 */
public class TheSpeedOfSound {
	public static void main (String [] args) {
		// Variables
		String medium,
			input;

		double  air = 1100,
			water = 4900,
			steel = 16480,
			distance,
			time;
		// Engage the user and prompt them to enter the medium the 
		// sound will be traveling through
		JOptionPane.showMessageDialog(null, "This program will calculate the distance sound\n"+
					"travels in one of three mediums.\n Enter \"air\", \"water\", or \"steel\"\n"+
					"as a medium and then choose the distance in feet it will travel.");	
		medium = JOptionPane.showInputDialog(null, "What is the medium the sound will travel through?");
		input = JOptionPane.showInputDialog(null, "What is the distance it will travel?");
		distance = Double.parseDouble(input);

		// Send the input through if statements to perform the indicated calculations
		if (medium.equalsIgnoreCase("air"))
		{
			time = distance / air;
			JOptionPane.showMessageDialog(null, "The time sound will take to travel through\n"+
				distance + " feet of " + medium + " is " + String.format("%,.2f", time)+" seconds.");
		}
		else if (medium.equalsIgnoreCase("water"))
		{
			time = distance / water;
			JOptionPane.showMessageDialog(null, "The time sound will take to travel through\n"+
				distance + " feet of " + medium + " is " + String.format("%,.2f", time)+" seconds.");
		}
		else if (medium.equalsIgnoreCase("steel"))
		{
			time = distance / steel;
			JOptionPane.showMessageDialog(null, "The time sound will take to travel through\n"+
				distance + " feet of " + medium + " is " + String.format("%,.2f", time)+" seconds.");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Invalid input");
		}

	}	
		
}

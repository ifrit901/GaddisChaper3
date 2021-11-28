package ch3java6thedition;
import javax.swing.JOptionPane;

/**
 * Write a program that has three variables to hold test scores.
 * The program should ask the user to enter three test scores and 
 * then assign the values entered to the variables.The program should
 * display the average of the test scores and the letter grade that is
 * assigned for that average. Use the following table:
 * 
 * Test Score Average                 Letter Grade
 * ----------------------------------------------
 * 90 - 100                                A
 * 80 - 89                                 B
 * 70 - 79                                 C
 * 60 - 69                                 D
 * Below 60                                F
 * 
 * @author craig
 */
public class Ch3TestScoresAndGrade {
	public static void main (String [] args) {
		// Create variables for test scores and String for input
		String  input;
		double  score1,
			score2,
			score3,
			average;

		// Engage the user with a talking box
		JOptionPane.showMessageDialog(null, "Hello! I'm going to calculate\n" +
			" your grade letter and average.");

		// Get the scores from user 
		input = JOptionPane.showInputDialog(null, "Enter three scores.\n" +
			"Score #1:");
		score1 = Double.parseDouble(input);

		input = JOptionPane.showInputDialog(null, "Score #2:");
		score2 = Double.parseDouble(input);

		input = JOptionPane.showInputDialog(null, "Score #3:");
		score3 = Double.parseDouble(input);
		
		// Perform calculation and output to user with if statement
		average = (score1 + score2 + score3) / 3;

		if (average >= 90 && average <= 100)
		{
			JOptionPane.showMessageDialog(null, "Your average is \n" +
				average + "\n" + "You got an A!");
		}
	
		else if (average >= 80 && average <= 89)
		{
			JOptionPane.showMessageDialog(null, "Your average is \n" +
				average + "\n" + "You got a B!");
		}	
		else if (average >= 70 && average <= 79)
		{
			JOptionPane.showMessageDialog(null, "Your average is \n" +
				average + "\n" + "You got a C!");
		}	
		else if (average >= 70 && average <= 79)
		{
			JOptionPane.showMessageDialog(null, "Your average is \n" +
				average + "\n" + "You got a D!");
		}
		else if (average <= 69)
		{
			JOptionPane.showMessageDialog(null, "Your average is \n" + 
				average + "\n" + "You got an F!");
		}
		else
			JOptionPane.showMessageDialog(null, "That grade is impossible!\n" +
				"Where do you go to school!?!");
		System.exit(0);
	}	}

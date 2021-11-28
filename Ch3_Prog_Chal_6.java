package ch3java6thedition;
import java.util.Scanner;
/**
 * Write an if statement that prints the message "The number is valid"
 * if the variable 'grade' is within the range 0 - 100.
 * @author craig
 */
public class Ch3_Prog_Chal_6 {
	public static void main (String [] args) {
		// Create variable grade
		int grade;

		// Create an object of the Scanner class
		Scanner input = new Scanner(System.in);

		// Prompt user for grade
		System.out.println("What was your grade?");
		grade = input.nextInt();

		if (grade >= 0 && grade <= 100)
		{
			System.out.println("The number you entered is valid.");
		}
	}	
}

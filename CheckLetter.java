package ch3java6thedition;
import java.util.Scanner;
/**
 * Try to check a string for letters only
 * @author craig
 */
public class CheckLetter {
	public static void main (String [] args) {
		String name;
			
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a name in letters only:");
	name = input.nextLine();

	System.out.println(name.charAt(2));

	if (name.charAt(2) == 'a')
	{
		System.out.println("The second letter of Sean's name is 'a'.");
	}
	}	
}

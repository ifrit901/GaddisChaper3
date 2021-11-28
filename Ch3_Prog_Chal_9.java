package ch3java6thedition;

/**
 * 
 * This is from algorithm workbench, not programming challenges.
 * Write an if-else statement that displays the String objects 'title1' and
 * 'title2' in alphabetical order.
 * @author craig
 */
public class Ch3_Prog_Chal_9 {
	public static void main (String [] args) {
		String title1 = "ManSplaining",
			title2 = "Feminazis";

		if (title1.compareTo(title2) < title2.compareTo(title1))
		{
			System.out.println(title1 + "\n" + title2);
		}
		else if (title2.compareTo(title1) < title1.compareTo(title2))
		{
			System.out.println(title2 + "\n" + title1);
		}
	}	
}

import java.util.Scanner;

public class NumericTypes
{
	public static void main (String [] args)
	{
		//TASK #2 Create a Scanner object here 
		Scanner Input = new Scanner(System.in);
		
		//identifier declarations
		final double NUMBER = 2.0;    // number of scores
		int score1; 			      // first test score
		int score2; 			      // second test score
		final int BOILING_IN_F = 212; // boiling temperature
		double fToC; 				  // temperature in Celsius
		double average; 			  // arithmetic average
		int userTemperature;          //Task #2 declare a variable to hold the user’s temperature
		
		//Task #2 prompt user to input score1
		//Task #2 read score1 
		//Task #2 prompt user to input score2
		//Task #2 read score2 
		
		System.out.println("Enter first test score: ");
		score1 = Input.nextInt();
		System.out.println("Enter second test score: ");
		score2 = Input.nextInt();
		
		// Find an arithmetic average
		average = (score1 + score2) / NUMBER;	
		System.out.println(score1 + " and " + score2 +
				           " have an average of " + average);
		
		// Convert Fahrenheit temperatures to Celsius
		fToC = (5/9.0) * (BOILING_IN_F - 32);
		System.out.println(BOILING_IN_F + " in Fahrenheit is " +
		                   fToC + " in Celsius.\n");
		
		//Task #2 prompt user to input another temperature
		//Task #2 read the user’s temperature in Fahrenheit
		//Task #2 convert the user’s temperature to Celsius
		//Task #2 print the user’s temperature in Celsius
		
		System.out.println("Enter a temperature in Fahrenheit: ");
		userTemperature = Input.nextInt();
		fToC = (5/9.0) * (userTemperature - 32);
		System.out.println(userTemperature + " in Fahrenheit is " +
		                   fToC + " in Celsius.");
		
		System.out.println("Goodbye"); // to show that the program is ended	
	}
}

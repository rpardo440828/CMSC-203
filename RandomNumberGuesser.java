import java.util.Scanner;

/**
 * This class asks a user to guess a random number multiple
 * times until the correct number is guessed
 * @author Rodrigo Pardo
 *
 */

public class RandomNumberGuesser
{
	public static void main(String[] args)
	{
		String answer;                                //For "try again?" answer
		Scanner input = new Scanner(System.in);       //For user input
		int nextGuess, highGuess, lowGuess;           //For guess number and low/high values
		int randNum;                                  //For random number
		
		printHeader();
		
		//Do while
		do
		{
			highGuess = 100;
			lowGuess = 1;
			
			new RNG(); //New instance of the RNG class
			RNG.resetCount();
			
			//Get random number and prompt user for their first guess
			randNum = RNG.rand();
			System.out.println("Enter your first guess");
			nextGuess = input.nextInt();
			
			//While loop that goes through each guess until the correct number is inputed
			while (nextGuess != randNum)
			{
				boolean status = true;
				status = RNG.inputValidation(nextGuess, lowGuess, highGuess);
				
				//If status is false then input for next guess then continue to next iteration
				if(!status)
				{
					nextGuess = input.nextInt();
					continue;
				}
				
				System.out.println("Number of guesses is " + RNG.getCount());
				
				//If next guess is greater than random number then print message and assign the guess
				// into high guess
				if(nextGuess > randNum)
				{
					System.out.println("Your guess is too high");
					highGuess = nextGuess;
				}
				
				//Otherwise, if next guess is less than random number then print message and assign
				//the guess into low guess
				else if(nextGuess < randNum)
				{
					System.out.println("Your guess is too low");
					lowGuess = nextGuess;
				}
				
				System.out.println("Enter your next guess between " + lowGuess + " and " + highGuess);
				nextGuess = input.nextInt();
			}
			
			new RNG(); //Statement is meant only to increment count by one
			System.out.println("Number of guesses is " + RNG.getCount());
			System.out.println("Congratulations, you guessed correctly");
			System.out.println("Try again? (yes or no)");
			input.nextLine();
			answer = input.nextLine();
		}
		while(answer.equals("yes"));
		
		printName();
	}
	
	/**
	 * Method prints a header
	 */
	public static void printHeader()
	{
		System.out.println("CMSC 203 Assignment 2");
	}
	
	/**
	 * This method prints the name of programmer
	 */
	public static void printName()
	{
		System.out.println("Programmer: Rodrigo Pardo");
	}
}

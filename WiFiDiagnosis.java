import java.util.Scanner;

/**
 * Program will suggest multiple ways to establish WiFi connection, 
 * and determine which one worked for the user
 * @author Rodrigo Pardo
 *
 */

public class WiFiDiagnosis
{
	public static void main(String[] args)
	{
		//Declare variables
		Scanner scan = new Scanner(System.in); //Scanner variable
		String answer;                         //String variable for user's input
		
		//Print title
		System.out.println("If you have a problem with internet connectivity, " +
	                       "this WiFi Diagnosis might work.");
		
		//Display reboot computer statement
		System.out.println("\nFirst step: reboot your computer");
		
		//Display question statement and receive input from user to String variable answer
		System.out.print("Are you able to connect with internet? (yes or no)\n");
		answer = scan.nextLine();
		
		//If answer is “yes” or "Yes" then display the statement describing what worked
		if (answer.equals("yes") || answer.equals("Yes") )
			{
				System.out.println("Rebooting your computer seemed to work");
			}
		
		//Otherwise, display reboot router statement
		else
			{
				//Display prompt and input for String variable answer
				System.out.println("Second step: reboot your router\n" +
			                       "Now are you able to connect with the internet?" +
						           " (yes or no)");
				answer = scan.nextLine();
				
				//If answer is “yes” or "Yes" then display the statement describing what worked
				if (answer.equals("yes") || answer.equals("Yes"))
					{
						System.out.println("Rebooting your router seemed to work");
					}
				
				//Otherwise, display cable check statement
				else
					{
						System.out.println("Third step: make sure the cables to your " +
					                       "router are plugged in firmly and your " +
								           "router is getting power");
						
						//Display prompt and input for String variable answer
						System.out.println("Now are you able to connect with the " + 
								           "internet? (yes or no)");
						answer = scan.nextLine();
						
						//If answer is “yes” or "Yes" then display the statement describing what worked
						if (answer.equals("yes") || answer.equals("Yes"))
							{
								System.out.println("Checking the router's " +
							                       "cables seemed to work");
							}
						
						//Otherwise, display move computer statement
						else
							{
								System.out.println("Fourth step: move your computer " +
							                       "closer to your router");
								
								//Display prompt and input for String variable answer
								System.out.println("Now are you able to connect with " +
							                       "the internet? (yes or no)");
								answer = scan.nextLine();
								
								//If answer is “yes” or "Yes" then display the statement describing what worked
								if (answer.equals("yes") || answer.equals("Yes"))
									{
										System.out.println("Moving your computer " +
									                       "seemed to work");
									}
								
								//Otherwise, display contact ISP statement and ISP hook up statement
								else
									{
										System.out.println("Fifth step: contact your ISP");
										System.out.println("Make sure your ISP is hooked " +
										                   "up to your router.");
									}
							}
					}
			}
		scan.close();
		
		//Display conclusion
		System.out.println("\nProgrammer: Rodrigo Pardo");
	}
}

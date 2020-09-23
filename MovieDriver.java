import java.util.Scanner;

public class MovieDriver 
{
	public static void main(String[] args)
	{
		Scanner keyBoard = new Scanner(System.in);
		Movie movie = new Movie();
		String title;
		String rating;
		int soldTickets;
		char validation;
		
		do
		{
			System.out.println("Enter the name of the movie");
			title = keyBoard.nextLine();
			movie.setTitle(title);

			System.out.println("Enter the rating of the movie");
			rating = keyBoard.nextLine();
			movie.setRating(rating);

			System.out.println("Enter the number of tickets sold for this movie");
			soldTickets = keyBoard.nextInt();
			movie.setSoldTickets(soldTickets);
	
			System.out.println(movie.toString());
			System.out.println("Do you want to enter another? (y or n)");
			validation = keyBoard.next().charAt(0);
			keyBoard.nextLine();
	    }
		while (validation == 'y');
		
		keyBoard.close();
		System.out.println("Goodbye");
	}
}

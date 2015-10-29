import java.util.Scanner;

// This program will randomly generate a situation of a coin flip.
// It will also intake values from the user (0~100) and tell how many heads vs. tails have appeared.

public class flips {

	// This is the main method
	public static void main(String args[])
	{
		// The scanner allows us to intake values from the user
		Scanner n = new Scanner(System.in);

		// I gave the value of 0 for heads and 1 for tails.
		int head = 0;
		int tails = 1;
		System.out.println("Please input an integer between 0~100");
		int x = n.nextInt();

		// If the user puts 0, the program will only simulate the coin flip situation once
		if(x==0)
		{
			// It will call out to the flip method below and then print out the result
			String flip = flip();
			System.out.println(flip);
		}
		// If the user inputs an integer between 1~100, it will run this if statement
		else if(x>0 || x<100)
		{
			// It will call out to the flip method WITH the variables x, head, and tails
			String flip = flip(x,head,tails);
			System.out.println(flip);
		}
		// If the user inputs an integer greater than 100 or less than 0, it will exit the program
		else if(x>100 || x<0)
		{
			System.exit(0);
		}	
	}
	// This is the first flip method, made for the case when the user puts 0 as the integer
	public static String flip()
	{
		// It will run the Math.random function once and round it to an integer
		int random = (int)(Math.round(Math.random()*1));
		// If the Math.random function comes out to 0, it will count one for head
		if(random==0)
		{
			return "Tail: 0 & " + "Head: 1";
		}
		// If the Math.random function comes out to 1, it will count one for tails.
		else if(random==1)
		{
			return "Tail: 1 & " + "Head: 0";
		}
		
		else return null;		
	}
	// This is the second flip method, made for case when the user puts 1~100 as the integer
	public static String flip(int x, int head, int tails)
	{
		// This for loop will run as much as the x value is
		for(int y=1; y<x; y++)
		{
			// It will run the Math.random function and see if it's 0 or 1
			int random = (int)(Math.round(Math.random()*1));
			// If Math.random is 0, it will add 1 to the head count
			if(random==0)
			{
				head++;	
			}
			// If Math.random is 1, it will add 1 to the tails count
			else if(random==1)
			{
				tails++;
			}
		}
		// It will return the counts as String value
		return ("Heads: " + head) + " & " + ("Tails: " +tails);

	}
}

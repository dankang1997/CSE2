import java.util.Scanner;

// This program will ask the user for an input value of a certain integer that will determine the size of the pyramid

public class pyramid {

	public static void main(String args[])
	{
		// The scanner method allows the users to input values
		Scanner n = new Scanner(System.in);

		// These undeclared variables will later be used in the for loops
		int size;
		int space;
		// This string is the star that will be printed
		String star = "*";	

		System.out.println("What size is the pyramid?");
		size = n.nextInt();
		// This determines the size of the pyramid


		// This for loop will set a base value for the inner two for loops
		for(int i=0;i<size;i++)
		{
			// This for loop will handle the spacing in front of the star so it can be centered.
			for(space=0; space<size-i; space++) 
			{
				System.out.print(" ");
		

			// This for loop will actually print out the star and a space after it for spacing.
			for(int j=0;j<=i;j++) 
			{
				System.out.print(star+ " ");

			}

			// This line is here to create a new line instead of having a straight line
			System.out.println("");
		}

	}

}
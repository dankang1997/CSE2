import java.util.Scanner;


public class encrypted_x {

	public static void main(String args[]){

        // This scanner method allows users to put in values
		Scanner n = new Scanner(System.in);

		System.out.println("How big do you want the square to be? (Enter integer between 0~100)");
		int input = n.nextInt();

		String star = "*";

        // This if statement is here to exit the program if the user inputs a value not within (0~100)
		if(input>100 || input<0)
		{
			System.exit(-1);
		}
		
		// this for loop will determine how many lines there will be 
		for(int i = 0; i<input; i++)
		{
		    // This inner loop will determine what will be printed within
			for(int j = 0; j<input; j++)
			{
			    // If the line number equals the to letter number, it will print out space
				if(j == i)
				{
					System.out.print(" ");
				}
				// This if statement is here to create symetery with the if statement before
				if(j == input-i)
				{
					System.out.print(" ");
				}
				// If none of the if statements are true, it will print out star
				System.out.print(star);
			}

			System.out.println();
		}

	}
}
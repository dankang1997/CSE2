import java.util.Scanner;

// This class is made to calculate the input of the user until he/she inputs "n" or "N"

public class CalculatorSpecial {

	public static void main(String[] args) {

		// The inputCommand is a String that will determine if the user wishes the program to continue or not.
		// The value is undeclared because the user will input the value.
		String inputCommand;
		// The answer is currently 0, but will subject to change later on with the user inputs.
		int answer=0;
		// The scanner will intake values from the user
		Scanner n = new Scanner(System.in);

		// Lines 18~31 is copied from the previous calculator lab
		System.out.println("Please input an integer");
		int a = n.nextInt();
		System.out.println("Please input another integer");
		int b = n.nextInt();
		System.out.println("Please input the operation (+,-,*,/)");
		String operation = n.next();
		switch(operation)
		{
		case"+": answer = a+b; break;
		case"-": answer = a-b; break;
		case"*": answer = a*b; break;
		case"/": answer = a/b; break;
		default: System.out.println("Illegal Operator"); break;
		}

		// This is a part where the user has the option to keep going or stop
		System.out.println("Do you wish to continue? (Press Yes to continue, n or N to stop)");
		inputCommand = n.next();

		// If the user inputs either "N" or "n", the program will print out the current value of the answer and stop.
		while(inputCommand.equals("N") || inputCommand.equals("n"))
		{
			System.out.println("Your answer is " + answer);
			// The System.exit(0) is there to keep the while loop from going into infinite loops.
			System.exit(0);
		}

		// If the user inputs anything other than "N" or "n", the program will enter this while loop as opposed to the previous one
		while(!inputCommand.equals("N") || !inputCommand.equals("n"))
		{
			System.out.println("The current answer is: " + answer);

			// The program prints out the current value of 'answer' and asks the user if they want to continue or stop
			// This was mainly put here to have an 'exit code' for this while loop. If this wasn't here, the program will continue
			// to ask the user for input while not giving them the option to stop.
			System.out.println("Keep going? (Press Yes to continue, n or N to stop)");
			inputCommand = n.next();
			// If the user inputs "N" or "n", it will exit the system.
			if(inputCommand.equalsIgnoreCase("N"))
			{
				System.out.println("Thanks for using Calculator Special!");
				System.exit(0);
			}
			// If the user inputs anything other than "N", or "n", it will do the calculator program again
			else
			{
				System.out.println("What operation do you wish to use on it?");
				operation = n.next();
				System.out.println("What integer do you wish to use?");
				// Here, a new variable 'input' is made to intake new values from the user
				int input = n.nextInt();
				switch(operation)
				{
				case"+": answer = answer+input; break;
				case"-": answer = answer-input; break;
				case"*": answer = answer*input; break;
				case"/": answer = answer/input; break;
				default: System.out.println("Illegal Operator"); break;
				}
			}
		}



	}
}



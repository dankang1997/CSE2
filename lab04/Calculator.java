import java.util.Scanner;

// Dan Kang
// Lab 04, Calculator.java
// This program will take in 3 inputs from the user. 2 integers, (a and b) as well as an operator (+,-,*,/)
// Then using the formulas, it will calculate the final answer

public class Calculator {

	public static void main(String[] args) {

		// This is the Scanner, which will allow this program to take inputs from the user.
		Scanner input = new Scanner(System.in);

		// This will ask the user for the first integer (a) and store it as int a.
		System.out.println("What is the First integer?");
		int a = input.nextInt();
		
		// This will ask the user for the second integer (b) and store it as int b
		System.out.println("What is the Second integer?");
		int b = input.nextInt();
		
		// This will ask the user for the type of operation he/she wishes to use then store its value in String operations
		System.out.println("What kind of operation do you wish to use? (+,-,*,/)");
		String operation = input.next();
		
		// This is the switch statement that will go down the list and see if it has any matches.
		// If there are matches, it will use that specific case.
		switch (operation){
		// this case matches if the input was a "-"
		case "-": System.out.println(a-b); break;
		// this case matches if the input was a "+"
		case "+": System.out.println(a+b); break;
		// This case matches if the input was a "*"
		case "*": System.out.println(a*b); break;
		// This case matches if the input was a "/"
		case "/": System.out.println(a/b); break;
		// The default is there so if the input for operator was invalid, it will return 'illegal operator'
		default: System.out.println("Illegal Operator."); break;

		
		
		}
		
	}

}

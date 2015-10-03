import java.util.Scanner;

// This is a timeSheets program that will allow the user to calculate a payroll for all the employees
// It will intake and store values within the program and print out all the employee's payroll at the end
// This program can take up to 10 employees but can easily be extended to infinite amounts if wanted.

public class timeSheets {

	public static void main(String args[])
	{
		// This is the scanner method that will allow the program to ask the user for input.
		Scanner n = new Scanner(System.in);

		System.out.println("How many employees are there? (Enter a non-negative integer)");
		int employeeNumber = n.nextInt();
		// This is the amount of employees the user wishes to create a payroll for(only up to 10 atm)
		
		// All these variables are only place holders for now with either a zero or no value
		int rate = 0;
		int hours;
		int payRoll;
		int employee1 = 0;int employee2 = 0;int employee3 = 0;
		int employee4 = 0;int employee5 = 0;int employee6 = 0;
		int employee7 = 0;int employee8 = 0;int employee9 = 0;
		int employee10 = 0;
		
		// This for loop will check will start with int i, which is 1 as declared.
		// It will check for the condition i<=employeeNumber and if true, will run the loop until false.
		// The i++ will add 1 to int i every time the loop runs
		for(int i = 1; i<=employeeNumber; i++)
		{
			System.out.println("How much does the employee get paid per hour? (Enter in cents)");
			rate = n.nextInt();

			System.out.println("Enter how many hours this employee worked on Monday");
			int mon = n.nextInt();

			System.out.println("Enter how many hours this employee worked on Tuesday");
			int tue = n.nextInt();

			System.out.println("Enter how many hours this employee worked on Wednesday");
			int wed = n.nextInt();

			System.out.println("Enter how many hours this employee worked on Thursday");
			int thur = n.nextInt();

			System.out.println("Enter how many hours this employee worked on Friday");
			int fri = n.nextInt();
			
			// The hours is a total amount the employee worked all week, mon~fri hours all added.
			hours = mon+tue+wed+thur+fri;
			// The amount of payRoll is hour multiplied by the hourly rate
			payRoll = hours*rate;
			
			// This switch statement will store values in the previously declared variables employee1~employee10
			switch(i)
			{
			case 1:  employee1 = payRoll;
			case 2:  employee2 = payRoll;
			case 3:  employee3 = payRoll;
			case 4:  employee4 = payRoll;
			case 5:  employee5 = payRoll;
			case 6:  employee6 = payRoll;
			case 7:  employee7 = payRoll;
			case 8:  employee8 = payRoll;
			case 9:  employee9 = payRoll;
			case 10: employee10 = payRoll;
			}
			System.out.println("Employee"+i+ "'s data stored");
		}
			
		// This for loop is made for printing out the final time sheet.
		// The for loop conditions are the same, except it has int j instead of int i.
		for(int j = 1; j<=employeeNumber; j++)
		{
			// It will run this switch until int j's value exceeds employeeNumber.
			// This will print out all the values of employee's payroll amount together.
			switch(j)
			{
			case 1: System.out.println("Employee1's payroll is: " + employee1); break;
			case 2: System.out.println("Employee2's payroll is: " + employee2);break;
			case 3: System.out.println("Employee3's payroll is: " + employee3);break;
			case 4: System.out.println("Employee4's payroll is: " + employee4);break;
			case 5: System.out.println("Employee5's payroll is: " + employee5);break;
			case 6: System.out.println("Employee6's payroll is: " + employee6);break;
			case 7: System.out.println("Employee7's payroll is: " + employee7);break;
			case 8: System.out.println("Employee8's payroll is: " + employee8);break;
			case 9: System.out.println("Employee9's payroll is: " + employee9);break;
			case 10: System.out.println("Employee10's payroll is: " + employee10);break;

			}
			
		}
	}
	
}


import java.util.Scanner;

// Dan Kang
// hw 05, averageGrade.java
// This program will intake grade values ranging from 0-100 from the user until the overall grade value reaches 999
// Then it will find the average of the grade

public class averageGrade {

	public static void main (String args[]){

        // This is the Scanner that will take intake values from the user
		Scanner n = new Scanner(System.in);

        // These are the variables that will be used. Some are initialized, some are not.
		double averageGrade;
		double grade;
		double totalGrade = 0.00;
		// input will measure how many times the user has input a grade
		int input = 0;

        // This while loop will keep running until it reaches 999
		while(totalGrade<999)
		{
			System.out.println("Please input a grade");
			grade = n.nextDouble();
			
			// This if statement makes sure an invalid grades are not entered
			// The invalid grades are anything above 100 and less than 0
			if(grade>100 || grade<0)
			{
				System.out.println("Invalid grade has been entered");
				System.out.println("Program will now shut down");
				System.exit(0);
			}
			else
			{
				totalGrade = totalGrade+grade;
				System.out.println("Current total grade is: "+totalGrade);
				input++;
			}
		}
		
		// Average grade is calculated by the accumulated grade points divided by the number of inputs
		averageGrade = totalGrade/input;
		
		// Printf was used to limit the decimal points to 2 points.
		System.out.printf("The average grade for the class is: " + "%.2f", averageGrade);

	}

}

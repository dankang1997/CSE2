import java.util.Scanner;

// This program will take 10 integer values from the user and find mean and median

public class methods {

	// This is the main method
	public static void main(String args[])
	{
		// This scanner will allow the program to take inputs
		Scanner n = new Scanner(System.in);
		int a = 10;
		int input1 = 0; int input2 = 0; int input3 = 0; int input4 = 0;
		int input5 = 0; int input6 = 0; int input7 = 0; int input8 = 0;
		int input9 = 0; int input10 = 0;
		int sum = 0;
		int fifth = 0; int sixth = 0;

		System.out.println("Please input your set of numbers.");

		// This for loop will help us store values
		for(int x=0; x<1 ; x++)
		{
			input1 = n.nextInt();
			input2 = n.nextInt();
			input3 = n.nextInt();
			input4 = n.nextInt();
			input5 = n.nextInt();
			input6 = n.nextInt();
			input7 = n.nextInt();
			input8 = n.nextInt();
			input9 = n.nextInt();
			input10 = n.nextInt();		
			
			fifth = input5;
			sixth = input6;
		}
		
		// These two variables are going to be later used as a seperate method
		double mean = mean(input1,input2,input3,input4,input5,input6,input7,input8,input9,input10,a);
		double median = median(fifth, sixth);
		
		
		// After using the mean and median method, it will print out the mean and media
		System.out.println("Mean is: " +mean+ " " + "Median is: " + median);
	}
	
	// This is the mean method that will calculate the mean
	public static double mean(int input1,int input2,int input3,int input4,int input5,int input6,int input7,int input8,int input9,int input10, int a) {
	    
		return ((input1+input2+input3+input4+input5+input6+input7+input8+input9+input10)/a);
	}
	// This is the median method that will calculate the median
	public static double median(int fifth, int sixth)
	{
		return ((fifth + sixth)/2);
	}
	
}

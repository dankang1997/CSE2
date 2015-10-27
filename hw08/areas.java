import java.util.Scanner;

// This program will intake values from the user and let the user select what kind of shape they want to find the
// area of.


public class areas {
 
    // This is the main class
	public static void main(String args[]){
		
		// This is the scanner that will allow the program to get values from the user
		Scanner n = new Scanner(System.in);
		
		// This for loop will keep going and ask the user for new inputs unless the user wants to exit the program
		for(int x=1; x>0; x++)
		{
        
        // This line asks the user for the shape and stores its value
		System.out.println("What shape do you want?");
		String shape = n.nextLine();
		
		// If the user inputs circle as the shape, this if statement will run
		if(shape.equals("circle") || shape.equals("Circle"))
		{
			System.out.println("What is the radius?");
			int radius = n.nextInt();
			
			// After getting the needed information, it sends it to the area method
			double area = area(radius);
			
			System.out.println("The area is: " +area);
		}
		
		// If the user inputs rectangle as the shape, this if statement will run
		else if(shape.equals("rectangle") || shape.equals("Rectangle"))
		{
			System.out.println("What is the length?");
			int length = n.nextInt();
			System.out.println("What isthe width?");
			int width = n.nextInt();
			
			//After getting the needed information, it sends it to the area method
			double area = area(length,width);
			
			System.out.println("The area is: " +area);
		}
		
		// If the user inputs trapezoid as the shape, this if statement will run
		else if(shape.equals("trapezoid") || shape.equals("Trapezoid"))
		{
			System.out.println("What is the height?");
			int height = n.nextInt();
			System.out.println("What is base1?");
			int base1 = n.nextInt();
			System.out.println("What is base2?");
			int base2 = n.nextInt();
			
			//After getting the needed information, it sends it to the area method
			double area = area(height,base1,base2);
			
			System.out.println("The area is: " +area);	
		}
		
		// This if statement is here so the user can exit the program should he/she desires
 		else if(shape.equals("exit") || shape.equals("Exit"))
		{
			System.exit(0);
		}
		
		// This else statement is here just in case the user inputs wrong shape type
		else 
		{
			System.out.println("Please select from the following:");
			System.out.println("Circle, Rectangle, Trapezoid");
			System.out.println(" ");
			System.out.println("If you wish to exit the program, please type: Exit");
			System.out.println(" ");
		}
		}

	}
	
	// This is the first method, which will run once circle is selected
	public static double area(int radius){
		
		return Math.PI*(radius*radius);
	}
	
	// This is the second method, which will run once rectangle is selected
	public static double area(int length, int width){
		
		return length*width;
	}
	
	// This is the third method, which will run once trapezoid is selected
	public static double area(int height, int base1, int base2){
		
		return (((double)base1+(double)base2)/2)*height;
	}
	
}

import java.util.Scanner;

// Dan Kang
// Hw 03
// This program will ask the user for the height, length, and width of the block
// Then it will calculate its volume and surface area
public class Block {
	
	public static void main (String args[]){
		
		// This scanner will take values from the user
		Scanner input = new Scanner(System.in);
		
		// I used l instead of length to save time
		System.out.println("What is the length?");
		double l = input.nextDouble();
		
		// w instead of width
		System.out.println("What is the width?");
		double w = input.nextDouble();
				
		//h instead of height		
		System.out.println("What is the height?");
		double h = input.nextDouble();
		
		// These are the equations used to find out the volume and the surface area
		double volume = l*w*h;
		double surfaceArea = 2*((w*l)+(h*l)+(h*w));
		
		System.out.println("The dimension of the block is " +l + " x " + w +" x " + h);
		System.out.println("The volume of the block is " +volume);
		System.out.println("The Surface Area of the block is: " + surfaceArea);
		
	}

}

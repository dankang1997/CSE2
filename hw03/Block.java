import java.util.Scanner;

// Dan Kang
// Hw 03
// This program will ask the user for the height, length, and width of the block
// Then it will calculate its volume and surface area
public class Block {
	
	public static void main (String args[]){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the length?");
		double l = input.nextDouble();
		
		System.out.println("What is the width?");
		double w = input.nextDouble();
				
		System.out.println("What is the height?");
		double h = input.nextDouble();
		
		double volume = l*w*h;
		double surfaceArea = 2*((w*l)+(h*l)+(h*w));
		
		System.out.println("The dimension of the block is " +l + " x " + w +" x " + h);
		System.out.println("The volume of the block is " +volume);
		System.out.println("The Surface Area of the block is: " + surfaceArea);
		
	}

}

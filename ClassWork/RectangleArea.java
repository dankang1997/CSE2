import java.util.Scanner;


public class RectangleArea {

	public static void main(String args[]){
		
		
		int width;
		int height;
		Scanner n = new Scanner(System.in);
		
		System.out.println("What is the width of the rectangle?");
		width = n.nextInt();
		
		System.out.println("What is the height of the rectangle?");
		height = n.nextInt();
				
		
		System.out.println("The area of the rectangle is: " + width*height + " Units^2");
		
	}
	
	
}
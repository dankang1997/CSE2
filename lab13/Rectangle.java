
public class Rectangle {

    // These are the non static global variables
	public double width;
	public double height;

	// This is the method to set the width
	public void setWidth(double x)
	{
		width = x;
	}
	
	// This is the method to set the height
	public void setHeight(double y)
	{
		height = y;
	}
	
	// This is the method to get the area
	public double getArea()
	{
		return height*width;
	}
	
	// This is the main method
	public static void main(String args[])
	{
	    // A new Rectangle is created
		Rectangle r1 = new Rectangle();
		
		// We give the values to set the Height and the Width for the Rectangle r1
		r1.setHeight(5.3);
		r1.setWidth(7.3);
		
		System.out.println("The area of the rectangle is: " + r1.getArea());
	}
	
}

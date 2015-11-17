import java.util.Scanner;


public class move_array {

	public static void main(String args[])
	{
		Scanner n = new Scanner(System.in);

		System.out.println("How big do you want the array to be?");
		int size = n.nextInt();

		// Checks if the number input is >0
		try{

			int check = size/size;

		}catch (ArithmeticException e)
		{
			System.out.println("You cannont have an array the size of 0:  " + e); 
			System.out.println("Please restart the program");
			System.exit(0);
		}

		// Creates a new array with the given size
		int[] array1 = new int[size];

		// assigns random value from 0-100 to the array
		for(int x= 0; x<size; x++)
		{
			array1[x] = (int)(Math.random()*100);
		}

		// Prints the array
		System.out.println("The current array is: ");
		for(int x = 0; x<size; x++)
		{
			System.out.println(array1[x]);
		}

		// Asks for the value of the index to move
		System.out.println("Which index do you want to move?");
		int index = n.nextInt();
		
		// This is the value we are going to move
		int movedValue = array1[index];

		// This checks for if the index is within the array's size
		try{

			array1[index] = 0;

		}catch (ArrayIndexOutOfBoundsException f)
		{
			System.out.println("Index you want is out of the array's size:  " + f); 
			System.out.println("Please restart the program");
			System.exit(0);
		}


		// Creates a new array to store new data
		int[] array2 = new int[size];

		// This keeps the values until the index value is reached
		for(int x = 0; x<index; x++)
		{
			array2[x] = array1[x];
		}

		// This moves the value at index to the end
		if(index == index)
		{
			array2[size-1] = movedValue;
		}

		// This moves the values after index up to fill the void
		for(int z = index; z<size-1; z++)
		{
			array2[z] = array1[z+1];
		}


		// Prints out the moved array
		System.out.println("The array with the moved value is: ");
		for(int x = 0; x<size; x++)
		{
			System.out.println(array2[x]);
		}

	}
}


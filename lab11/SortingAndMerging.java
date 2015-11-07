import java.util.Arrays;

// This program will take two arrays, array1 and array2 then sort in an ascending order.
// Then it will combine array1 and array2 to make array3 then sort that as well.

public class SortingAndMerging {

	public static void main(String args[])
	{	
		int[] array3 = new int[30];
		int[] array1 = new int[20];
		// This for loops will give make and give random values to the array1.
		for(int x=0; x<20; x++)
		{
			array1[x] = (int)(Math.round((Math.random()*100)));
			// This will add array1's value to array3
			array3[x] = array1[x];
		}

		int[] array2 = new int[10];
		// This for loops will give make and give random values to the array2.
		for(int y=0; y<10; y++)
		{
			array2[y] = (int)(Math.round((Math.random()*100)));
			// This will add array2's value to array3 after array1's values
			array3[y+20] = array2[y];
		}
		// This calls to the sort method
		sort(array1,array2,array3);


		// This will print out the array1
		System.out.println("The sorted array1 is: ");
		for(int x= 0; x<20; x++)
		{
			System.out.println(array1[x]); 
		}
		
		// This will print out the array2
		System.out.println("The sorted array2 is:");
		for(int y = 0; y<10; y++)
		{
			System.out.println(array2[y]);
		}
		
		// This will print out the array3
		System.out.println("The sorted array for array1 and array2 is: ");
		for(int z = 0; z<30; z++)
		{
			System.out.println(array3[z]);
		}

	}

	// This is the sort method that will sort the values
	public static void sort(int[] array1, int[] array2, int[] array3)
	{
		Arrays.sort(array1);
		Arrays.sort(array2);
		Arrays.sort(array3);
	}

}
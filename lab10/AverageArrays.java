import java.util.Scanner;


public class AverageArrays {

	public static void main(String args[]){

		Scanner input = new Scanner(System.in);

		System.out.println("How big do you want the array to be?");
		int n = input.nextInt();
		int sum = 0;
		int average = 0;

		int[] array = new int[n];

		for(int x=0; x<n; x++)
		{
			array[x] = (int)(Math.round((Math.random()*100)));
		}

		System.out.println("The array values are:");
		for(int x= 0; x<n; x++)
		{
			System.out.println(array[x]);
		}
		
		for(int x=0; x<n; x++)
		{
			sum += array[x];
			average = sum/n;
		}
		System.out.println("The average is: " + average);
		
		

		System.out.println("Values greater than avg :");
		for(int x =0; x<n; x++)
		{
			if(array[x]>=average)
			{
				System.out.println(array[x]);
			}
		}
	}
}

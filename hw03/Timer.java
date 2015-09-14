// Dan Kang
// HW 03
// This is a timer program that will calculate how much time you have till dinner.

import java.util.Scanner;

public class Timer {

	public static void main(String args[]){
		
		// The Scanner will intake values from the user
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the current time? (In millitary time)");
		int currentTime = input.nextInt();
		
		System.out.println("When is dinner? (In millitary time)");
		int dinnerTime = input.nextInt();
		
		// This was done to separate the hours from minutes
		int currentHour = currentTime/100;
		int dinnerHour = dinnerTime/100;
		int hourLeft = dinnerHour - currentHour;
		
		int currentMin = currentTime%100;
		int dinnerMin = dinnerTime%100;
		// The absolute value was used below because it cannot return negative minutes
		int minLeft = Math.abs(dinnerMin-currentMin);
		// This if statement was used because time is in the 60 interval instead of the 100 interval
		if(minLeft>60)
		{
			minLeft -=60;
			hourLeft++;
		}
		// This if statement was also used because the time is in 60 invervals
		if(currentMin>dinnerMin)
		{
			minLeft = 60-minLeft;
			hourLeft--;
		}
		
		System.out.println("You have " + hourLeft + " hour(s) and "+ minLeft + " minute(s) until dinner");
		// This program could have been shorter if the hours and minutes ran on the 100 scale instead of the 60 scale.
		// Programming the hour part was easy. But the minutes part needed more adjustments.
	}
	
}

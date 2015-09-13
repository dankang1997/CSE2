// Dan Kang
// HW 03
// This is a timer program that will calculate how much time you have till dinner.

import java.util.Scanner;

public class Timer {

	public static void main(String args[]){
		
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
		int minLeft = Math.abs(dinnerMin-currentMin);
		if(minLeft>60)
		{
			minLeft -=60;
			hourLeft++;
		}
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

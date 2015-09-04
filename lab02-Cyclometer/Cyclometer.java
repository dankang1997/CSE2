// Kyungmook (Dan) Kang
// 9/4/2015
// CSE 002 Section 310
// Lab 02 - Cyclometer

import java.util.Scanner;

// This is a java program where it acts as a bicycle cyclometer.
// It will measure 2 types of data (time elapsed [in seconds] and number of front wheel rotated)
// Then it will use those data to find number of minutes, counts for each trip, distance of each
// trip in miles, and total distance of two trips combined.


public class Cyclometer {
	
	public static void main(String args[]){
		
		Scanner n = new Scanner(System.in);  // This asks the user for their own input instead of my own values
	
	    System.out.println("How many seconds did it take for trip 1?");
		double trip1Time = n.nextDouble();  // time elapsed in seconds for trip 1
		
		System.out.println("How many seconds did it take for trip 2?");
		double trip2Time = n.nextDouble();  // time elapsed in seconds for trip 2
		
		System.out.println("How many front wheel rotation did it take for trip 1?");
		double trip1Rotation = n.nextDouble(); //number of times the front wheel has rotated for trip 1
		
		System.out.println("How many front wheel rotation did it take for trip 2?");
		double trip2Rotation = n.nextDouble(); //number of times the front wheel has rotated for trip 2
		
		double wheelDiameter = 30;
		double PI = 3.14159;
	    int secPerMin = 60;
	    int inchPerFoot = 12;
	    int footPerMile = 5280;
	    double distanceTrip1 = (trip1Rotation*wheelDiameter*PI)/(inchPerFoot*footPerMile);
	    double distanceTrip2 = (trip2Rotation*wheelDiameter*PI)/(inchPerFoot*footPerMile);
	    
	    
	    System.out.println("Trip 1 took " + trip1Time/secPerMin + " minutes and had " + trip1Rotation + " front wheel rotations");
	    System.out.println("Trip 2 took " + trip2Time/secPerMin + " minutes and had " + trip2Rotation + " front wheel rotations");
        System.out.println("The diameter of the wheel is " + wheelDiameter + " inches");
        System.out.println("Trip 1 took " + distanceTrip1 + " miles");
        System.out.println("Trip 2 tppl " + distanceTrip2 + " miles");
        System.out.println("The total distance was "+ (distanceTrip1+distanceTrip2));
	    
	    
	    
	    
		
		
	}

}
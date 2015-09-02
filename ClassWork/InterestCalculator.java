import java.util.Scanner;


public class InterestCalculator {
	
	public static void main(String args[]){
		
		Scanner n = new Scanner(System.in);
		double balance;
		double interestRate;
		
		System.out.println("What is the balance?");
		balance = n.nextDouble();
		
		System.out.println("What is the interest %?");
		interestRate = (n.nextDouble())*0.01;
		
		double interest = balance*interestRate;
		
		System.out.println("Your interest is: " + interest);
		System.out.println("Your total total balance is: " + (balance+interest));
		
		
		
	}

}
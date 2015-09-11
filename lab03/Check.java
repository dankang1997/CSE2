// This program will take user input of the total cost, amount of tip, how many ways they are spliting and
// compute those values to print out how much each person has to pay.



import java.util.Scanner;

public class Check{
    
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the original check amount. (Enter in the form of xx.xx)");
        double checkCost = input.nextDouble();
        
        System.out.println("Enter the percentage tip you are willing to pay. (Enter as a whole number in the form of xx)");
        double tipPercent = input.nextDouble();
        tipPercent /=100;
     
        System.out.println("Enter how many people are spliting up the bill");
        int numPeople = input.nextInt();
        
        double totalCost = checkCost*(1 + tipPercent);
        
        double costPerPerson = (totalCost/numPeople);
        int dollars = (int)costPerPerson;
        int dimes = (int)(costPerPerson*10)%10;
        int pennies = (int)(costPerPerson*100)%10;
   
        
        System.out.println("The total amount each person has to pay is: $" + dollars + "." + dimes + pennies);
        
    }
    
    
}
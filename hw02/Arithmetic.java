// This is a hw assignment due on Tuesday, Sept 8th
// We are to create an Arithmetic class that will calculate the total cost of items plus tax

public class Arithmetic{
    
    public static void main(String args[]){
        
        // amount of socks
        int socks = 10;
        // the cost per socks
        double sockCost = 2.75;
        // total cost for socks
        double totalSockCost = (((int)(socks*sockCost)*100)/100.0);
        // amount of glass
        int glass = 5;
        // the cost per glass
        double glassCost = 5.00;
        // total cost for glass
        double totalGlassCost = ((((int)glass*glassCost)*100)/100.0);
        
        // amount of box of envelope
        int envelope = 2;
        // the cost per envelope
        double envelopeCost = 3.50;
        // total cost for envelope
        double totalEnvelopeCost = ((((int)envelope*envelopeCost)*100)/100.0);
        
        //tax percent
        double taxPercent = 0.06;
       
        // This lists which item is being bought, the amount, the cost, total cost, and sales tax
        
        // Socks
        System.out.println("Item: Socks");
        System.out.println("Amount being bought: " + socks);
        System.out.println("Cost per Socks: $" + sockCost);
        System.out.println("Total cost for Socks: $" + totalSockCost);
        System.out.println("Sales tax for Socks: $" + (((int)(totalSockCost*taxPercent))*100)/100.0);
        
        // Glass
        System.out.println("Item: Glass");
        System.out.println("Amount being bought: " + glass);
        System.out.println("Cost per Glass: $" + glassCost);
        System.out.println("Total cost for Glass: $" + totalGlassCost);
        System.out.println("Sales tax for Glass: $" + (totalGlassCost*taxPercent));
        
        //Envelope
        System.out.println("Item: Envelope");
        System.out.println("Amount being bought: " + envelope);
        System.out.println("Cost per Envelope: $" + envelopeCost);
        System.out.println("Total cost for Envelope: $" + totalEnvelopeCost);
        System.out.println("Sales tax for Envelope: $" + (totalEnvelopeCost*taxPercent));
        
        // Total purchase cost
        double totalPurchaseCost = ((((int)totalEnvelopeCost+totalGlassCost+totalSockCost)*100)/100.00);
        double totalTax = ((((int)totalPurchaseCost*taxPercent)*100)/100.00);
        
        System.out.println("Cost of total purchase (before tax): $" + totalPurchaseCost);
        System.out.println("Total sales tax: $" + totalTax);
        System.out.println("Cost of total purchase (with tax): $" + (totalPurchaseCost+totalTax));
        
        
    }
}
/*
 Lab Activity 3 - Q1: Internet Delicatessen
 */
package la3;

import java.util.Scanner;

public class LA3q1 {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       String item = "";
       double price = 0.0;
       int choice = 0;
       double shippingPrice = 0;
       double total = 0;
       
       System.out.println("==Jack and Harry's Delicatessen==");
       System.out.print("Enter the item: ");
       item = s.nextLine();
       
       System.out.print("Enter the price of item: ");
       price = s.nextDouble();

       if(price < 10)
           shippingPrice = 2.00;
       else
           shippingPrice = 3.00;
                 
       System.out.println(("Overnight delivery?"));
       System.out.print("Press '1' for overnight delivery, '2' for regular delivery: ");
       choice = s.nextInt();

       if(choice == 1) //overnight shipping
           shippingPrice += 5.00;
                  
      total = price + shippingPrice;
       
       System.out.println("Invoice: ");
       System.out.println("\t"+item+"\t"+price);
       System.out.println("\tshipping   \t"+shippingPrice);
       System.out.println("\ttotal      \t"+total);
                  
    }
    
}

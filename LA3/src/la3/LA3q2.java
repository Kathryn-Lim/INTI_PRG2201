/*
Lab Activity 3 Q2 - Steam Engine Efficiency
 */
package la3;

import java.util.Scanner;

public class LA3q2 {
     public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
         float Tair, Tsteam,efficiency;        
         
         System.out.print("Input Air temperature in Kelvin: ");
         Tair = s.nextFloat();
         System.out.print("Input steam temperature: ");
         Tsteam = s.nextFloat();
         
         if(Tsteam < 373){
             efficiency = 0;
             System.out.println("Steam temp less than 373K, no steam.");
         }
         else
            efficiency = 1 - (Tair/Tsteam);
         
         System.out.println("Efficiency of steam engine: "+efficiency+"%");
     }
}

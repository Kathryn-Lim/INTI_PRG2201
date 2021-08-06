//Lab Activity week 2 - Q2 fahrenheit to celcius converter
package la2;

import java.util.Scanner;

public class Q2 {
      public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter a Fahrenheit value: ");
        double fahrenheit = keyboard.nextDouble();
        
        double celcius = (fahrenheit -32.0) * (5.0/9.0); 
        
        System.out.println("The temperature in Celcius is: " +celcius);
          
        
    }
}

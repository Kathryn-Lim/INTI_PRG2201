/*
Lab Activity 4  - Calculate factorial of number with while loop
 */
package la4;

import java.util.Scanner;

public class LA4q1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = 1;
        int j = 1;
        
        System.out.print("Enter a number: ");
        int num = s.nextInt();
        
        while(i<=num){  //until i reaches number
            j *= i;     //multiply number by i
            i++;       //increment i
        }
           
       System.out.println("Factorial of "+num+" is "+j);
        
    }
    
}

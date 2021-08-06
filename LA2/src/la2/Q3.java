// Lab Activity week 2 - Q3 lucky number from birthdate 
package la2;

import java.util.Scanner;

public class Q3 {
      public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter your birthdate in the form of a 4 digit number (DDMM)");
        System.out.print("Example: 28th February = 2802: ");
        int birthdate = in.nextInt();   //accepts value of birthdate
        int sum = 0;
        
        //from w3resource.com
        //while loop to get the individual digits of the integer
            while(birthdate > 0){
                sum += birthdate%10;    //sums the rightmost digit of the number.
                birthdate /= 10;        //divide number by 10 to decrease digit number by one.   
            }
            
         String result = (sum%2==0)? "even" : "odd"; 
         System.out.println("Your lucky number is "+sum);
         System.out.println("Your lucky number is an "+result+" number.");
        
    }
}

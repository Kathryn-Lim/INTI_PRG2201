package la1;

import java.util.Scanner;

public class LA1 {
    public static void main(String[] args) {
         // int num0, num1, num2, num3, num4;   //declare 5 integer variables
        int num0, num1, num2, num3;   //declare 5 integer variables
        //double num5;    //declare 1 double variables

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter 4 integer values: ");
        num0 = scan.nextInt();
        System.out.print("Enter next ");
        num1 = scan.nextInt();
         System.out.print("Enter next ");
        num2 = scan.nextInt();
         System.out.print("Enter next ");
        num3 = scan.nextInt();
       
        //assigns value to all variables
        // num0 = 16;
        // num1 = 22;
        // num2 = 394;
        // num3 = 53;
        // num4 = 43;
        // num5 = 6.19;

      //  double sum = num0 + num1 + num2 + num3 + num4 + num5;   //calculates the numbers
        double sum = num0 + num1 + num2 + num3;   //calculates the numbers
      //  double avg = sum/6; //calculates average of the 6 numbers
        double avg = sum/4; //calculates average of the 6 numbers

        System.out.println("The sum of the numbers is: " +sum);
        System.out.println("The average of the numbers is: " +avg);
    }
    
}

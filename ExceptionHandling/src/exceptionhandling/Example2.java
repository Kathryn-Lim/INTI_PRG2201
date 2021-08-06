
package exceptionhandling;

import java.util.Scanner;

public class Example2   {
       
    public static void main(String args[])
{
  String age;  // as how we enter using textfield
  Scanner input = new Scanner(System.in);
  int age1;
           try {
             System.out.print("Enter your age : ");
             age = input.nextLine();         
            // intentional error
            age1 = Integer.parseInt(age);

            // this line of code will never be reached
            System.out.println("Age  = " + age1);
           }
        catch (NumberFormatException nfe) {
            System.out.println("Cannot convert string to integer");
            age1 = 0;
            //throw nfe;
        }
         System.out.println("Age  = " + age1);
    }

}

